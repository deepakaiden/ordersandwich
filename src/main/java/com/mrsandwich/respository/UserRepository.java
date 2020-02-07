package com.mrsandwich.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsandwich.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
