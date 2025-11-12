package com.pluralsight.pizza.topping.premium;

import com.pluralsight.pizza.topping.Topping;

public abstract class Premium extends Topping {
    private boolean hasExtra;

    public Premium(String name, boolean hasExtra) {
        super(name);
        this.hasExtra = hasExtra;
    }

    public boolean isHasExtra() {
        return hasExtra;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
