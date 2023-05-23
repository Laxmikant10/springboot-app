package com.springboot.app;

import com.springboot.app.dto.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);

		Student student = new Student();
		student.setId("111");
		student.setFirstName("Lax");
		student.setLastName("Shastrakar");

		System.out.println("student.getId() = " + student.getId());
		System.out.println("student.getFirstName() = " + student.getFirstName());
		System.out.println("student.getLastName() = " + student.getLastName());
	}
}
