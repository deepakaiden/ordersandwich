package com.mrsandwich.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mrsandwich.common.OrderSandwichEnum.Role;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String name;
	private String emailAddress;
	@Column(unique=true)
	private Long phoneNumber;
	private String password;
	private String address1;
	private String address2;
	private String place;
	private Long pinCode;
	@Enumerated(EnumType.STRING)
	private Role role;
}
