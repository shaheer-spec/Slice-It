package com.pluralsight.pizza.product;

import com.pluralsight.pizza.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crustType;
    private boolean isStuffedCrust;
    private List<Topping> toppings;

    public Pizza(String size, String crustType, boolean isStuffedCrust) {
        this.size = size;
        this.crustType = crustType;
        this.isStuffedCrust = isStuffedCrust;
        this.toppings = new ArrayList<>();
    }

    public String getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public boolean isStuffedCrust() {
        return isStuffedCrust;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addToppings(){
        // nothing for now
    }

    public double calculatePrice(){
        return 0;
    }

    public void removeToppings(){
        // nothing for now
    }

    public void displayPizza(){
        // nothing for now
    }
}
