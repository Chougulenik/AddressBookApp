package com.bl.addressbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.addressbook.dao.UserDao;
import com.bl.addressbook.model.User;

@Service
public class UserImplements implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserImplements() {
		
	}
	
	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User addUsers(User user) {
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User deleteUser(int userId) {
		User entity = userDao.getById(userId);
		userDao.delete(entity);
		return entity;
	}

	@Override
	public User getUser(int userId) {
		return userDao.findById(userId).get();
	}

}
