package com.example.StudentCurriculum_backEnd_Springboot.student.service;

import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Student;
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
public interface IStudentService extends IService<Student> {
    boolean isStudentTrueFromStudentJobId(String studentJobId);

    Map<String,Object> getStudentMapFormStudentJobID(String studentJobId);

    boolean studentDel(Student student);

    Map<String,Object> studentUpdata(Student student);
}
