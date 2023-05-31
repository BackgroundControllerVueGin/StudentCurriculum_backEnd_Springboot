package com.example.StudentCurriculum_backEnd_Springboot.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Student;
import com.example.StudentCurriculum_backEnd_Springboot.student.mapper.StudentMapper;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public boolean isStudentTrueFromStudentJobId(String studentJobId) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getStudentJobId, studentJobId);
        System.out.println(studentJobId);
        List<Student> searchStudentList = this.list(wrapper);
        System.out.println(searchStudentList==null);
        if (searchStudentList == null) {
            return false;
        } else {
            System.out.println(searchStudentList);
            return true;
        }
    }

    @Override
    public Map<String, Object> getStudentMapFormStudentJobID(String studentJobId) {
        Map<String,Object> studentMap = new HashMap<>();
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getStudentJobId, studentJobId);
        System.out.println(studentJobId);
        List<Student> searchStudentList = this.list(wrapper);
        studentMap.put("data",searchStudentList);
        return studentMap;
    }

    @Override
    public boolean studentDel(Student student) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getStudentJobId,student.getStudentJobId());
        int teacherFlag = this.baseMapper.delete(wrapper);
        if (teacherFlag!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Map<String, Object> studentUpdata(Student student) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getStudentJobId,student.getStudentJobId());
        boolean studentFlag = this.update(student,wrapper);
        if (studentFlag){
            Student studentList = this.getOne(wrapper);
            Map<String,Object> studentMap = new HashMap<>();
            studentMap.put("data",studentList);
            return studentMap;
        }
        return null;
    }
}
