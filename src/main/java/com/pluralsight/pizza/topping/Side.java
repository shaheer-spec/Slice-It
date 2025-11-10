package com.pluralsight.pizza.topping;

public class Side extends Topping{
    public Side(int orderNumber, String name, double price, String size, String crustType, boolean isStuffedCrust, String name1) {
        super(orderNumber, name, price, size, crustType, isStuffedCrust, name1);
    }

    @Override
    public double getPrice(String size, double price) {
        return price += 0;
    }
}
