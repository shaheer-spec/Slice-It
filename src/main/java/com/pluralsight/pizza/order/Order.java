package com.pluralsight.pizza.order;

import com.pluralsight.pizza.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> products;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        products = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double total(){
        double sum = 0;

        for (Product product : products) {
            sum += product.calculatePrice();
        }
        return sum;
    }

    public void printOrder(){
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Current Items in your order are: ");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Your total is: $" + total());
    }
}
