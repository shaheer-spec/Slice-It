package com.pluralsight.pizza.receipt;

import com.pluralsight.pizza.order.Order;
import com.pluralsight.pizza.product.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptDataManager {

    public void saveContract(Order order){
        try {
            if (order == null) {
                System.out.println("Order was null. Cannot save receipt.");
                return;
            }

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String time = now.format(formatter);

            String fileName = time + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            writer.write("Receipt");
            writer.newLine();

            writer.write("Order number - " + order.getOrderNumber());
            writer.newLine();

            writer.write("=======================================");
            writer.newLine();

            for (Product product : order.getProduct()) {
                writer.write(product.getName() + " | " + "$" + product.getPrice());
                writer.newLine();
            }

            writer.write("=======================================");
            writer.newLine();

            writer.write("Total - " + "$" + order.total());
            writer.newLine();

            writer.close();
            System.out.println("Receipt successfully saved");

        }catch (Exception ex) {
            System.err.println("Error saving the receipt");
        }
    }
}
