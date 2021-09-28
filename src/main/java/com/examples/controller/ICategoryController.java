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

import com.examples.entities.Category;
import com.examples.entities.Customer;
import com.examples.service.ICategoryServiceimpl;


import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/Categories")
public class ICategoryController {
	
	@Autowired
	ICategoryServiceimpl icsService;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Category addCustomer(@RequestBody Category cat)
	{
	return	icsService.addCategory(cat);
	}
	@GetMapping
	public Category viewCategory(Category cat)
	{
		return icsService.viewCategory(cat);
		
	}
	
	@GetMapping("/listofall")
	public List<Category> viewAllCategory(Category cat)
	{
		return icsService.viewAllCategory(cat);
		
	}
	@PutMapping
	public Category updateCategory(@RequestBody Category cat)
	{
		return icsService.updateCategory(cat);
	}
	@DeleteMapping
	public Category removeCategory(Category cat)
	{
		return icsService.removeCategory(cat);
	}
	
}
