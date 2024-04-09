package com.springweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springweb.dto.StudentDTO;
import com.springweb.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/studentDetails")
	private String webApp() {
		return "student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(StudentDTO studentDTO, Map<String, Object> map) {
		map.put("message", "Student Registered Successfully...!!");
		studentService.saveStudent(studentDTO);
		return "student";
	}

}
