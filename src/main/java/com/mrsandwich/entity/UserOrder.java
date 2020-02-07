package com.mrsandwich.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@SequenceGenerator(name = "userOrderId", initialValue = 101, allocationSize = 1)
public class UserOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userOrderId")
	private Long userOrderId;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;
	private String orderStatus;
	private LocalDate orderDate;
	private String paymentType;
	private Double totalAmount;

}
