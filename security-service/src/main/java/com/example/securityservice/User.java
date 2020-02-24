package com.example.securityservice;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue
	private Long id;

	private String email;
	private String password;

//	private String name;
//	private String lastName;
//	private String city;
//	private String country;

}