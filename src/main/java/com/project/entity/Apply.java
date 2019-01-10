package com.project.entity;

import javax.persistence.*;

/*
    学生申请
 */
@Entity
@Table(name = "apply")
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long  lab_id;
    private long student_id;
    private String name;//学生姓名
    private String SClass;//学生班级
    private String email;//学生邮件
    private String phone;//学生电话
    private String introduce;//个人介绍
    private String prize;//个人奖项

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLab_id() {
        return lab_id;
    }

    public void setLab_id(long lab_id) {
        this.lab_id = lab_id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSClass() {
        return SClass;
    }

    public void setSClass(String SClass) {
        this.SClass = SClass;
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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", lab_id=" + lab_id +
                ", student_id=" + student_id +
                ", name='" + name + '\'' +
                ", SClass='" + SClass + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", introduce='" + introduce + '\'' +
                ", prize='" + prize + '\'' +
                '}';
    }
}
