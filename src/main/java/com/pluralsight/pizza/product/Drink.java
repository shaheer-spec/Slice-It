package com.pluralsight.pizza.product;

public class Drink extends Product{

    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
