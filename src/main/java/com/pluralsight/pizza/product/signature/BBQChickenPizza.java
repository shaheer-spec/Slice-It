package com.pluralsight.pizza.product.signature;

import com.pluralsight.pizza.product.Pizza;
import com.pluralsight.pizza.topping.RegularTopping;
import com.pluralsight.pizza.topping.Sauce;
import com.pluralsight.pizza.topping.premium.Cheese;
import com.pluralsight.pizza.topping.premium.Meat;

public class BBQChickenPizza extends Pizza {

    public BBQChickenPizza() {
        super("BBQ Chicken", "medium", "regular", false);

        addToppings(new Meat("chicken", false));
        addToppings(new RegularTopping("onions", false));
        addToppings(new RegularTopping("basil", false));
        addToppings(new Sauce("bbq", false));
        addToppings(new Cheese("mozzarella", false));
    }
}
