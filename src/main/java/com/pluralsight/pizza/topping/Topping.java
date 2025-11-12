package com.pluralsight.pizza.topping;

import com.pluralsight.pizza.product.Pizza;

public abstract class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
