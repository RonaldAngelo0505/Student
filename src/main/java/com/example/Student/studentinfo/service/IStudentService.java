package com.example.Student.studentinfo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.Student.studentinfo.entity.studinfo;

import java.util.List;

public interface IStudentService extends IService<studinfo> {
List<studinfo> getDetail(Integer id);

}
