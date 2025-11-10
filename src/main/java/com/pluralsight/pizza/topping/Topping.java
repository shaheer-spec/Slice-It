package com.pluralsight.pizza.topping;

import com.pluralsight.pizza.product.Pizza;

public abstract class Topping extends Pizza {
    private String name;

    public Topping(String size, String crustType, boolean isStuffedCrust, String name) {
        super(size, crustType, isStuffedCrust);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
