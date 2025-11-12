package com.pluralsight.pizza.main;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

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
                    // new Order method
                case 2:
                    quit = true;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Wrong Input, Try Again");
            }
        }
    }



}
