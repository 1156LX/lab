package com.project.controller;

import com.project.entity.Student;
import com.project.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    /*
    学生登录
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public Student doLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
       Student student = studentService.studentLogin(username,password);
        if(student!=null) request.getSession().setAttribute("student",student);
        return student;
    }

    /*
       修改个人资料
     */
    @RequestMapping("/update")
    public int update(@RequestParam("file")MultipartFile file,HttpServletRequest request ){
        int state=studentService.updateStudent(file,request) ;
         return state;
    }
    /*
    修改密码
    */
    @RequestMapping("/changePassword")
    public int changePassword(HttpServletRequest request ){
        int state=studentService.changePassword(request);
        System.out.println(state);
        return state;
    }

    /*
    填写申请表
     */
    @RequestMapping("/apply")
    public int apply(HttpServletRequest request){
        return studentService.submitApl(request);
    }
}
