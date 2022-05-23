package com.bl.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.addressbook.model.User;
import com.bl.addressbook.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/getUser")
	public List<User> getUsersList() {
		return this.userService.getUsers();	
	}
	
	@GetMapping("/userid/{employeeId}")
	public User getUser(@PathVariable int userId) {
		return this.userService.getUser(userId);
	}
	
	@PostMapping("/postUser")
	public User addUsers(@RequestBody User user) {
		return this.userService.addUsers(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);	
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable int userId) {
		try {
			this.userService.deleteUser(userId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
