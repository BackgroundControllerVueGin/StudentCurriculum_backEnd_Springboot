package com.example.StudentCurriculum_backEnd_Springboot;


import com.example.StudentCurriculum_backEnd_Springboot.student.entity.User;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;


@SpringBootTest
class StudentCurriculumBackEndSpringbootApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
