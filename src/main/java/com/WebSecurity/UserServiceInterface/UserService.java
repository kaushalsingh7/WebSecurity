package  com.WebSecurity.UserServiceInterface;

import java.util.List;

import com.WebSecurity.Modal.User;



 public interface UserService {
	
   User  addUser(User user);
   User deletUser(Integer userId);
   User getUserById(Integer userId);
   User updateUSer(User user, Integer userId);
   List<User> getAllUsers();

}
