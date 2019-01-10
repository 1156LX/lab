package com.project.service.impl;

import com.project.entity.Student;
import com.project.entity.Teacher;
import com.project.mapper.LaboratoryMapper;
import com.project.service.ILaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaboratoryService implements ILaboratoryService {
    @Autowired
    private LaboratoryMapper laboratoryMapper;

    @Override
    public List<Teacher> allTeachers(int id) {
        return laboratoryMapper.findAllTeachers(id);
    }

    @Override
    public List<Student> allStudents(int id) {
        return laboratoryMapper.findAllStudents(id);
    }
}
