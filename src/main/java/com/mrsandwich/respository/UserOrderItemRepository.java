package com.mrsandwich.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsandwich.entity.UserOrderItem;

public interface UserOrderItemRepository extends JpaRepository<UserOrderItem, Integer>{

}
