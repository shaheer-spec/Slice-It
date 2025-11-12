package com.pluralsight.pizza.topping.premium;

public class Cheese extends Premium{

    public Cheese(String name, boolean hasExtra) {
        super(name, hasExtra);
    }

    public double getPrice(String size){
        double price = 0;

        if (size.equalsIgnoreCase("small")){
            price = 0.75;
            if (isHasExtra()){
                price += 0.3;
            }
        } else if (size.equalsIgnoreCase("medium")) {
            price = 1.5;
            if (isHasExtra()){
                price += 0.6;
            }
        } else if (size.equalsIgnoreCase("large")) {
            price = 2.25;
            if (isHasExtra()){
                price += 0.9;
            }
        }
        return price;
    }
}
