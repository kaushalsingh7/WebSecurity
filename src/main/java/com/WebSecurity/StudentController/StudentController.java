package com.WebSecurity.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.WebSecurity.Modal.Student;
import com.WebSecurity.StudenterviceInterface.StudentSerivceInterface;

@RestController
public class StudentController {

	@Autowired
	private StudentSerivceInterface studentSerivceInterface;
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentSerivceInterface.addStudent(student),HttpStatus.CREATED);
	}
}
