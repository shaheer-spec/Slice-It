package com.pluralsight.pizza.product.signature;

import com.pluralsight.pizza.product.Pizza;
import com.pluralsight.pizza.topping.RegularTopping;
import com.pluralsight.pizza.topping.Sauce;
import com.pluralsight.pizza.topping.premium.Cheese;

public class VeggiePizza extends Pizza {

    public VeggiePizza(String name, String size, String crustType, boolean isStuffedCrust) {
        super("Veggie", "small", "regular", false);

        addToppings(new RegularTopping("bell peppers", false));
        addToppings(new RegularTopping("spinach", false));
        addToppings(new RegularTopping("olives", false));
        addToppings(new RegularTopping("onions", false));
        addToppings(new Sauce("marinara", false));
        addToppings(new Cheese("mozzarella", false));
    }
}