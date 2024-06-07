package com.RegistraionForm.Service;

import java.util.List;

import com.RegistraionForm.User.User;


public interface UserInterface {
	
	public void registerUser(User user);
	
	public List<User> getAllusers();

}
