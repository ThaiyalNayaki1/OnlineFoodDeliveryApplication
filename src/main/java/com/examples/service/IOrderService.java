package com.examples.service;

import com.examples.entities.*;
import java.util.*;

public interface IOrderService {

	public OrderDetails addOrder(OrderDetails order);
	
	public OrderDetails viewOrder(OrderDetails order);
	
	public OrderDetails updateOrder(OrderDetails order);
	
	public OrderDetails DeleteOrder(OrderDetails order);
	
	public List<OrderDetails> viewAllOrders(Customer customer);
	public List<OrderDetails> viewAllOrders(Restaurant res);
	
}
