package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public void saveOrUpdate(User user) {
		userRepo.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepo.findAll();
		
	}
	
	public User getuserById(int id) {
		return userRepo.findById(id).orElse(null);
	}
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
	

}
