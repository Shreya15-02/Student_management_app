package com.springrestapi.springrestapi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.springrestapi.springrestapi.dao.StudentDao;
import com.springrestapi.springrestapi.entities.Student;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringrestapiApplicationTests {
	@Autowired
	StudentDao studentd;
	
	@Test
	
	public void testAddStudent() {
	Student s =new Student();
	s.setId(7);
	s.setName("Surat");
	s.setCourse("B.Com");
    studentd.save(s);
	assertNotNull(studentd.findById(7).get());
	}
	
	@Test
	public void testGetAllStudent() {
		List <Student> list =studentd.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	public void testGetStudentById()
	{
		Student res= studentd.findById(2).get();
		assertEquals("CIV", res.getCourse());
	}
    
	@Test
	public void testUpdateStudent()
	{
		Student res =studentd.findById(3).get();
		res.setName("Drishti Sharma");
		studentd.save(res);
		assertNotEquals("Drishti Verma", studentd.findById(3).get().getName());
	}
	
	@Test
	public void testDeleteStudent()
	{
		studentd.deleteById(5);
		assertThat(studentd.existsById(4)).isFalse();
	}
}
