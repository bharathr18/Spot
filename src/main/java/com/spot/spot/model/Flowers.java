package com.spot.spot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "flowers")
public class Flowers {
    private String name;
    private String quantity;
}
