package com.project.service;

import com.project.entity.Student;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface IStudentService {
    //用户登录
    public Student studentLogin(String username, String password);

    //修改个人信息
    public int updateStudent(MultipartFile file, HttpServletRequest request);

    //修改密码
    public int changePassword(HttpServletRequest request);

    //提交申请
    public int submitApl(HttpServletRequest request);

}
