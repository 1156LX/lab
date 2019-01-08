package com.project.service.impl;


import com.project.entity.Student;
import com.project.mapper.StudentMapper;
import com.project.service.IStudentService;
import com.project.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    /*
       登录
    */
    @Override
    public Student studentLogin(String username, String password) {
        Student student =studentMapper.findByUsername(username);
         if(null==student){
             return null;
         }
         else{
             if(student .getPassword().equals(password))return student;
             else return null;
         }
    }


   /*
    修改个人信息
     */
    @Override
    public int  updateStudent(MultipartFile file,HttpServletRequest request) {
        Student student= (Student) request.getSession().getAttribute("student");
        String username=request.getParameter("username");
        if(username==null)return -1;
        Student student1 =studentMapper.findByUsername(username);
        if(student1!=null)return 0;
        student.setUsername(request.getParameter("username") );
        student.setEmail(request.getParameter("email") );
        student.setPhone(request.getParameter("phone") );
        String pic1="D:/img/"+"student"+student.getId()+".jpg";
        String pic="/images/"+"student"+student.getId()+".jpg";
        if(FileUtil.upload(file,pic1)){
            student.setImg(pic) ;
        }else System.out.println("上传失败");
        System.out.println(student);
        studentMapper.updateUser(student);
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
        Student student= (Student) request.getSession().getAttribute("student");
        System.out.println(student);
        if(student.getPassword().equals(password)==false ){
            return -1;
        }
        else if(password1.equals(password2)==false ){
            return 0;
        }
        else{
            student.setPassword(password1);
            studentMapper.updateUser(student);
             return 1;
        }
    }


}
