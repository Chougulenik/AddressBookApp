package com.bl.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bl.addressbook.model.Address;
import com.bl.addressbook.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	public AddressService addressService;
	
	@GetMapping("/getAddress")
	public List<Address> getAddess() {
		return this.addressService.getAddress();
	}
	
	@PostMapping("/addAddress")
	public Address address(@RequestBody Address address) {
		return this.addressService.addAddress(address);
		
	}
}
