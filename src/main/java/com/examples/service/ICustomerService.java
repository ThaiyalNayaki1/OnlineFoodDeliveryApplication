package com.examples.service;

import java.util.List;

import com.examples.entities.Customer;
import com.examples.entities.Restaurant;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer viewCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public List<Customer> viewAllCustomers(Restaurant res);

}
