package com.bl.addressbook.service;

import java.util.List;

import com.bl.addressbook.model.User;

public interface UserService  {
	
	public List<User> getUsers();
	public User addUsers(User user);
	public User getUser(int userId);
	public User updateUser(User user);
	public User deleteUser(int userId);

}
