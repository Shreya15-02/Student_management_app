package com.springrestapi.springrestapi.controller;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.Student;
import com.springrestapi.springrestapi.service.StudentServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ApiController {
	@Autowired
	private StudentServices stsv;
	
	@GetMapping("/home")
      public String home()
      {
    	  return "Welcome to the StudentManagementApp";
      }
	
	// Get the Students
	@GetMapping("/students")
	public List<Student>getStudents(){
		
		return this.stsv.getStudents();
	}
	
	//Get student with particular id 
	@GetMapping("/students/{Sid}")
	public Student getStudent(@PathVariable String Sid) {
		
		return this.stsv.getStudent(Integer.parseInt(Sid));
	}
	
	//Adding Student
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student st)
	{
		return this.stsv.addStudent(st);
	}
	
	//Update the Student 
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student st)
	{
		return this.stsv.updateStudent(st);
	}
	
	//Delete the Student
	@DeleteMapping("/students/{Sid}")
	public String deleteStudent(@PathVariable String Sid)
	{
		
			return this.stsv.deleteStudent(Integer.parseInt(Sid));
			  
		}
	
	
}
