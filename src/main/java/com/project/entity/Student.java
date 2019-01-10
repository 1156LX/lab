package com.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private long id;
    private String username;//学号
    private String password;//密码
    private String name;//名字
    private String sex;//性别
    private int age;//年龄
    private String college;//学院
    private String Sclass;//班级
    private String email;//邮箱
    private String phone;//电话
    private String info;//个人简介
    private int labId;//所在实验室编号
    private String img;//图片的地址

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSclass() {
        return Sclass;
    }

    public void setSclass(String sclass) {
        Sclass = sclass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", Sclass='" + Sclass + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", info='" + info + '\'' +
                ", labId=" + labId +
                ", img='" + img + '\'' +
                '}';
    }
}
