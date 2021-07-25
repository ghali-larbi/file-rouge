package com.youtube2.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube2.jwt.entity.User;
import com.youtube2.jwt.entity.Voiture;

@Repository
public interface UserDao extends CrudRepository<User, String> {
	public User findByEmail(String userName);
	public User findById(int id);
}
