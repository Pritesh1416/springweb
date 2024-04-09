package com.springweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springweb.entity.StudentEntity;

@Repository
public interface StudentJpaRepository extends CrudRepository<StudentEntity, Integer> {

}
