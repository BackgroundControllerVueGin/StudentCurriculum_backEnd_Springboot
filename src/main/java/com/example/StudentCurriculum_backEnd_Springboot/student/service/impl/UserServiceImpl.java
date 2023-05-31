package com.example.StudentCurriculum_backEnd_Springboot.student.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.StudentCurriculum_backEnd_Springboot.common.TokenCommon;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Student;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.User;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.UserMapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.IStudentService;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.ITeacherService;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private IStudentService iStudentService;
    @Autowired
    private ITeacherService iTeacherService;
    @Override
    public Map<String, Object> login(User user) {
        //sql查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUserJobId,user.getUserJobId());
        wrapper.eq(User::getUserPassword,user.getUserPassword());
        User loginUser = this.baseMapper.selectOne(wrapper);

        //存入redis
        if (loginUser!=null){
            String key = TokenCommon.createToken(loginUser.getUserJobId(),loginUser.getUserPassword());
            redisTemplate.opsForValue().set(key,loginUser,30, TimeUnit.MINUTES);

            Map<String,Object> data = new HashMap<>();
            data.put("data",loginUser);
            data.put("token",key);
            return data;
        }
        return null;
    }

    @Override
    public Map<String, Object> info(String token) {
        Object obj = redisTemplate.opsForValue().get(token);
        if (obj!=null){
            User loginUser = JSON.parseObject(JSON.toJSONString(obj),User.class);
            Map<String,Object>data = new HashMap<>();
            data.put("userID",loginUser.getUserId());
            data.put("userCreateOfTime",loginUser.getUserCreateOfTime());
            data.put("userRoleId",loginUser.getUserRoleId());

            List<String> userName =null;
            if (Integer.parseInt(loginUser.getUserJobId())>=2000&&Integer.parseInt(loginUser.getUserJobId())<=3000){
                userName = this.baseMapper.getTeacherNameByJobID(loginUser.getUserJobId());
                System.out.println("returntoken:"+TokenCommon.getUserIdFormToken(token));
            }
            else if (Integer.parseInt(loginUser.getUserJobId())>=3000){
                userName = this.baseMapper.getStudentNameByJobID(loginUser.getUserJobId());
                System.out.println("returntoken:"+TokenCommon.getUserIdFormToken(token));
            }else {
                userName.add("admin");
            }
            data.put("userName",userName);
            return data;
        }
        return null;
    }

    @Override
    public Map<String, Object> register(User user) {
        Map<String, Object> registerData = new HashMap<>();
        int userJobId = Integer.parseInt(user.getUserJobId());
        //查询user表中相关学生数量
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUserJobId, user.getUserJobId());
        List<User> searchUserList = this.list(wrapper);
        //查询学生和老师数据库中是否存在数据，否则查询user中是否有同名数据
        boolean flag = false;
        if (userJobId>=2000&&userJobId<=3000&&searchUserList.size()<1){
            flag =iTeacherService.isTeacherTrueFromTeacherJobId(user.getUserJobId());

        }else if (userJobId>=3000&&searchUserList.size()<1){
            flag =iStudentService.isStudentTrueFromStudentJobId(user.getUserJobId());
        }else {
            if (searchUserList.size()<1){
                flag = true;
            }
        }

        if (flag) {
            //学生信息录入
            boolean data = this.save(user);
            if (data) {
                //查询录入成功的数据
                User registerUser = this.getOne(wrapper);
                if (registerUser != null) {
                    registerData.put("data", registerUser);
                    System.out.println(registerData);
                    return registerData;
                } else {
                    registerData.put("detailMessage","数据录入成功，但寻找不到该用户，请联系管理员");
                    return registerData;
                }
            } else {
                registerData.put("detailMessage", "用户数据录入失败");
                return registerData;
            }
        }else {
            registerData.put("detailMessage","信息录入失败，学生和教师数据中没有该用户，或者管理员数据冲突");
            return registerData;
        }
    }
}
