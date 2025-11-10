package com.pluralsight.pizza.topping;

public class Sauce extends Topping{
    public Sauce(int orderNumber, String name, double price, String size, String crustType, boolean isStuffedCrust, String name1) {
        super(orderNumber, name, price, size, crustType, isStuffedCrust, name1);
    }

    public double getPrice(String size){
        return 0;
    }
}
