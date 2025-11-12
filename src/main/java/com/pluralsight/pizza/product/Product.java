package com.pluralsight.pizza.product;

import com.pluralsight.pizza.order.Order;

public abstract class Product {
    private String name;
    private double price;

    public abstract double calculatePrice();

}
