package com.springboot.proj.service.impl;

import com.springboot.proj.exception.ResourceNotFoundException;
import com.springboot.proj.model.Restaurant;
import com.springboot.proj.repository.RestaurantRepository;
import com.springboot.proj.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }
    @Override
    public Restaurant saveRating(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurant() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant, int id) {
        Restaurant existingRes = restaurantRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Restaurant","id" , id));
        existingRes.setCleanliness(restaurant.getCleanliness());
        existingRes.setAmbience(restaurant.getAmbience());
        existingRes.setService(restaurant.getService());
        existingRes.setFood(restaurant.getFood());

        restaurantRepository.save(existingRes);

        return existingRes;
    }

    @Override
    public void deleteRestaurant(int id) {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Restaurant", "id",id ));
        restaurantRepository.deleteById(id);

    }

//    @Override
//    public List<Object[]> getAvg() {
//        return restaurantRepository.;
//    }

//    @Override
//    public Restaurant getAvg(Restaurant restaurant, int id) {
//        Restaurant existingRes = restaurantRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Restaurant","id" , id));
////        int sum = existingRes.getCleanliness()+ existingRes.getAmbience()+ existingRes.getService()+ existingRes.getFood();
////        int avg = sum/4;
////
////        existingRes.setAvg(avg);
////        restaurantRepository.save(existingRes);
//        return existingRes;
  //  }
}
