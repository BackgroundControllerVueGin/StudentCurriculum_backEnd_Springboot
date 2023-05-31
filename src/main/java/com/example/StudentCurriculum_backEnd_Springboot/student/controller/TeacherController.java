package com.example.StudentCurriculum_backEnd_Springboot.student.controller;

import com.example.StudentCurriculum_backEnd_Springboot.common.JsonResult;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.Teacher;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.ITeacherService;
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
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService iTeacherService;
    @PostMapping("/test")
    public Boolean teacherTest(@RequestBody String teacherJobId){
        System.out.println("teacherTest Running :"+teacherJobId);
        return iTeacherService.isTeacherTrueFromTeacherJobId(teacherJobId);
    }

    @GetMapping("/show")
    public JsonResult<List<Teacher>> teacherShow(){
        List<Teacher> teacherList= iTeacherService.list();
        return JsonResult.ResultSuccess(teacherList);
    }

    @PostMapping("/add")
    public JsonResult<Map<String,Object>> teacherAdd(@RequestBody Teacher teacher){
        boolean teacherFlag = iTeacherService.save(teacher);
        if (teacherFlag){
            return JsonResult.ResultSuccess(iTeacherService.getTeacherMapFormTeacherJobID(teacher.getTeacherJobId()));
        }
        return JsonResult.ResultFail(204,"找不到数据");
    }

    @PostMapping("/del")
    public JsonResult<Object> teacherDel(@RequestBody Teacher teacher){
        boolean teacherFlag = iTeacherService.teacherDel(teacher);
        if (teacherFlag){
            return JsonResult.ResultSuccess("删除成功 [ "+teacher.getTeacherJobId()+" ]");
        }
        return JsonResult.ResultFail("删除失败 [ "+teacher.getTeacherJobId() + " ]");
    }

    @PostMapping("/change")
    public JsonResult<Map<String,Object>> teacherChange(@RequestBody Teacher teacher){
        Map<String,Object> data = iTeacherService.teacherUpdata(teacher);
        if (data!=null){
            return JsonResult.ResultSuccess(data);
        }else {
            return JsonResult.ResultFail();
        }
    }
}
