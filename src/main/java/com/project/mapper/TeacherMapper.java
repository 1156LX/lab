package com.project.mapper;

import com.project.entity.Teacher;

public interface TeacherMapper {
    public Teacher findByUsername(String username);

    public void updateUser(Teacher teacher);
}
