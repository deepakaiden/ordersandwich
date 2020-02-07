package com.mrsandwich.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPreferenceResponseDto extends ResponseDto{

	private List<ItemDto> itemList;
}
