package com.pluralsight.pizza.main;

import com.pluralsight.pizza.order.Order;
import com.pluralsight.pizza.product.Drink;
import com.pluralsight.pizza.product.GarlicKnot;
import com.pluralsight.pizza.product.Pizza;
import com.pluralsight.pizza.product.signature.BBQChickenPizza;
import com.pluralsight.pizza.product.signature.MargheritaPizza;
import com.pluralsight.pizza.product.signature.MeatLoversPizza;
import com.pluralsight.pizza.product.signature.VeggiePizza;
import com.pluralsight.pizza.receipt.ReceiptDataManager;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder;
    public static final String DEFAULT = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";

    public void homeScreen(){

        boolean quit = false;

        while (!quit){
            System.out.println(BLUE +
                               "╔════════════════╗");
            System.out.println("║    Slice It    ║");
            System.out.println("╚════════════════╝" + DEFAULT);
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
            System.out.println(GREEN + "╔══════════════════╗");
            System.out.println("║    Order Menu    ║");
            System.out.println("╚══════════════════╝" + DEFAULT);

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
        System.out.println(YELLOW + "╔═════════════════╗");
        System.out.println("║    Add Pizza    ║");
        System.out.println("╚═════════════════╝" + DEFAULT);

        System.out.print("Select your type (1. Custom Pizza, 2. Signature): ");
        int pizza = scanner.nextInt();
        scanner.nextLine();

        Pizza newPizzaOrder = null;
        if (pizza == 1) {
            String pizzaType = "Custom Pizza";
            System.out.print("What size (Small/ medium/ Large): ");
            String pizzaSize = scanner.nextLine();

            System.out.print("What crust do you want for your pizza (thin / regular / thick / cauliflower): ");
            String pizzaCrust = scanner.nextLine();

            System.out.print("Do you want stuffed crust? (Yes/ No): ");
            String stuffedHolder = scanner.nextLine();
            boolean pizzaStuffedCrust = stuffedHolder.equalsIgnoreCase("yes");

            newPizzaOrder = new Pizza(pizzaType, pizzaSize, pizzaCrust, pizzaStuffedCrust);

            customizeTopping(newPizzaOrder);
            currentOrder.addProduct(newPizzaOrder);
            System.out.println("Custom Pizza Added");

        } else if (pizza == 2) {
            System.out.println("Choose a Signature Pizza:");
            System.out.println("1. Margherita");
            System.out.println("2. Veggie");
            System.out.println("3. Meat Lovers");
            System.out.println("4. BBQ Chicken");
            System.out.println("0. Cancel");

            int signaturePizza = scanner.nextInt();
            scanner.nextLine();

            switch (signaturePizza) {
                case 1 -> newPizzaOrder = new MargheritaPizza();
                case 2 -> newPizzaOrder = new VeggiePizza();
                case 3 -> newPizzaOrder = new MeatLoversPizza();
                case 4 -> newPizzaOrder = new BBQChickenPizza();
                case 0 -> { return; }
                default -> {
                    System.out.println("Wrong Input");
                    return;
                }
            }

            customizeTopping(newPizzaOrder);
            System.out.println("Signature Pizza Added");
        }

        currentOrder.addProduct(newPizzaOrder);
        System.out.println("Added Pizza Successfully");
    }

    private void customizeTopping(Pizza pizza){
        boolean done = false;
        while (!done) {
            System.out.println(" ");
            System.out.println("Choose a topping:");
            System.out.println("1. Meats");
            System.out.println("2. Cheeses");
            System.out.println("3. Other Toppings");
            System.out.println("4. Sauces");
            System.out.println("5. Remove Topping");
            System.out.println("0. Done Adding Toppings");
            System.out.print("Your choice: ");
            int userToppings = scanner.nextInt();
            scanner.nextLine();

            switch (userToppings) {
                case 1 -> pizza.addMeatToppings(pizza, scanner);
                case 2 -> pizza.addCheeseToppings(pizza, scanner);
                case 3 -> pizza.addRegularToppings(pizza, scanner);
                case 4 -> pizza.addSauceToppings(pizza, scanner);
                case 5 -> pizza.removeToppings(scanner);
                case 0 -> done = true;
                default -> System.out.println("Wrong Input, Try Again.");
            }
        }
    }

    private void addDrink(){
        System.out.println(GREEN + "╔═════════════════╗");
        System.out.println("║    Add Drink    ║");
        System.out.println("╚═════════════════╝" + DEFAULT);

        System.out.println("1. Coke | 2. Pepsi | 3. Water | 4. Sprite | 5. Fanta | 6. 7Up | 0. Return");

        System.out.print("Choose a drink: ");
        int drinkChoice = scanner.nextInt();
        scanner.nextLine();

        if (drinkChoice == 0) {
            return;
        }

        String drinkName = "";
        switch (drinkChoice) {
            case 1 -> drinkName = "Coke";
            case 2 -> drinkName = "Pepsi";
            case 3 -> drinkName = "Water";
            case 4 -> drinkName = "Sprite";
            case 5 -> drinkName = "Fanta";
            case 6 -> drinkName = "7Up";
            default -> {
                System.out.println("Invalid option. Try again.");
                return;
            }
        }

        System.out.println("Select size:");
        System.out.println("1. Small | 2. Medium | 3. Large");
        System.out.print("Choose a size: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String drinkSize = "";
        switch (size) {
            case 1 -> drinkSize = "small";
            case 2 -> drinkSize = "medium";
            case 3 -> drinkSize = "large";
            default -> {
                System.out.println("Invalid size. Try again.");
                return;
            }
        }

        Drink drink = new Drink(drinkName, drinkSize);
        currentOrder.addProduct(drink);
        System.out.println("Drink Added to order");
    }

    private void addGarlicKnot(){
        System.out.println(GREEN + "╔════════════════════════╗");
        System.out.println("║    Add Garlic Knots    ║");
        System.out.println("╚════════════════════════╝" + DEFAULT);

        GarlicKnot garlicKnot = new GarlicKnot();
        currentOrder.addProduct(garlicKnot);
        System.out.println("Added a order of Garlic Knots");
    }

    private void checkout(){
        System.out.println(GREEN + "╔════════════════╗");
        System.out.println("║    Checkout    ║");
        System.out.println("╚════════════════╝" + DEFAULT);

        if (currentOrder.getProduct().isEmpty()){
            System.out.println("You have no items in this order");
            return;
        }

        currentOrder.printOrder();

        System.out.println("Are you done with the order? (Yes/No)");
        String confirmOrder = scanner.nextLine();

        if (confirmOrder.equalsIgnoreCase("yes")){
            ReceiptDataManager receiptDataManager = new ReceiptDataManager();
            receiptDataManager.saveContract(currentOrder);
            System.out.println("Order successfully placed");
        } else {
            System.out.println("Order not placed");
        }
    }

}
