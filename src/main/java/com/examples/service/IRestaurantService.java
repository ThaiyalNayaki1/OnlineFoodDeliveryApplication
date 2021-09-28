package com.examples.service;

import java.util.List;

import com.examples.entities.Restaurant;

public interface IRestaurantService {
	
	public Restaurant addRestaurant(Restaurant res);
	
	public Restaurant viewRestaurant(Restaurant res);
	
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	
	public List<Restaurant> viewRestaurantByItemName(String name);
	
	public List<Restaurant> viewBearByRestaurant(String location);

}
