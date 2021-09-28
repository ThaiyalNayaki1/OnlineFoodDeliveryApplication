package com.examples;

import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.examples.dao.ICustomerRepository;
import com.examples.entities.Customer;
import com.examples.service.ICustomerServiceimpl;


@ExtendWith(MockitoExtension.class)
 class CustomerTest {
	@Mock
	private ICustomerRepository customerRepository;
	@InjectMocks
	private ICustomerServiceimpl customerService;
	
	@Test
	void getAllCustomerTest() {
		List<Customer> list = new ArrayList<Customer>();
		Customer customer1 = new Customer();
		list.add(customer1);
		
		when(customerRepository.findAll()).thenReturn(list);
		List<Customer> customerList = customerService.viewAllCus(customer1);
		assertEquals(1, customerList.size());
		
	}
	
	//add address
	@Test
	void saveCustomerTest() {
		Customer customer = new Customer();
		when(customerRepository.save(customer)).thenReturn(customer);
		Customer savedCustomer = customerService.addCustomer(customer);
		assertThat(savedCustomer).isNotNull();
		assertEquals("Vino",savedCustomer.getFirstName());
	}
	

}