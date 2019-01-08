package com.project.controller;

import com.project.entity.Student;
import com.project.entity.Teacher;
import com.project.service.impl.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    /*
    老师登录
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public Teacher doLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        Teacher teacher=teacherService.teacherLogin(username,password);
        return teacher;
    }

    /*
       修改个人资料
     */
    @RequestMapping("/update")
    public int update(@RequestParam("file")MultipartFile file, HttpServletRequest request ){
        int state=teacherService.updateTeacher(file,request);
        return state;
    }
    /*
    修改密码
    */
    @RequestMapping("/changePassword")
    public int changePassword(HttpServletRequest request ){
        int state=teacherService.changePassword(request);
        System.out.println(state);
        return state;
    }

}
