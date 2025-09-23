package com.itsajs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itsajs.model.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, String>
{

}
