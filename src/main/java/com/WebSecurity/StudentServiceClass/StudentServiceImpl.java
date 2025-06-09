package com.WebSecurity.StudentServiceClass;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebSecurity.Modal.Student;
import com.WebSecurity.StudentRepository.StudentRepo;
import com.WebSecurity.StudenterviceInterface.StudentSerivceInterface;

@Service
public class StudentServiceImpl implements StudentSerivceInterface {
	

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Student addStudent(Student student) {
	
		return studentRepo.save(student) ;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student getById(int id) {
		Optional<Student> foundStudent= studentRepo.findById(id);
		if(foundStudent.isPresent()) { 
		
		return foundStudent.get();
		}
		else {
			throw new RuntimeException("Student Not Found with User ID"+ id );
		}
		
	}

}
