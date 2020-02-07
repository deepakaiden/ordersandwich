package com.mrsandwich.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsandwich.entity.UserOrder;

public interface UserOrderRepository extends JpaRepository<UserOrder, Long>{

}
