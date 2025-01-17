package com.springrestapi.springrestapi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.springrestapi.springrestapi.dao.StudentDao;
import com.springrestapi.springrestapi.entities.Student;

@Service

public class ImplementationStudentServices implements StudentServices {
    // It will make object of the implementation class of StudentDao Interface and inject dependency 
    @Autowired
    
    private StudentDao sd;
    
	@Override
	
	//Get all students from database
	
	public List<Student> getStudents() {
		return sd.findAll();
	}

	
	@Override
	//Get student from database when enter particular id
	public Student getStudent(int Sid) {
		return sd.getReferenceById(Sid);
	}

	@Override
	
	//Add student to database
	public Student addStudent(Student st) {
		sd.save(st);
		return st;
	}
    
	//Update Student in database
	public Student updateStudent(Student st) {
		sd.save(st);
		return st;	
	}

	
    // Delete Student from database
	public String deleteStudent( int id) {
	  
	Student entity=	sd.getReferenceById(id);
	sd.delete(entity);
		return "deleted";
			
		}
		
	}

	

	


		
		  
	

	
	

	

		
	

