package com.bl.addressbook.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String emailId;
	
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ua_fk", referencedColumnName = "id")
	private List<Address> address = new ArrayList<>();
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, int phoneNumber, String emailId, List<Address> address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	


	
	
}
