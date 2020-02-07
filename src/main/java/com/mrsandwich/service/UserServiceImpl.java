package com.mrsandwich.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrsandwich.constant.AppConstant;
import com.mrsandwich.dto.ItemDto;
import com.mrsandwich.entity.User;
import com.mrsandwich.respository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<ItemDto> getAllUserPreferenceItems(Integer userId) {
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			//throw new UserNotFoundException(AppConstant.FAILURE_MESSAGE);
		}
		
		return null;
	}

}
