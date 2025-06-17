package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class AppRunner implements CommandLineRunner {
    SimpleProductDao dao;

    @Autowired
    public AppRunner(SimpleProductDao dao) {
        this.dao = dao;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.) List Products");
            System.out.println("2.) Add Products");
            System.out.println("3.) Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Product> products = dao.getAll();
                    products.forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter Product Category: ");
                    String category = scanner.nextLine();

                    dao.add(new Product(id, name, price, category));
                    System.out.println("Product added!");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
