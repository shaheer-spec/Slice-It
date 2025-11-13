package com.pluralsight.pizza.product.signature;

import com.pluralsight.pizza.product.Pizza;
import com.pluralsight.pizza.topping.Sauce;
import com.pluralsight.pizza.topping.premium.Cheese;
import com.pluralsight.pizza.topping.premium.Meat;

public class MeatLoversPizza extends Pizza {

    public MeatLoversPizza() {
        super("Meat Lovers", "large", "regular", false);

        addToppings(new Meat("pepperoni", false));
        addToppings(new Meat("sausage", false));
        addToppings(new Meat("ham", false));
        addToppings(new Meat("bacon", false));
        addToppings(new Sauce("marinara", false));
        addToppings(new Cheese("mozzarella", false));
    }
}
