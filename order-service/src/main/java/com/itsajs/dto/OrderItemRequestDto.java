package com.itsajs.dto;

import lombok.Data;

@Data
public class OrderItemRequestDto 
{
	private String productId;
	private int quantity;
}
