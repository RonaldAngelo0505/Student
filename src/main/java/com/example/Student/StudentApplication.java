package com.example.Student;

import com.example.Student.studentinfo.service.IStudentService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import com.example.Student.studentinfo.entity.studinfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * 项目启动入口，配置@EnableIgniteRepositories注解以支持ignite的@RepositoryConfig
 */
@SpringBootApplication
//@RequestMapping("/hello")
@MapperScan(value = "com.example.Student.studentinfo.mapper")
//@RestController
//@RequestMapping("/student")
public class StudentApplication {

	public static void main(String[] args) {
	//	@RequestMapping("Deets)

		SpringApplication. run(StudentApplication.class, args);


	}



}
