package com.examples.service;
import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.dao.ICustomerRepository;
import com.examples.entities.Customer;
import com.examples.entities.Restaurant;
@Service
@Transactional
public class ICustomerServiceimpl implements ICustomerService{

	@Autowired
	ICustomerRepository iRep;
	@Override
	public Customer addCustomer(Customer customer) {
		
		return iRep.save(customer);
	}


	public Customer viewCustomer(Customer customer) {
		
	return iRep.findById(customer.getCustomerId()).orElseThrow(()->new EntityNotFoundException("No details!"));
	
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		
		 Customer cust=iRep.findById(customer.getCustomerId()).orElseThrow(()-> new
		  EntityNotFoundException("No customer found!"));
		cust.setFirstName(cust.getFirstName()); return iRep.save(cust);
	}

	@Override
	public Customer removeCustomer(Customer customer) {
		
		iRep.delete(customer);
		return null;
	}


	@Override
	public List<Customer> viewAllCustomers(Restaurant res) {
		//return (List<Customer>) iRep.findAll();
		
		return iRep.findAll();
	}


	
	  public List<Customer> viewAllCus(Customer customer1) {
	  
	  return iRep.findAll(); }
	 
}
