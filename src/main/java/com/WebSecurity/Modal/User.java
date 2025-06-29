package  com.WebSecurity.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class User {

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String email;
private String password;

	
}
