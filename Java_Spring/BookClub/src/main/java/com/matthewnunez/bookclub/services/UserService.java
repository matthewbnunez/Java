package com.matthewnunez.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.matthewnunez.bookclub.models.LoginUser;
import com.matthewnunez.bookclub.models.User;
import com.matthewnunez.bookclub.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    public User register(User newUser, BindingResult result) {

    	Optional<User> optionalUser = userRepo.findByEmail(newUser.getEmail());

        if(optionalUser.isPresent()) {
        	result.rejectValue("email", "Unique", "The email is already registered");
        }
    	
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
        	result.rejectValue("confirm", "Matches", "The password and confirm password don't match");        	
        }
        
        if(result.hasErrors()) {
        	return null;
        }
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        return userRepo.save(newUser);
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
       
	   	Optional<User> optionalUser = userRepo.findByEmail(newLogin.getEmail());
	   	
	   	if(!optionalUser.isPresent()) {
	       	result.rejectValue("email", "Unique", "The email is not registered");  
	       	return null;
	   	}
       User user = optionalUser.get();
   	
       if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
           result.rejectValue("password", "Matches", "Invalid Password!");
       }
       
       if(result.hasErrors()) {
       	return null;
       }
   	return user;
   }
}