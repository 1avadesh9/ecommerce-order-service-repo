package com.itsajs.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="TBL_ORDER")
public class Order 
{
   @Column(name = "ORDER_ID")
   private String orderId;
   
   @Column(name = "CUSTOMER_ID")
   private String customerId;
   
   @Column(name = "ORDER_DT")
   private LocalDateTime orderDate;
   
   @Column(name = "TOTAL_AMOUNT")
   private Double totalAmount;
   
   @Column(name = "ORDER_STATUS")
   private String orderStatus;
   
   
}
