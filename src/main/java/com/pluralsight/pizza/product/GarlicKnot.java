package com.pluralsight.pizza.product;

public class GarlicKnot extends Product{

    public GarlicKnot(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

}
