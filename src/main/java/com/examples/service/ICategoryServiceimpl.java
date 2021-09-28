package com.examples.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.dao.ICategoryRepository;
import com.examples.entities.Category;
@Service
@Transactional
public class ICategoryServiceimpl implements ICategoryService {
	
	@Autowired
	ICategoryRepository icRep;
	@Override
	public Category addCategory(Category cat) {
		
		return icRep.save(cat);
	}

	@Override
	public Category viewCategory(Category cat) {
		
		return icRep.findById(cat.getCatId()).orElseThrow(()->new EntityNotFoundException("No details!"));
	}

	@Override
	public Category updateCategory(Category cat) {
		Category ct=icRep.findById(cat.getCatId()).orElseThrow(()->new EntityNotFoundException("No details!"));
		ct.setCatName(cat.getCatName());
		return ct;
	}

	@Override
	public Category removeCategory(Category cat) {
		
		icRep.delete(cat);
		return null;
	}

	@Override
	public List<Category> viewAllCategory(Category cat) {
		
		return icRep.findAll();
	}

}
