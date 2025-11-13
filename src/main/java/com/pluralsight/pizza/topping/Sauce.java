package com.pluralsight.pizza.topping;

public class Sauce extends Topping{

    public Sauce(String name, boolean extra) {
        super(name);
    }

    @Override
    public double getPrice(String size){
        return 0;
    }

    @Override
    public String toString() {
        return getName();
    }
}
