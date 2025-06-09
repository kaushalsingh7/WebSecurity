package com.WebSecurity.InfoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

	@GetMapping("/")
	public void welcomePage() {
		System.out.println("Welcome to the signin page");
	}
}
