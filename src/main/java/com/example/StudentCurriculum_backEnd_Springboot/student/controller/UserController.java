package com.example.StudentCurriculum_backEnd_Springboot.student.controller;

import com.example.StudentCurriculum_backEnd_Springboot.common.JsonResult;
import com.example.StudentCurriculum_backEnd_Springboot.student.entity.User;
import com.example.StudentCurriculum_backEnd_Springboot.student.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/show")
    public JsonResult<List<User>> userShow(){
        List<User> list = iUserService.list();
        System.out.println("running");
        return JsonResult.ResultSuccess(list);
    }

    @PostMapping("/login")
    public JsonResult<Map<String,Object>> userLogin(@RequestBody User user){
        Map<String,Object> data = iUserService.login(user);
        if (data !=null){
            return JsonResult.ResultSuccess(data);
        }else {
            return JsonResult.ResultFail("用户名或者密码错误");
        }
    }

    @GetMapping("/info")
    public JsonResult<Map<String,Object>> userInfor(@RequestParam("token") String token){
        //根据token获取用户信息redis
        Map<String,Object> data = iUserService.info(token);
        if (data!=null){
            return JsonResult.ResultSuccess(data);
        }else {
            return JsonResult.ResultFail(403,"登录信息无效");
        }
    }
}
