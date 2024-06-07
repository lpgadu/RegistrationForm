package com.RegistraionForm.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RegistraionForm.User.User;

@Repository
public interface RegisterRepo extends JpaRepository<User, String> {
	
	

}
