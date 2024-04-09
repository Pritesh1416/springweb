package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springweb.dto.StudentDTO;
import com.springweb.entity.StudentEntity;
import com.springweb.repository.StudentJpaRepository;
import com.springweb.util.AppModelMapper;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentJpaRepository studentJpaRepository;
	@Autowired
	private AppModelMapper appModelMapper;

	@Override
	public void saveStudent(StudentDTO studentDTO) {
		StudentEntity studentEntity = appModelMapper.dtoToEntity(studentDTO);
		studentJpaRepository.save(studentEntity);

	}

}
