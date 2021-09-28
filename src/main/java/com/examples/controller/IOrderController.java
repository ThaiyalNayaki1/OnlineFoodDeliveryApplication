package com.examples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examples.entities.Customer;
import com.examples.entities.OrderDetails;
import com.examples.entities.Restaurant;
import com.examples.service.IOrderServiceimpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/Orders")
public class IOrderController {
	
	@Autowired
	IOrderServiceimpl iservice;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public OrderDetails addOrder(@RequestBody OrderDetails order)
	{
	return	iservice.addOrder(order);
	}
	@GetMapping
	public OrderDetails viewOrder(OrderDetails order)
	{
		return iservice.viewOrder(order);
		
	}
	@PutMapping
	public OrderDetails updateOrder(@RequestBody OrderDetails order)
	{
		return iservice.updateOrder(order);
	}
	@DeleteMapping
	public OrderDetails DeleteOrder(OrderDetails order)
	{
		return iservice.DeleteOrder(order);
	}
	@GetMapping("/customerOrders")
	public List<OrderDetails> viewAllOrders(Customer customer)
	{
		return iservice.viewAllOrders(customer);
		
	}
	@GetMapping("/ResOrders")
	public List<OrderDetails> viewAllOrders(Restaurant res)
	{
		return iservice.viewAllOrders(res);
		
	}

}
