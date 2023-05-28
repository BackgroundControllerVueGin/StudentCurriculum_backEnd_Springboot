package com.example.StudentCurriculum_backEnd_Springboot.service.impl;

import com.example.StudentCurriculum_backEnd_Springboot.entity.User;
import com.example.StudentCurriculum_backEnd_Springboot.mapper.UserMapper;
import com.example.StudentCurriculum_backEnd_Springboot.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
