package com.pluralsight.pizza.product;

import com.pluralsight.pizza.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product{
    private String size;
    private String crustType;
    private boolean isStuffedCrust;
    private List<Topping> toppings;

    public Pizza(int orderNumber, String name, double price, String size, String crustType, boolean isStuffedCrust) {
        super(orderNumber, name, price);
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

    @Override
    public double calculatePrice(double price){
        return 0;
    }

    public void removeToppings(){
        // nothing for now
    }

    public void displayPizza(){
        // nothing for now
    }
}
