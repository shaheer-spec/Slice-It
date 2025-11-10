package com.pluralsight.pizza.order;

import com.pluralsight.pizza.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> Product;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        Product = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Product> getProduct() {
        return Product;
    }

    public void addProduct(){
        // noting for now
    }

    public double total(){
        return 0;
    }

    private void printOrder(){
        // noting for now
    }
}
