package com.WebSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WebSecurity.Modal.User;
import com.WebSecurity.UserServiceInterface.UserService;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class Controller {

	@Autowired 
	private UserService userService;
	
@PostMapping("/addUser")	
public ResponseEntity<User> addUser(@RequestBody User user){

	User createUser= userService.addUser(user);
	return new ResponseEntity<>(createUser,HttpStatus.CREATED);
}

@GetMapping("/getUser")
public ResponseEntity<List<User>> getAlUser() {
    return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
}



}
