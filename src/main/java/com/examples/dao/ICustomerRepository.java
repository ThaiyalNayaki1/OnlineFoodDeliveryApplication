package com.examples.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.examples.entities.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer>{
	/*
	 * @Modifying
	 * 
	 * @Query("Update Customer c Set c.age=?1 where c.customerId=?1") void
	 * update(Customer customer);
	 */
}
