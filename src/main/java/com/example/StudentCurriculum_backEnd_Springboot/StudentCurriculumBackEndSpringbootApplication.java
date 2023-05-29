package com.example.StudentCurriculum_backEnd_Springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.StudentCurriculum_backEnd_Springboot.student.mapper")
public class StudentCurriculumBackEndSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentCurriculumBackEndSpringbootApplication.class, args);
    }

}
