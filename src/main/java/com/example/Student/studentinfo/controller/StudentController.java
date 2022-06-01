package com.example.Student.studentinfo.controller;

import com.example.Student.studentinfo.entity.studinfo;
import com.example.Student.studentinfo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
//@RequestMapping(path = "student-name")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;


    @GetMapping("/detail")
    public List<studinfo> getDetail(@PathVariable Integer id){
    List<studinfo> list =iStudentService.getDetail(id);
    return list;

    }

   // @GetMapping
  /*  private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public String hello(){
        return studentService.hello();
      //  return "Hello Worlds";
    }*/

}
