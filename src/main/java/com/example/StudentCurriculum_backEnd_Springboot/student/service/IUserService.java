package com.example.StudentCurriculum_backEnd_Springboot.student.service;

import com.example.StudentCurriculum_backEnd_Springboot.student.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
public interface IUserService extends IService<User> {

    Map<String, Object> login(User user);

    Map<String, Object> info(String token);
}
