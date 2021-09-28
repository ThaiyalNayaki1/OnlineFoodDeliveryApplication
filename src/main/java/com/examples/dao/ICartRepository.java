package com.examples.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examples.entities.*;

public interface ICartRepository  extends JpaRepository<FoodCart,Integer> {
	//@Query("Update Item Set quantity=?1")
	//FoodCart save(Item item);
//@Query("Update Item Set quantity=?1")
	//FoodCart update(FoodCart cart, Item item, Integer quantity);
	//@Query("Update  Item  Set quantity = ?1 ")
	//FoodCart increaseQ(FoodCart cart, Item item, int quantity);

	//FoodCart update(FoodCart cart
	

}
