package com.pluralsight.pizza.product;

import com.pluralsight.pizza.order.Order;

public abstract class Product {
    String name;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return calculatePrice();
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return name + " - $" + calculatePrice();
    }
}