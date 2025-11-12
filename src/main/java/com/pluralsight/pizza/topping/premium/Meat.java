package com.pluralsight.pizza.topping.premium;

public class Meat extends Premium{

    public Meat(String name, boolean hasExtra) {
        super(name, hasExtra);
    }

    public double getPrice(String size){
        double price = 0;

        if (size.equalsIgnoreCase("small")){
            price = 1;
            if (isHasExtra()){
                price += 0.5;
            }
        } else if (size.equalsIgnoreCase("medium")) {
            price = 2;
            if (isHasExtra()){
                price += 1;
            }
        } else if (size.equalsIgnoreCase("large")) {
            price = 3;
            if (isHasExtra()){
                price += 1.5;
            }
        }
        return price;
    }
}
