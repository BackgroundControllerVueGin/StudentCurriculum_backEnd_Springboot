package com.example.StudentCurriculum_backEnd_Springboot.student.service.impl;

import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Course;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.CourseMapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

}
