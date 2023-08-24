package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.main.entities.User;
import com.main.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	public String test() {
		User user = new User();
		user.setName("Suraj Kumar Singh");
		user.setEmail("surajjivns@gmail.com");
		userRepository.save(user);
		return "Perfectly Working";
		
	}
}
