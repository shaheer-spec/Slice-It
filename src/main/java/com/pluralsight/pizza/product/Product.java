package com.pluralsight.pizza.product;

import com.pluralsight.pizza.order.Order;

public abstract class Product {
    String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}