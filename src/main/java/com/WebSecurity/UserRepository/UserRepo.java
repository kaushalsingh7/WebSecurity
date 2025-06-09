package com.WebSecurity.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebSecurity.Modal.User;



public interface UserRepo extends JpaRepository<User, Integer> {

}
