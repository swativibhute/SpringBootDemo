package com.example.demo.Repoeitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{

	
//	public User findByUserId(Integer id);
}
