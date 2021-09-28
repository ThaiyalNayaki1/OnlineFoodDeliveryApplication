package com.examples.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer>{

}
