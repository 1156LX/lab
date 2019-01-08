package com.project.service;


import com.project.entity.Teacher;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface ITeacherService {
    //用户登录
    public Teacher teacherLogin(String username, String password);

    //修改个人信息
    public int updateTeacher(MultipartFile file, HttpServletRequest request);

    //修改密码
    public int changePassword(HttpServletRequest request);
}
