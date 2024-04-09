package com.springweb.service;

import org.springframework.stereotype.Service;

import com.springweb.dto.StudentDTO;

@Service
public interface StudentService {

	void saveStudent(StudentDTO studentDTO);

}
