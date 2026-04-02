package com.inventory.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Integer quantity;
    private String description;

    public Product() {}

    public Product(String name, Double price, Integer quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    // getters and setters

    @Override
    public String toString() {
        return name + " - " + price + " - " + quantity;
    }
}