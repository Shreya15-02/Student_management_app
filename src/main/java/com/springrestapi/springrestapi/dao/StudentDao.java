package com.springrestapi.springrestapi.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.springrestapi.springrestapi.entities.Student;

public interface StudentDao extends JpaRepository<Student , Integer> {
	
	
}
