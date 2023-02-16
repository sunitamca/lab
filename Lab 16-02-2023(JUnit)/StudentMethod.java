package com.student.method;

import java.util.ArrayList;
import java.util.List;

import com.student.College;
import com.student.Student;
import com.student.exception.StudentException;

public class StudentMethod{
private List<Student> student = new ArrayList<Student>();
	
	//method to add employee details in array list
	public void addStudent(long stId,String stName,double stPhone, String stEmail ,
			String CollegeName, String CollegeAddress)
	{
		College add= new College(CollegeName, CollegeAddress);
		student.add(new Student(stId, stName, stPhone , stEmail ,add));
	}
	
	//for testing using bulider annotation
	public void addst(Student st)
	{
		student.add(st);
	}
	
	//method to display employee details usinh id 
	public Student displayStById(int id) throws StudentException
	{
		for(int i=0;i<student.size();i++)
		{
			//checking whether thr id is present in arraylist or not
			if(student.get(i).getStId()==id)
			{
				
			System.out.println("Student ID: "+student.get(i).getStId());
			System.out.println("Student Name: "+student.get(i).getStName());
			System.out.println("Student Phone: "+student.get(i).getStPhone());
			System.out.println("Student Email: "+student.get(i).getStEmail());
			System.out.println("Student College: "+student.get(i).getCollege().getCollegeName());
			System.out.println("Student College Location: "+student.get(i).getCollege().getCollegeAddress());
				
	
			return student.get(i);
		}
		else
		{
			throw new StudentException("Student ID not found!!");
		}
	}
	//return employee.get(id);
		return null;
	}
	 //method to update an employee details
	public Student updateStudent(int index, Student st) throws StudentException
	{
		return student.set(index, st);
}
	//find by id
	public Student findId(int id)
	{
		Student st = null;
		for(int i=0;i<student.size();i++)
		{
			if(student.get(i).getStId()==id)
			{
				st=student.get(i);
				//System.out println(student);
			}
		}
		return st;
		
	}
	//method to display all student
	public void displayAllStudents()
	{
		for(Student st: student)
		{
			
		System.out.println("Student Id: "+st.getStId());
		System.out.println("Student Name: "+st.getStName());
		System.out.println("Student Phone: "+st.getStPhone());
		System.out.println("Student Email: "+st.getStEmail());
		System.out.println("CollegeName: "+st.getCollege().getCollegeName());
		System.out.println("Student Location: "+st.getCollege().getCollegeAddress());
		}
	}
    //method to remove/delete an employee using id 
	public void removeStudentById(int id) throws StudentException
	{
	for(int i=0;i<student.size();i++)
	{
		if(student.get(i).getStId()==id)
		{
			student.remove(i);
		}
		else
		{
			throw new StudentException("Student with id "+id+" is not present!");
		}
	}
	}
	//method to remove all student
	public String removeAll() throws StudentException
	{
		student.clear();
		return "All student details deleted successfully!";
	}
	
	public int lengthOfList()
	{
		return student.size();
	}

}



