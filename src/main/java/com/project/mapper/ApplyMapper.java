package com.project.mapper;

import com.project.entity.Apply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplyMapper {

    //添加申请
    public void addApply(Apply apply);

}
