package com.example.Student;

import com.example.Student.studentinfo.studentinfo;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

@SpringBootApplication

public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		System.out.println("hoorah");

//SELECT QUERY
	/*	try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","123");
			String query = "select * from user_info ";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				java.sql.Date det = resultSet.getDate("dob");
				String email = resultSet.getString("email");

				System.out.println(id+","+name+","+age+","+det+","+email);
			}

		}catch (Exception e){
			e.printStackTrace();

		}*/
		//GROOVY
	/*@Select("""SELECT ID, name a username, age as edad """);
		List<> ();
	}*/


	}


}
