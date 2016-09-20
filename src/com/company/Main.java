package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            HashMap<String, Guitar> gtr = new HashMap<>();
            ArrayList<String> users = new ArrayList<>();
        while (true) {

            System.out.println("Enter your username to begin: ");
            String uname = scanner.nextLine();
            users.add(uname);

            boolean isLoggedIn = true;
            while (isLoggedIn) {
                System.out.println("1. Add an item to Inventory");
                System.out.println("2. Remove item from Inventory");
                System.out.println("3. List all Inventory Items");
                System.out.println("4. Update quanity of an Item");
                System.out.println("5. Logout");

                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        System.out.print("Enter item number: ");
                        String x = scanner.nextLine();
                        System.out.print("Enter the item brand: ");
                        String y = scanner.nextLine();
                        System.out.print("Enter the quantity: ");
                        int z = Integer.parseInt(scanner.nextLine());

                        if (gtr.containsKey(x)) {
                            gtr.get(x).setQuantity(gtr.get(x).quantity + z);
                        } else {
                            Guitar addGuitar = new Guitar(x, y, z);
                            gtr.put(x, addGuitar);

                        }
                        break;
                    case "2":
                        System.out.print("Enter Item No.: ");
                        x = scanner.nextLine();
                        gtr.remove(x);
                        break;
                    case "3":
                        for (String out : gtr.keySet()) {
                            int qty = gtr.get(out).quantity;
                            String brandOut = gtr.get(out).brand;
                            System.out.println(out + " " + brandOut + " " + qty);
                        }
                        break;
                    case "4":
                        System.out.println("Enter the item number you want to update:");
                        x = scanner.nextLine();
                        System.out.println("How many itmes are you adding to the current total?");
                        z = Integer.parseInt(scanner.nextLine());
                        int newQty = gtr.get(x).quantity + z;
                        gtr.get(x).quantity = newQty;
                        break;
                    case "5":
                        isLoggedIn = false;


                }
            }
        }
    }
}


