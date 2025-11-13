package com.pluralsight.pizza.topping;

public class Sauce extends Topping{

    public Sauce(String name, boolean extra) {
        super(name);
    }

    @Override
    public double getPrice(){
        return 0;
    }
}
