package com.example.Student.studentinfo.service.impl;

import com.example.Student.studentinfo.entity.studinfo;
import org.springframework.stereotype.Service;
import com.example.Student.studentinfo.mapper.Studentinfomapper;
import com.example.Student.studentinfo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StudentService extends ServiceImpl<Studentinfomapper, studinfo> implements IStudentService {

    @Autowired
    private Studentinfomapper studentinfomapper;

    @Override
    public List<studinfo> getDetail(Integer id){
    return studentinfomapper.getDetail(id);
    }


}
