package com.springboot.proj.repository;

import com.springboot.proj.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
//    List<Object[]> getAvg();
}
