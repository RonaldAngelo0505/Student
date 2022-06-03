package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 项目启动入口，配置@EnableIgniteRepositories注解以支持ignite的@RepositoryConfig
 */
@SpringBootApplication

@MapperScan(value = "com.example.Student.studentinfo.mapper")
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}


}
