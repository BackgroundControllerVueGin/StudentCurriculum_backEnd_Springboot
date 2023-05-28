package com.example.StudentCurriculum_backEnd_Springboot.service.impl;

import com.example.StudentCurriculum_backEnd_Springboot.entity.Dean;
import com.example.StudentCurriculum_backEnd_Springboot.mapper.DeanMapper;
import com.example.StudentCurriculum_backEnd_Springboot.service.IDeanService;
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
public class DeanServiceImpl extends ServiceImpl<DeanMapper, Dean> implements IDeanService {

}
