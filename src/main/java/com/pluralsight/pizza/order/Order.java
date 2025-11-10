package com.pluralsight.pizza.order;

import com.pluralsight.pizza.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> Products;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        Products = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Product> getProduct() {
        return Products;
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
