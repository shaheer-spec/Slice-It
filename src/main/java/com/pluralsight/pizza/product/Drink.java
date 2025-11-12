package com.pluralsight.pizza.product;

public class Drink extends Product{
    private String size;
    private String name;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Drink: " + getName() + " (" + size + ") - $" + calculatePrice();
    }
}
