package com.example.Student.studentinfo.controller;

import com.example.Student.studentinfo.entity.studinfo;
import com.example.Student.studentinfo.service.IStudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/student-name")
@Api(value = "studinfo",tags = {"studinfo"})
public class StudentController {
    @Autowired
    private IStudentService iStudentService;


    @GetMapping("/detail")
    public List<studinfo> getDetail(@PathVariable Integer id){
    List<studinfo> list = iStudentService.getDetail(id);
    System.out.println(list);
    return list;
    }

    @GetMapping("/sheesh")
    private String hello(){
        return "asdfsafdsfa";
    }


}
