package com.project.mapper;

import com.project.entity.Student;
import com.project.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LaboratoryMapper {

    public List<Teacher>findAllTeachers(int id);

     public List<Student>findAllStudents(int id);
}
