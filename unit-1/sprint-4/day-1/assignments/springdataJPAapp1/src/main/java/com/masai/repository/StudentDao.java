package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;

@Repository //Data Access Layer
public interface StudentDao extends JpaRepository<Student, Integer> {
	

}
