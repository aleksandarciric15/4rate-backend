package com.example.backend4rate.services;

import com.example.backend4rate.exceptions.NotFoundException;
import com.example.backend4rate.models.dto.Restaurant;
import com.example.backend4rate.models.dto.RestaurantBlock;
import com.example.backend4rate.models.dto.UpdateRestaurant;

import java.util.List;

public interface RestaurantServiceInterface {
    List<Restaurant> getAll();

    boolean blockRestaurant(RestaurantBlock restaurantToBlock) throws NotFoundException;

    Restaurant getRestaurant(Integer userAccountId) throws NotFoundException;

    Restaurant getRestaurantById(Integer id) throws NotFoundException;

    boolean updateRestaurant(UpdateRestaurant updateRestaurant) throws NotFoundException;
}
