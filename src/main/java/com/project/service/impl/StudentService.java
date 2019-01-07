package com.project.service.impl;


import com.project.entity.Student;
import com.project.mapper.StudentMapper;
import com.project.service.IStudentService;
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

    @Override
    public int updateStudent(MultipartFile file, HttpServletRequest request) {
        return 0;
    }

    @Override
    public int changePassword(HttpServletRequest request) {
        return 0;
    }
    /*

    注册

    @Override
    public int userReg(MultipartFile file,HttpServletRequest request) {
        String username=request.getParameter("username");
        String password1=request.getParameter("password1");
        String password2=request.getParameter("password2");
        if(username==null||password1==null )return -1;
        User user1=userMapper.findByUsername("username");
        if(null!=user1 || password1.equals(password2)==false ){
            return 0 ;
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password1);
        user.setEmail(request.getParameter("email") );
        user.setPhone(request.getParameter("phone") );
        userMapper.addUser(user);
        User user2=userMapper.findByUsername(username);
        int id=user2.getId();
        String pic1="D:/img/"+id+".jpg";
        String pic="/images/"+id+".jpg";
        if(FileUtil.upload(file,pic1)==1){
            user2.setPic(pic);
        }else System.out.println("上传失败");
        userMapper.updateUser(user2);
        System.out.println(user2);
        return 1;
    }


    修改个人信息

    @Override
    public int  updateUser(MultipartFile file,HttpServletRequest request) {
        User user= (User) request.getSession().getAttribute("user");
        String username=request.getParameter("username");
        if(username==null)return -1;
        User user1=userMapper.findByUsername(username);
        if(user1!=null)return 0;
        user.setUsername(request.getParameter("username") );
        user.setEmail(request.getParameter("email") );
        user.setPhone(request.getParameter("phone") );
        String pic1="D:/img/"+user.getId()+".jpg";
        String pic="/images/"+user.getId()+".jpg";
        if(FileUtil.upload(file,pic1)==1){
            user.setPic(pic);
        }else System.out.println("上传失败");
        System.out.println(user);
        userMapper.updateUser(user);
        return 1;

    }


    修改密码

    @Override
    public int changePassword(HttpServletRequest request) {
        String password=request.getParameter("password");
        String password1=request.getParameter("password1");
        String password2=request.getParameter("password2");
        User user= (User) request.getSession().getAttribute("user");
        System.out.println(user);
        if(user.getPassword().equals(password)==false ){
            return -1;
        }
        else if(password1.equals(password2)==false ){
            return 0;
        }
        else{
             user.setPassword(password1);
             userMapper.updateUser(user);
             return 1;
        }
    }


     */

}
