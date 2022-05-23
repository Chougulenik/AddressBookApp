package com.bl.addressbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.addressbook.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
