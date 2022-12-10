package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.User;

public interface UserServices {
	
	public User saveUser(User user);
	
	public User getUserById(Integer id);

	public List<User> getAllUsers();

	public User saveOrUpdate(User user);

	public void Update(User user, int id);
	
	public void deleteUser(int id);
}
