package com.example.StudentCurriculum_backEnd_Springboot.student.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.User;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.UserMapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

    @Override
    public Map<String, Object> login(User user) {
        //sql查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getJobId,user.getJobId());
        wrapper.eq(User::getUserPassword,user.getUserPassword());
        User loginUser = this.baseMapper.selectOne(wrapper);

        //存入redis
        if (loginUser!=null){
            String key = "user:token123";
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
            if (Integer.parseInt(loginUser.getUserId())<=2000){
                userName = this.baseMapper.getStudentNameByJobID(loginUser.getJobId());
            }
            else if (Integer.parseInt(loginUser.getUserId())<=3000){
                userName = this.baseMapper.getTeacherNameByJobID(loginUser.getJobId());
            }else {
                userName.add("admin");
            }
            data.put("userName",userName);
            return data;
        }
        return null;
    }
}
