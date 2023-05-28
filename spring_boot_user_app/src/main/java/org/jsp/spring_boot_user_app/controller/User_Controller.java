package org.jsp.spring_boot_user_app.controller;

import java.util.Optional;

import org.jsp.spring_boot_user_app.dao.User_Dao;
import org.jsp.spring_boot_user_app.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_Controller {
	@Autowired
	private User_Dao dao;
	
	@PostMapping("/user/save")
	public void saveUser(@RequestBody User user) {
		dao.saveUser(user);
	}
	
//	@GetMapping("/user/find/id")
//	public Optional<User> getUser(@RequestParam int id) {
//		return dao.getUser(id);
//	}
	
	@GetMapping("/user/find/id")
	public User getUser(@RequestParam int id) {
		return dao.getUser(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
