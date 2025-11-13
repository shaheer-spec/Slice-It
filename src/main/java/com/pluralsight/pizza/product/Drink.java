package com.pluralsight.pizza.product;

public class Drink extends Product{
    private String size;

    public Drink(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        if (size.equalsIgnoreCase("small")){
            price = 2;
        } else if (size.equalsIgnoreCase("medium")) {
            price = 2.5;
        } else if (size.equalsIgnoreCase("large")) {
            price = 3;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Drink: " + name + " (" + size + ") - $" + calculatePrice();
    }
}
