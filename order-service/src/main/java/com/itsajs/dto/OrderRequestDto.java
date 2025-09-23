package com.itsajs.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequestDto 
{
  private String customerId;
  private List<OrderItemRequestDto> orderItemRequestDtoList;
}
