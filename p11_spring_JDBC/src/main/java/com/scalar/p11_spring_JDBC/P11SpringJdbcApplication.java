package com.scalar.p11_spring_JDBC;


import com.scalar.p11_spring_JDBC.model.Student;
import com.scalar.p11_spring_JDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;


@SpringBootApplication
public class P11SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(P11SpringJdbcApplication.class, args);


		Student s1 = context.getBean(Student.class);
		s1.setRollNo(104);
		s1.setMarks(89);
		s1.setName("Sonam Kumari");


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);


		List<Student> students = service.getStudents();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}
