package com.springboot.proj.service;

import com.springboot.proj.model.Restaurant;
import com.springboot.proj.repository.RestaurantRepository;

import java.util.List;

public interface RestaurantService {
   Restaurant saveRating(Restaurant restaurant);
   List<Restaurant> getAllRestaurant();
   Restaurant updateRestaurant(Restaurant restaurant,int id);
   void deleteRestaurant(int id);
  // Restaurant getAvg(Restaurant restaurant,int id);
//   List<Object[]> getAvg();
}
