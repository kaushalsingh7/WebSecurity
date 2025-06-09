package com.WebSecurity.UserServiceClass;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebSecurity.Modal.User;
import com.WebSecurity.UserRepository.UserRepo;
import com.WebSecurity.UserServiceInterface.UserService;



@Service
public class UserServiceImpl implements UserService{

	
@Autowired	
private UserRepo userRepo;

@Override
public User addUser(User user) {
	
	return userRepo.save(user);
}

@Override
public User deletUser(Integer userId) {
Optional<User> user = userRepo.findById(userId);
    
    if (user.isPresent()) {
        userRepo.deleteById(userId); // Pass the ID, not the Optional
        return user.get();
    } else {
        throw new RuntimeException("User not found with id: " + userId);
    }
}
@Override
public User getUserById(Integer userId) {
	
Optional<User> user = userRepo.findById(userId);
    
    if (user.isPresent()) {
        
        return user.get();
    } else {
        throw new RuntimeException("User not found with id: " + userId);
    }
}

@Override
public User updateUSer(User user, Integer userId) {
	Optional<User> userOptional = userRepo.findById(userId);
	if (userOptional.isPresent()) {
		User existingUser= userOptional.get();
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
        return userRepo.save(existingUser); // Pass the ID, not the Optional
        
    } else {
        throw new RuntimeException("User not found with id: " + userId);
    }
}

@Override
public List<User> getAllUsers() {
return  userRepo.findAll();
	
}



}
