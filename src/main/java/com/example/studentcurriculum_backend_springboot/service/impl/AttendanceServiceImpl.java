package com.example.StudentCurriculum_backEnd_Springboot.service.impl;

import com.example.StudentCurriculum_backEnd_Springboot.entity.Attendance;
import com.example.StudentCurriculum_backEnd_Springboot.mapper.AttendanceMapper;
import com.example.StudentCurriculum_backEnd_Springboot.service.IAttendanceService;
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
public class AttendanceServiceImpl extends ServiceImpl<AttendanceMapper, Attendance> implements IAttendanceService {

}
