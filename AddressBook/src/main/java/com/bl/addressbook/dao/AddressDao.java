package com.bl.addressbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.addressbook.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}
