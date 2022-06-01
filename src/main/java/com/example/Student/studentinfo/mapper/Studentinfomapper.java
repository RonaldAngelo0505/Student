package com.example.Student.studentinfo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.Student.studentinfo.entity.studinfo;

import java.util.List;

public interface Studentinfomapper extends BaseMapper<studinfo> {
    List<studinfo> getDetail(Integer id);
}
