package com.pluralsight.pizza.product;

import com.pluralsight.pizza.topping.RegularTopping;
import com.pluralsight.pizza.topping.Sauce;
import com.pluralsight.pizza.topping.Topping;
import com.pluralsight.pizza.topping.premium.Cheese;
import com.pluralsight.pizza.topping.premium.Meat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza extends Product{
    private String size;
    private String crustType;
    private boolean isStuffedCrust;
    private List<Topping> toppings;

    public Pizza(String name, String size, String crustType, boolean isStuffedCrust) {
        super(name);
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
            price += topping.getPrice(size);
        }

        return price;
    }

    public void removeToppings(){
        // nothing for now
    }

    public void addMeatToppings(Pizza pizza, Scanner scanner){
        System.out.println("╔═════════════╗");
        System.out.println("║    Meats    ║");
        System.out.println("╚═════════════╝");

        System.out.println("1. pepperoni | 2. sausage | 3. ham | 4. bacon | 5. chicken | 6. meatball | 0. return");
        System.out.print("choose a option: ");
        int meatTopping = scanner.nextInt();
        scanner.nextLine();

        if (meatTopping == 0){return;}

        String meat = "";
        switch (meatTopping) {
            case 1 -> meat = "pepperoni";
            case 2 -> meat = "sausage";
            case 3 -> meat = "ham";
            case 4 -> meat = "bacon";
            case 5 -> meat = "chicken";
            case 6 -> meat = "meatball";
            default -> {
                System.out.println("Wrong Input, Try Again");
            }
        }
        System.out.print("Do you want extra " + meat + " (yes/no): ");
        String extraMeat = scanner.nextLine();
        boolean extra = extraMeat.equalsIgnoreCase("yes");

        pizza.addToppings(new Meat(meat, extra));
        System.out.println("Added: " + meat);

    }

    public void addCheeseToppings(Pizza pizza, Scanner scanner){
        System.out.println("╔══════════════╗");
        System.out.println("║   Cheeses    ║");
        System.out.println("╚══════════════╝");

        System.out.println("1. mozzarella | 2. parmesan | 3. ricotta | 4. goat cheese | 5. buffalo | 0. return");
        System.out.print("choose an option: ");
        int cheeseOption = scanner.nextInt();
        scanner.nextLine();

        if (cheeseOption == 0) {return;}

        String cheese = "";
        switch (cheeseOption) {
            case 1 -> cheese = "mozzarella";
            case 2 -> cheese = "parmesan";
            case 3 -> cheese = "ricotta";
            case 4 -> cheese = "goat cheese";
            case 5 -> cheese = "buffalo";
            default -> {
                System.out.println("Wrong input, try again.");
                return; // stop method and return to menu
            }
        }

        System.out.print("Do you want extra " + cheese + " (yes/no): ");
        String extraCheese = scanner.nextLine();
        boolean extra = extraCheese.equalsIgnoreCase("yes");

        pizza.addToppings(new Cheese(cheese, extra));
        System.out.println("Added: " + cheese);
    }

    public void addRegularToppings(Pizza pizza, Scanner scanner){
        System.out.println("╔════════════════════╗");
        System.out.println("║   Regular Toppings ║");
        System.out.println("╚════════════════════╝");

        while (true){
            System.out.println("1. onions | 2. mushrooms | 3. bell peppers | 4. olives | 5. tomatoes | 6. spinach | 7. basil | 8. pineapple | 9. anchovies | 0. return");
            System.out.print("choose an option: ");

            int regularOption = scanner.nextInt();
            scanner.nextLine();

            if (regularOption == 0) {return;}

            String toppingName = "";
            switch (regularOption) {
                case 1 -> toppingName = "onions";
                case 2 -> toppingName = "mushrooms";
                case 3 -> toppingName = "bell peppers";
                case 4 -> toppingName = "olives";
                case 5 -> toppingName = "tomatoes";
                case 6 -> toppingName = "spinach";
                case 7 -> toppingName = "basil";
                case 8 -> toppingName = "pineapple";
                case 9 -> toppingName = "anchovies";
                default -> {
                    System.out.println("Wrong Input, Try Again");
                    continue;
                }
            }
            System.out.print("Do you want extra " + toppingName + "? (yes/no): ");
            String extraInput = scanner.nextLine();
            boolean extra = extraInput.equalsIgnoreCase("yes");

            pizza.addToppings(new RegularTopping(toppingName, extra));
            System.out.println("Added: " + toppingName);
        }
    }

    public void addSauceToppings(Pizza pizza, Scanner scanner){
        System.out.println("╔════════════╗");
        System.out.println("║   Sauces   ║");
        System.out.println("╚════════════╝");

        while (true){
            System.out.println("1. marinara | 2. alfredo | 3. pesto | 4. bbq | 5. buffalo | 6. olive oil | 0. return");
            System.out.print("choose an option: ");
            int sauceOption = scanner.nextInt();
            scanner.nextLine();

            if (sauceOption == 0) {return;}

            String sauceName = "";
            switch (sauceOption) {
                case 1 -> sauceName = "marinara";
                case 2 -> sauceName = "alfredo";
                case 3 -> sauceName = "pesto";
                case 4 -> sauceName = "bbq";
                case 5 -> sauceName = "buffalo";
                case 6 -> sauceName = "olive oil";
                default -> {
                    System.out.println("Wrong Input, Try Again");
                    continue;
                }
            }

            System.out.print("Do you want extra " + sauceName + "? (yes/no): ");
            String extraInput = scanner.nextLine();
            boolean extra = extraInput.equalsIgnoreCase("yes");

            pizza.addToppings(new Sauce(sauceName, extra));
            System.out.println("Added: " + sauceName);

        }
    }

    @Override
    public String toString() {
        String base =  "Pizza: " + size + " " + crustType + " Crust - $" + calculatePrice();
        if (toppings.isEmpty()){
            return base + "\nNo Toppings";
        }

        String line = "";
        for (int i = 0; i < toppings.size(); i++) {
            Topping topping = toppings.get(i);
            line += topping.toString();
            line += ", ";
        }

        line = line.substring(0, line.length()-2);
        return base + "\nToppings - " + line;
    }
}