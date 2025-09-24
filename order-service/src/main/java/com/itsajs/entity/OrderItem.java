package com.itsajs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TBL_ORDER_ITEM")
public class OrderItem 
{
  @Id	
  @Column(name = "ORDER_ITEM_ID")
  private String orderItemId;
  
  @Column(name = "ORDER_ID")
  private String orderId;
  
  @Column(name = "PRODUCT_ID")
  private String productId;
  
  @Column(name = "QUANTITY")
  private Integer quantity;
  
  @Column(name = "PRICE")
  private Double price;
  
  
  
  
  
  
  
}
