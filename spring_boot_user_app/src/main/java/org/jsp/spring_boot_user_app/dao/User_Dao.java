package org.jsp.spring_boot_user_app.dao;

import java.util.Optional;

import org.jsp.spring_boot_user_app.dto.User;
import org.jsp.spring_boot_user_app.repository.User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class User_Dao {
	@Autowired
	private User_Repository repository;
	
	
	public void saveUser(User user) {
		repository.save(user);
	}
	
//	public Optional<User> getUser(int id) {
//		return repository.findById(id);
//	}
	
	public User getUser(int id) {
		return repository.findById(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
