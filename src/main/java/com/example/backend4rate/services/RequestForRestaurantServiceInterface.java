package com.example.backend4rate.services;

import com.example.backend4rate.exceptions.ManagerBlockedException;
import com.example.backend4rate.exceptions.NotFoundException;
import com.example.backend4rate.models.dto.RequestForRestaurant;
import com.example.backend4rate.models.dto.RequestForRestaurantResponse;

import java.util.List;

public interface RequestForRestaurantServiceInterface {

    RequestForRestaurantResponse createRequestForRestaurant(RequestForRestaurant request, Integer managerInteger)
            throws NotFoundException;

    boolean approveRequestForRestaurant(Integer requestId) throws NotFoundException, ManagerBlockedException;

    boolean denyRequestForRestaurant(Integer requestId) throws NotFoundException;

    RequestForRestaurantResponse getRequestForRestaurant(Integer id) throws NotFoundException;

    List<RequestForRestaurantResponse> getAllRequestForRestaurant();

    boolean cancelRequestForRestaurant(Integer id) throws NotFoundException;
}
