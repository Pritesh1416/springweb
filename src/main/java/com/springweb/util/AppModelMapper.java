package com.springweb.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.springweb.dto.StudentDTO;
import com.springweb.entity.StudentEntity;

@Component
public class AppModelMapper {
	private ModelMapper modelMapper = new ModelMapper();

	public StudentEntity dtoToEntity(StudentDTO studentDTO) {
		return modelMapper.map(studentDTO, StudentEntity.class);
	}

	public StudentDTO entityToDTO(StudentEntity studentEntity) {
		return modelMapper.map(studentEntity, StudentDTO.class);
	}
}
