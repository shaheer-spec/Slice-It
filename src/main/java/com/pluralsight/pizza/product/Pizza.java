package com.pluralsight.pizza.product;

import com.pluralsight.pizza.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product{
    private String size;
    private String crustType;
    private boolean isStuffedCrust;
    private List<Topping> toppings;

    public Pizza(String name, double price, String size, String crustType, boolean isStuffedCrust) {
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

    public void addToppings(Topping topping){
        if (toppings != null){
            toppings.add(topping);
        }
    }

    @Override
    public double calculatePrice(){
        double price = 0;

        if (size.equalsIgnoreCase("small")){
            price = 8.50;
        } else if (size.equalsIgnoreCase("medium")) {
            price = 12;
        } else if (size.equalsIgnoreCase("large")) {
            price = 16.50;
        }

        if (isStuffedCrust){
            price += 1.5;
        }

        for (Topping topping : toppings) {
            price += topping.getPrice();
        }

        return price;
    }

    public void removeToppings(){
        // nothing for now
    }

    public void displayPizza(){
        // nothing for now
    }

    @Override
    public String toString() {
        return "Pizza: " + size + " " + crustType + " Crust - $" + calculatePrice();
    }
}