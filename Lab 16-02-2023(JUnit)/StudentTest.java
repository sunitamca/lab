package com.student.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.student.College;
import com.student.Student;
import com.student.exception.StudentException;
import com.student.method.StudentMethod;

public class StudentTest {
	static StudentMethod studentMethod;
	
	@BeforeEach
	void setup() throws Exception{
		studentMethod = new StudentMethod();
	}
	@AfterEach
	void tearDown() throws Exception{
		studentMethod=null;
		System.out.println("Object is garbage collected!");
		
	}
	
	@Test
	@DisplayName("Testing add student method")
	@Order(1)
	void addStudent()
	{
		
		//way 2
		College add=College.builder().CollegeName("K.b.college").CollegeAddress("Bermo").build();
		Student st = Student.builder().stName("Student").stId(12).stPhone(8809721500l).
				college(add).build();
		studentMethod.addst(st);
		assertEquals("Student", st.getStName());
	}
	
	@Test
	@DisplayName("Testing to update student details")
	@Order(2)
	void testDisplaystById() throws StudentException
	{
		studentMethod.addStudent(11, "Sabdick", 8809721500l, "si@mail.com", "java", "DBMS");
		Student st=studentMethod.findId(11);
		st.setStName("Sunita");
		
		studentMethod.updateStudent(0, st);
		assertEquals("Sunita" , st.getStName());
		
	}
	//remove id
	@Test
	@Order(4)
	void testRemovestbyId() throws StudentException
	{
	   studentMethod.addStudent(19, "Sunita", 0, null, null, null);;
		
		studentMethod.removeStudentById(19);
		System.out.println();
		
		assertNull(studentMethod.displayStById(19));
	}
	
	@Test
	@Order(5)
	void testRemoveAll() throws StudentException
	{
		College add = College.builder().CollegeName("kgt college").CollegeAddress("Ranchi").build();
		Student st = Student.builder().stName("Pritam").stId(13).stPhone(9934530094l).stEmail("Sunitabca1996@gmai.com").build();
		studentMethod.addst(st);
		
		studentMethod.removeAll();
		studentMethod.displayAllStudents();
		
		assertEquals("All student details deleted successfully!", studentMethod.removeAll());
	}
	
		
}



