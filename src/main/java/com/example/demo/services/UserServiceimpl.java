package com.example.demo.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repoeitory.UserDao;

import com.example.demo.entity.User;

@Service
public class UserServiceimpl implements UserServices {

	@Autowired
	private UserDao userDao;

	@Override
	public User saveUser(User user) {

		return userDao.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		User user =null;
		try {
			user=userDao.findById(id).get();
			} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public List<User> getAllUsers() {

		return (List<User>) userDao.findAll();
	}

	@Override
	public User saveOrUpdate(User user) {

		return userDao.save(user);
	}

	@Override
	public void Update(User user, int id) {
		user.setId(id);
			
		userDao.save(user);
	}

	@Override
	public void deleteUser(int id) {
	
		 userDao.deleteById(id);
	}

}
