package com.pluralsight.pizza.topping;

import com.pluralsight.pizza.product.Pizza;

public abstract class Topping extends Pizza {
    private String name;

    public Topping(int orderNumber, String name, double price, String size, String crustType, boolean isStuffedCrust, String name1) {
        super(orderNumber, name, price, size, crustType, isStuffedCrust);
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice(String size);
}
