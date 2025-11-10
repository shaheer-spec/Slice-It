package com.pluralsight.pizza.product;

import com.pluralsight.pizza.order.Order;

public abstract class Product {
    private String name;
    private double price;

    public Product(int orderNumber, String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract double calculatePrice(double price);

}
