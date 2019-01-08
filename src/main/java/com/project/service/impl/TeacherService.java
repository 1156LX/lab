package com.project.service.impl;

import com.project.entity.Student;
import com.project.entity.Teacher;
import com.project.mapper.TeacherMapper;
import com.project.service.ITeacherService;
import com.project.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    /*
       登录
    */
    @Override
    public Teacher teacherLogin(String username, String password) {
        Teacher teacher=teacherMapper.findByUsername(username);
        if(null==teacher){
            return null;
        }
        else{
            if(teacher.getPassword().equals(password))return teacher;
            else return null;
        }
    }


    /*
     修改个人信息
      */
    @Override
    public int  updateTeacher(MultipartFile file,HttpServletRequest request) {
        Teacher teacher= (Teacher) request.getSession().getAttribute("teacher");
        String username=request.getParameter("username");
        if(username==null)return -1;
        Teacher teacher1 =teacherMapper.findByUsername(username);
        if(teacher1!=null)return 0;
        teacher.setUsername(request.getParameter("username") );
        teacher.setEmail(request.getParameter("email") );
        teacher.setPhone(request.getParameter("phone") );
        String pic1="D:/img/"+"teacher"+teacher.getId()+".jpg";
        String pic="/images/"+"teacher"+teacher.getId()+".jpg";
        if(FileUtil.upload(file,pic1)){
            teacher.setImg(pic) ;
        }else System.out.println("上传失败");
        System.out.println(teacher);
        teacherMapper.updateUser(teacher);
        return 1;
    }

    /*
    修改密码
    */
    @Override
    public int changePassword(HttpServletRequest request) {
        String password=request.getParameter("password");
        String password1=request.getParameter("password1");
        String password2=request.getParameter("password2");
        Teacher teacher= (Teacher) request.getSession().getAttribute("teacher");
        System.out.println(teacher);
        if(teacher.getPassword().equals(password)==false ){
            return -1;
        }
        else if(password1.equals(password2)==false ){
            return 0;
        }
        else{
            teacher.setPassword(password1);
            teacherMapper.updateUser(teacher);
            return 1;
        }
    }

}
