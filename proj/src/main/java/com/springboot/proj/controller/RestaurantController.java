package com.springboot.proj.controller;

import com.springboot.proj.model.Restaurant;
import com.springboot.proj.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }
    @PostMapping()
    public ResponseEntity<Restaurant> saveRestaurant(@RequestBody Restaurant restaurant){
        return new ResponseEntity<Restaurant>(restaurantService.saveRating(restaurant), HttpStatus.CREATED);
    }
    @GetMapping()
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurant();
    }
    @PutMapping("{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable(name = "id") int id, @RequestBody Restaurant restaurant){
        return new ResponseEntity<Restaurant>(restaurantService.updateRestaurant(restaurant, id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRestaurant(@PathVariable(name = "id") int id){
        restaurantService.deleteRestaurant(id);

        return new ResponseEntity<String>("Restaurant Deleted Successfully!", HttpStatus.OK);
    }
//    public List<Object[]> getAverageRatings(){
//        return
//    }

//    @GetMapping("/avg/{id}")
//    public ResponseEntity<Restaurant> getAverage(@PathVariable(name = "id") int id, @RequestBody Restaurant restaurant){
//        return new ResponseEntity<Restaurant>(restaurantService.getAvg(restaurant, id), HttpStatus.OK);
//    }
}
