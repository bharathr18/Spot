package com.spot.spot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface OrderVegetables  extends JpaRepository<String, Object> {

    String orderVeg(HashMap<String, Object> orderMap);
}
