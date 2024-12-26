package com.spot.spot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    private String Name;
    private String HouseNumber;
    private String phoneNumber;
}
