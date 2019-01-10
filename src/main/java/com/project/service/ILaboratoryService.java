package com.project.service;

import com.project.entity.Student;
import com.project.entity.Teacher;

import java.util.List;

public interface ILaboratoryService {

    public List<Teacher>allTeachers(int id);//所有老师

    public List<Student>allStudents(int id);//所有学生

}
