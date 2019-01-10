package com.project.mapper;

import com.project.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    public Student findByUsername(String username);

    public void updateStudent(Student student);

}
