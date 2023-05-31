package com.example.StudentCurriculum_backEnd_Springboot.student.controller;

import com.example.StudentCurriculum_backEnd_Springboot.common.JsonResult;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Student;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @PostMapping("/test")
    public Boolean studentTest(@RequestBody String studentJobId){
        System.out.println("studentTest Running :"+studentJobId);
        return iStudentService.isStudentTrueFromStudentJobId(studentJobId);
    }

    @GetMapping("/show")
    public JsonResult<List<Student>> studentShow(){
        List<Student> studentList= iStudentService.list();
        return JsonResult.ResultSuccess(studentList);
    }

    @PostMapping("/add")
    public JsonResult<Map<String,Object>> studentAdd(@RequestBody Student student){
        boolean studentFlag = iStudentService.save(student);
        if (studentFlag){
            return JsonResult.ResultSuccess(iStudentService.getStudentMapFormStudentJobID(student.getStudentJobId()));
        }
        return JsonResult.ResultFail(204,"找不到数据");
    }

    @PostMapping("/del")
    public JsonResult<Map<String,Object>> studentDel(@RequestBody Student student){
        boolean teacherFlag = iStudentService.studentDel(student);
        if (teacherFlag){
            return JsonResult.ResultSuccess("删除成功 [ "+student.getStudentJobId()+" ]");
        }
        return JsonResult.ResultFail("删除失败 [ "+student.getStudentJobId() + " ]");
    }

    @PostMapping("/change")
    public JsonResult<Map<String,Object>> studentChange(@RequestBody Student student){
        Map<String,Object> data = iStudentService.studentUpdata(student);
        if (data!=null){
            return JsonResult.ResultSuccess(data);
        }else {
            return JsonResult.ResultFail();
        }
    }
}
