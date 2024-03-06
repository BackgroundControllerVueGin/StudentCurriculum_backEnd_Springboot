package com.example.StudentCurriculum_backEnd_Springboot.student.service;

import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public interface ITeacherService extends IService<Teacher> {
    boolean isTeacherTrueFromTeacherJobId(String teacherJobId);

    Map<String,Object> getTeacherMapFormTeacherJobID(String teacherJobId);

    boolean teacherDel(Teacher teacher);

    Map<String,Object> teacherUpdata(Teacher teacher);
}
