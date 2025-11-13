package com.pluralsight.pizza.product.signature;

import com.pluralsight.pizza.product.Pizza;
import com.pluralsight.pizza.topping.RegularTopping;
import com.pluralsight.pizza.topping.Sauce;
import com.pluralsight.pizza.topping.premium.Cheese;

public class MargheritaPizza extends Pizza {

    public MargheritaPizza(String name, String size, String crustType, boolean isStuffedCrust) {
        super("Margherita", "medium", "regular", false);
        addToppings(new Cheese("mozzarella", false));
        addToppings(new RegularTopping("tomatoes", false));
        addToppings(new RegularTopping("basil", false));
        addToppings(new Sauce("marinara", false));
        addToppings(new Sauce("olive oil", false));
    }
}
