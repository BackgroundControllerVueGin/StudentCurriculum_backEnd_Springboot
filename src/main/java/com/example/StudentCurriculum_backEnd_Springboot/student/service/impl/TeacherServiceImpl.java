package com.example.StudentCurriculum_backEnd_Springboot.student.service.impl;

import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Teacher;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.TeacherMapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

}
