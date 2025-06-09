package com.WebSecurity.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id; 
	private String name;
	private int marks;
	
}
