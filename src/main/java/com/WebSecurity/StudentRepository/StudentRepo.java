package com.WebSecurity.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebSecurity.Modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
