package com.pluralsight.pizza.topping;

public class RegularTopping extends Topping{

    public RegularTopping(String name, boolean extra) {
        super(name);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}