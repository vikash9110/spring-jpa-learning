package com.vikash.springjpalearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.springjpalearning.db.Student;
import com.vikash.springjpalearning.db.StudentRepository;

@RestController
public class JPAController {

	@Autowired
	StudentRepository studentRepository;


	@RequestMapping("/message")
	public String message() {
		Student student = new Student();
		student.setName("vikash kumar");
		studentRepository.save(student);
		System.out.println("student:  " + studentRepository.save(student).toString());
		return student.getName();
	}
}
