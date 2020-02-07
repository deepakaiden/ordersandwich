package com.mrsandwich.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsandwich.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
