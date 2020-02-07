package com.mrsandwich.service;

import java.util.List;

import com.mrsandwich.dto.ItemDto;

public interface UserService {

	public List<ItemDto> getAllUserPreferenceItems(Integer userId);
}
