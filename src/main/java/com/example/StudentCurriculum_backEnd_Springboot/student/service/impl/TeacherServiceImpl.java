package com.example.StudentCurriculum_backEnd_Springboot.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Teacher;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.TeacherMapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Override
    public boolean isTeacherTrueFromTeacherJobId(String teacherJobId) {
        LambdaQueryWrapper<Teacher> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Teacher::getTeacherJobId, teacherJobId);
        List<Teacher> searchTeacherList = this.list(wrapper);
        if (searchTeacherList == null) {
            return false;
        } else {
            System.out.println(searchTeacherList);
            return true;
        }
    }

    @Override
    public Map<String, Object> getTeacherMapFormTeacherJobID(String teacherJobId) {
        Map<String,Object> teacherMap = new HashMap<>();
        LambdaQueryWrapper<Teacher> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Teacher::getTeacherJobId, teacherJobId);
        System.out.println(teacherJobId);
        List<Teacher> searchTeacherList = this.list(wrapper);
        teacherMap.put("data",searchTeacherList);
        return teacherMap;
    }

    @Override
    public boolean teacherDel(Teacher teacher) {
        LambdaQueryWrapper<Teacher> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Teacher::getTeacherJobId,teacher.getTeacherJobId());
        int teacherFlag = this.baseMapper.delete(wrapper);
        if (teacherFlag!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Map<String, Object> teacherUpdata(Teacher teacher) {
        LambdaQueryWrapper<Teacher> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Teacher::getTeacherJobId,teacher.getTeacherJobId());
        boolean teacherFlag = this.update(teacher,wrapper);
        if (teacherFlag){
            Teacher teacherList = this.getOne(wrapper);
            Map<String,Object> teacherMap = new HashMap<>();
            teacherMap.put("data",teacherList);
            return teacherMap;
        }
        return null;
    }
}
