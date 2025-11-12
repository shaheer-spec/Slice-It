package com.pluralsight.pizza.product;

public class GarlicKnot extends Product{

    public GarlicKnot() {
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Garlic Knots - $" + calculatePrice();
    }
}
