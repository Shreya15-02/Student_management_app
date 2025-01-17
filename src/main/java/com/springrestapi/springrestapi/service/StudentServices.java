package com.springrestapi.springrestapi.service;
import java.util.List;



import com.springrestapi.springrestapi.entities.Student;

public interface StudentServices {
	
           public List<Student>getStudents();
           public Student getStudent(int id );
           public Student addStudent(Student st);
           public Student updateStudent(Student st);
           public String deleteStudent(int id);
}
