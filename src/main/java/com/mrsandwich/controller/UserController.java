package com.mrsandwich.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrsandwich.constant.AppConstant;
import com.mrsandwich.dto.ItemDto;
import com.mrsandwich.dto.ItemPreferenceResponseDto;
import com.mrsandwich.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * User Controller class, we can check the user login along with phone number
 * and password, get all the user preference items(based on the last two
 * transaction order items)
 * 
 * @author Govindasamy.C
 * @version V1.1
 * @since 07-02-2020
 *
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping("/{userId}/preferences")
	public ResponseEntity<ItemPreferenceResponseDto> getAllUserPreferenceItems(@Valid @PathVariable Integer userId) {
		log.info("Get the user preference items based on userId...");
		List<ItemDto> itemList = userService.getAllUserPreferenceItems(userId);
		ItemPreferenceResponseDto itemPreferenceResponseDto = new ItemPreferenceResponseDto();
		if (itemList.isEmpty()) {
			log.info("No user preference items...");
			itemPreferenceResponseDto.setMessage(AppConstant.NO_RECORDS_FOUND);
			itemPreferenceResponseDto.setStatusCode(HttpStatus.NOT_FOUND.value());
		} else {
			itemPreferenceResponseDto.setItemList(itemList);
			itemPreferenceResponseDto.setMessage(AppConstant.SUCCESS_MESSAGE);
			itemPreferenceResponseDto.setStatusCode(HttpStatus.OK.value());
		}
		itemPreferenceResponseDto.setItemList(itemList);
		return new ResponseEntity<>(itemPreferenceResponseDto, HttpStatus.OK);
	}

}
