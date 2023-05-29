package com.example.StudentCurriculum_backEnd_Springboot.student.mapper;

import com.example.StudentCurriculum_backEnd_Springboot.student.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
public interface UserMapper extends BaseMapper<User> {
    public List<String> getTeacherNameByJobID(String jobId);

    public List<String> getStudentNameByJobID(String jobID);
}
