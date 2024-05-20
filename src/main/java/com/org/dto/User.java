package com.org.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue()
private int id;
	@Column(nullable=false)
	
private String  name;
	@Column(nullable=false)
private int age;
	
	@Column(unique=true,nullable=false)
private String email;
	@Column(nullable=false)
private String password;
	@Column(nullable=false)
private Long mobile; 

}
