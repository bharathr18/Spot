package com.spot.spot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController("/spot")
public class OrderVegetables {
    @GetMapping("/orderVeg")
    public String orderVegetables(HashMap<String, Object> orderData)
    {

        return "Your veggies are ordered and will be delivered tomorrow";
    }
}
