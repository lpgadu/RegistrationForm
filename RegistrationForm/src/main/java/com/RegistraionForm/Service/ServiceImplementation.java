package com.RegistraionForm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RegistraionForm.Repo.RegisterRepo;
import com.RegistraionForm.User.User;

@Service
public class ServiceImplementation implements UserInterface {

	@Autowired
	private RegisterRepo repo;
	
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
		
	}

	@Override
	public List<User> getAllusers() {
		
		return repo.findAll();
		
	}

}
