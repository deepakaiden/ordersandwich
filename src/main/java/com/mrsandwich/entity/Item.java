package com.mrsandwich.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mrsandwich.common.OrderSandwichEnum.ItemType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemId;
	private String itemName;
	private Double price;
	@Enumerated(EnumType.STRING)
	private ItemType itemType;
	private String availableStatus;
}
