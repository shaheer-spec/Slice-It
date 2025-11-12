package com.pluralsight.pizza.product;

public class GarlicKnot extends Product{

    public GarlicKnot() {
    }

    @Override
    public double calculatePrice() {
        return 1.5;
    }

    @Override
    public String toString() {
        return "Garlic Knots - $" + calculatePrice();
    }
}
