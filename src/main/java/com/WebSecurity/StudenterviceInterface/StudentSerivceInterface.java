package com.WebSecurity.StudenterviceInterface;

import java.util.List;

import com.WebSecurity.Modal.Student;

public interface StudentSerivceInterface {

	
	 Student addStudent(Student student);
	
	 List<Student> getAllStudents();
	
	Student getById(int id);
}
