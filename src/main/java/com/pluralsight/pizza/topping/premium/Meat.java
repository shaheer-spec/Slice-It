package com.pluralsight.pizza.topping.premium;

public class Meat extends Premium{

    public Meat(boolean hasExtra) {
        super(hasExtra);
    }

    public double getPrice(String size){
        /*
        Check what size the pizza is.
        Use that to determine the base price for that size.
        If hasExtra is true, add the extra meat cost for that size.
        Return that total price.
         */

        return 0;
        // should return the price of topping
    }

    public double extraMeat(){
        /*
When the topping is first created, hasExtra = false.
If the user adds extra meat/cheese, the system calls the method.
The method updates the internal state to hasExtra = true.
When the pizza’s price is calculated later, getPrice(size) checks that flag:
If false → return the base price.
If true → return base price + extra charge.
         */
        return 0;
    }
}
