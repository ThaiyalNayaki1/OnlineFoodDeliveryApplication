package com.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.examples.dao.IRestaurantRepository;
import com.examples.entities.Restaurant;
import com.examples.service.IRestaurantServiceImpl;


@ExtendWith(MockitoExtension.class)
 class RestaurantTest {
	@Mock
	private IRestaurantRepository restaurantRepository;
	@InjectMocks
	private IRestaurantServiceImpl restaurantService;
	
	@Test
	void getAllRestaurantsTest() {
		List<Restaurant> list = new ArrayList<Restaurant>();
		Restaurant restaurant1 = new Restaurant();
		list.add(restaurant1);
		
		when(restaurantRepository.findAll()).thenReturn(list);
		List<Restaurant> restList = restaurantService.viewAllRes(restaurant1);
		assertEquals(1, restList.size());
		
	}
	
	//add address
	@Test
	void saveRestaurantTest() {
		Restaurant restauarnt = new Restaurant();
		when(restaurantRepository.save(restauarnt)).thenReturn(restauarnt);
		Restaurant savedRestaurant = restaurantService.addRestaurant(restauarnt);
		assertThat(savedRestaurant).isNotNull();
		assertEquals("Vino",savedRestaurant.getManagerName());
	}
	

}