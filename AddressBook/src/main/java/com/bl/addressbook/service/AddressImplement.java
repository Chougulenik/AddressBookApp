package com.bl.addressbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.addressbook.dao.AddressDao;
import com.bl.addressbook.model.Address;

@Service
public class AddressImplement implements AddressService {
	
	@Autowired
	private AddressDao addressDao;
	
	public AddressImplement() {

	}

	@Override
	public List<Address> getAddress() {
		return addressDao.findAll();
	}

	@Override
	public Address addAddress(Address address) {
		return  addressDao.save(address);
	}
}
