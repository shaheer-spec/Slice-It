package com.pluralsight.pizza.main;

import com.pluralsight.pizza.order.Order;
import com.pluralsight.pizza.product.Drink;
import com.pluralsight.pizza.product.GarlicKnot;
import com.pluralsight.pizza.product.Pizza;
import com.pluralsight.pizza.product.Product;
import com.pluralsight.pizza.receipt.ReceiptDataManager;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void homeScreen(){

        boolean quit = false;

        while (!quit){
            System.out.println("╔════════════════╗");
            System.out.println("║    Slice It    ║");
            System.out.println("╚════════════════╝");
            System.out.println("1. New Order");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    orderScreen();
                    break;
                case 0:
                    quit = true;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Wrong Input, Try Again");
            }
        }
    }

    private void orderScreen(){
        boolean quit2 = false;
        int randomOrderNumber = (int) ((Math.random() * 10) + 1);
        currentOrder = new Order(randomOrderNumber);

        while(!quit2){
            System.out.println("╔══════════════════╗");
            System.out.println("║    Order Menu    ║");
            System.out.println("╚══════════════════╝");

            System.out.println("1) Add Pizza");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Garlic Knots");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            System.out.print("Your Choice: ");

            int userInput2 = scanner.nextInt();
            scanner.nextLine();

            switch (userInput2){
                case 1:
                    addPizza();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addGarlicKnot();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    quit2 = true;
                    System.out.println("Order Canceled");
                    break;
                default:
                    System.out.println("Wrong Input, Try Again");
            }
        }
    }

    private void addPizza(){
        System.out.println("╔═════════════════╗");
        System.out.println("║    Add Pizza    ║");
        System.out.println("╚═════════════════╝");

        System.out.print("Select your type (Custom, Signature): ");
        String pizzaType = scanner.nextLine();

        System.out.print("What size (Small/ medium/ Large): ");
        String pizzaSize = scanner.nextLine();

        System.out.print("What crust do you want for your pizza (thin / regular / thick / cauliflower) :");
        String pizzaCrust = scanner.nextLine();

        System.out.print("Do you want stuffed crust? (Yes/ No)");
        String stuffedHolder = scanner.nextLine();
        boolean pizzaStuffedCrust = stuffedHolder.equalsIgnoreCase("yes");

        double basePrice = 0;
        Pizza newPizzaOrder = new Pizza(pizzaType, basePrice, pizzaSize, pizzaCrust, pizzaStuffedCrust);

        System.out.println("Lets go through your toppings one at a time (say done when finished): ");
        while(true){
            System.out.println("Enter Topping Name: ");
            String topping = scanner.nextLine();

            if (topping.equalsIgnoreCase("done")){
                break;
            }
            newPizzaOrder.addToppings();
        }

        currentOrder.addProduct(newPizzaOrder);
        System.out.println("Added Pizza Successfully");
    }

    private void addDrink(){
        System.out.println("╔═════════════════╗");
        System.out.println("║    Add Drink    ║");
        System.out.println("╚═════════════════╝");

        System.out.print("Enter Drink name: ");
        String drinkName = scanner.nextLine();

        System.out.print("Enter size: (small/ medium/ large)");
        String drinkSize = scanner.nextLine();

        Drink drink = new Drink(drinkName, drinkSize);
        currentOrder.addProduct(drink);
        System.out.println("Drink Added to order");
    }

    private void addGarlicKnot(){
        System.out.println("╔════════════════════════╗");
        System.out.println("║    Add Garlic Knots    ║");
        System.out.println("╚════════════════════════╝");

        GarlicKnot garlicKnot = new GarlicKnot();
        currentOrder.addProduct(garlicKnot);
        System.out.println("Added a order of Garlic Knots");
    }

    private void checkout(){
        System.out.println("╔════════════════╗");
        System.out.println("║    Checkout    ║");
        System.out.println("╚════════════════╝");

        if (currentOrder.getProduct().isEmpty()){
            System.out.println("You have no items in this order");
            return;
        }

        currentOrder.printOrder();

        double total = currentOrder.total();
        System.out.println("Are you done with the order? (Yes/No)");
        String confirmOrder = scanner.nextLine();

        if (confirmOrder.equalsIgnoreCase("yes")){
            ReceiptDataManager receiptDataManager = new ReceiptDataManager();
            // have to complete the receiptDataManager class
            System.out.println("Order successfully placed");
        } else {
            System.out.println("Order not placed");
        }
    }

}
