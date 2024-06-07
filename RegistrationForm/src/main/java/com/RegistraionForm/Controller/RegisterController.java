package com.RegistraionForm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.RegistraionForm.Service.ServiceImplementation;
import com.RegistraionForm.User.User;


@Controller

public class RegisterController {
	
	@Autowired
	private ServiceImplementation service;
	
	@GetMapping("/")
	public String register(Model model) {
		
		User user = new User();
		model.addAttribute("user",user);
		return "register";
	}
	
	@GetMapping("/users")
	public String getAllusers(Model model) {
		model.addAttribute("user",service.getAllusers());
		return "users";
		
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute ("user") User user) {
		String result=null;
		System.out.println(user);
		if (user.getPassword().equals(user.getCpassword())) {
			try {
				service.registerUser(user);
				result= "home";
			}
			catch(Exception e) {
				result= "error";
			}
		}
		//service.registerUser(user);
		return result;
	}
	
	
	

}
