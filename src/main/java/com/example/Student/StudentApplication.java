package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
