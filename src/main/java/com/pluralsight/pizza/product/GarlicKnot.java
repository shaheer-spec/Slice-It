package com.pluralsight.pizza.product;

public class GarlicKnot extends Product{
    public static final String RED = "\u001B[31m";
    public static final String DEFAULT = "\u001B[0m";

    public GarlicKnot() {
        super("Garlic Knots");
    }

    @Override
    public double calculatePrice() {
        return 1.5;
    }

    @Override
    public String toString() {
        return "Garlic Knots - " + RED + "$" + calculatePrice() + DEFAULT;
    }
}
