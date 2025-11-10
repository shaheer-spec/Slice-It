package com.pluralsight.pizza.topping;

public class Side extends Topping{

    public Side(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }
}
