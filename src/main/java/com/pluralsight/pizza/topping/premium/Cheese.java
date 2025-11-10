package com.pluralsight.pizza.topping.premium;

public class Cheese extends Premium{

    public Cheese(boolean hasExtra) {
        super(hasExtra);
    }

    public double getPrice(String size){
        // same instructions as meat
        return 0;
    }

    public double extraCheese(String size){
        return 0;
    }
}
