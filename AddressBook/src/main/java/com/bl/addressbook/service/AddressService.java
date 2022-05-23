package com.bl.addressbook.service;

import java.util.List;

import com.bl.addressbook.model.Address;

public interface AddressService {

	public List<Address> getAddress();
	public Address addAddress(Address address);
}
