package com.itsajs.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.itsajs.entity.OrderItem;

import lombok.Data;

@Data
public class OrderResponseDto
{
	private String orderId;
	private String customerId;
	private LocalDateTime orderDate;
	private Double totalAmount;
	private String orderStatus;
	private List<OrderItem> orderItemList;
	
}
