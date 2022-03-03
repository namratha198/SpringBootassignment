package com.example.demo;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
@Entity
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	UUID id = UUID.randomUUID();
	private String name;
	@Column(unique=true)
	private String phoneNumber;
	User(){}
	User(UUID id,String name,String phoneNumber) {
		this.id = id;
		this.name = name;
		this.phoneNumber=phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}



