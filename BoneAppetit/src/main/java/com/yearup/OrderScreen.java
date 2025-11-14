package com.yearup;

import Enums.Sizing;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderScreen {
    private ArrayList<YogurtTreat> yogurtOrders = new ArrayList<>();
    private boolean specialPupCup;
    public static void Loading(String message) {

        System.out.println("\n" + message);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public boolean isSpecialPupCup() {
        return specialPupCup;
    }

    public void setSpecialPupCup(boolean specialPupCup) {
        this.specialPupCup = specialPupCup;
    }
    public void mainMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to my thing");
            System.out.println("1. Add Yogurt");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Sides");
            System.out.println("X. Finish Order");
            System.out.println("Pick here:");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addYogurt();
                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addSides();
                    break;
                case "x":
                    writeReceipt(yogurtOrders);

                    running = false;
                    System.out.println("Order finished. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    public void addYogurt() {

        System.out.println("Choose your size: Small, Medium, Large");
        Scanner scanner = new Scanner(System.in);
        YogurtTreat order = new YogurtTreat();
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            order.setSize(Sizing.Size.valueOf(input));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid size entered. Please use SMALL, MEDIUM, or LARGE.");
            return;
        }
        order.getBasePrice(order.getSize());
        System.out.println(order.price);


        System.out.println("Enter flavor base:");
        System.out.println("1. Plain Greek Yogurt");
        System.out.println("2. Peanut Butter");
        System.out.println("3. Banana");
        System.out.println("Pick here:");

        String baseChoice = scanner.nextLine();

        switch (baseChoice) {
            case "1":
                order.setFlaborbase("Vanilla");
                break;
            case "2":
                order.setFlaborbase("Peanut Butter");
                break;
            case "3":
                order.setFlaborbase("Banana");
                break;
            case "4":
                order.setFlaborbase("Pumpkin");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Vanilla.");
                order.setFlaborbase("Vanilla");
                break;
        }

        //todo touppercase,.totrim


        boolean running = true;
        while (running) {
            System.out.println("Choose your Protein Boosts ");
            System.out.println("1. Oats ");
            System.out.println("2. Yogurt Drops");
            System.out.println("3. Quinoa");
            System.out.println("4. Chia Seeds");
            System.out.println("5. Peanut Butter Drops");
            System.out.println("6. Chicken Bits");
            System.out.println("X to finish selection");
            System.out.println("Pick here");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("X")) {
                running = false;
            } else {
                System.out.println("Would you like extra true or false");
                boolean extra = Boolean.parseBoolean(scanner.nextLine());
                ProteinBoost boost = new ProteinBoost();
                switch (choice) {
                    case "1":
                        boost.setName("Oats");
                        boost.setExtra(extra);
                        order.getPremiumList().add(boost);

                        break;
                    case "2":
                        boost.setName("Yogurt Drops");
                        boost.setExtra(extra);
                        order.getPremiumList().add(boost);

                        break;
                    case "3":
                        boost.setName("Quinoa");
                        boost.setExtra(extra);
                        order.getPremiumList().add(boost);

                        break;
                    case "4":
                        boost.setName("Chia Seeds");
                        boost.setExtra(extra);
                        order.getPremiumList().add(boost);

                        break;
                    case "5":
                        boost.setName("Peanut Butter Drops");
                        boost.setExtra(extra);
                        order.getPremiumList().add(boost);

                        break;
                    case "6":
                        boost.setName("Chicken Bits");
                        boost.setExtra(extra);
                        order.getPremiumList().add(boost);
                        break;
                }

            }

        }
        System.out.println("Choose your Healthy Fats! ");
        boolean runninghealthyfats = true;
        while (runninghealthyfats) {
            System.out.println("1.Pumpkin Puree ");
            System.out.println("2. Coconut Oil");
            System.out.println("3. Apple Sauce");
            System.out.println("X to finish selection");
            System.out.println("Pick here");
            String choiceforhealthyfats = scanner.nextLine();
            if (choiceforhealthyfats.equalsIgnoreCase("X")) {
                runninghealthyfats = false;
            } else {
                System.out.println("Would you like extra true or false");
                boolean extraforhealthyfats = Boolean.parseBoolean(scanner.nextLine());
                HealthyFat healthyFat = new HealthyFat();
                switch (choiceforhealthyfats) {
                    //Pumpkin puree
                    //
                    //Coconut oil
                    //
                    //Applesauce
                    case "1":
                        healthyFat.setName("Pumpkin Puree");
                        healthyFat.setExtra(extraforhealthyfats);
                        order.getHealhtyfats().add(healthyFat);
//                        order.getHealhtyfats().add(healthyFat);
                        break;
                    case "2":
                        healthyFat.setName("Coconut Oils");
                        healthyFat.setExtra(extraforhealthyfats);
                        order.getHealhtyfats().add(healthyFat);
                        break;
                    case "3":
                        healthyFat.setName("Apple Sauce");
                        healthyFat.setExtra(extraforhealthyfats);
                        order.getHealhtyfats().add(healthyFat);
                        break;


                }

            }
        }
        System.out.println("Add your fruit! ");
        boolean runningfruit = true;
        while (runningfruit) {
            System.out.println("1. Watermelon ");
            System.out.println("2. Carrots");
            System.out.println("3. Blueberries");
            System.out.println("4. Strawberries");
            System.out.println("5. Banana slices");
            System.out.println("6. Apple Slices");
            System.out.println("7. Cantaloupe Chunks");
            System.out.println("8. Cucumber Slices");
            System.out.println("9. Orange Slices");
            System.out.println("X to finish selection");
            System.out.println("Pick here: ");
            String fruitchoice = scanner.nextLine();
            if (fruitchoice.equalsIgnoreCase("X")) {
                runningfruit = false;
            } else {
                Toppings toppings = new Toppings();
                switch (fruitchoice) {

                    case "1":
                        toppings.setName("Watermelon");
                        order.getRegularList().add(toppings);
                        break;
                    case "2":
                        toppings.setName("Carrots");
                        order.getRegularList().add(toppings);
                        break;
                    case "3":
                        toppings.setName("Blueberries");
                        order.getRegularList().add(toppings);
                        break;
                    case "4":
                        toppings.setName("Strawberries");
                        order.getRegularList().add(toppings);
                        break;
                    case "5":
                        toppings.setName("Banana slices");
                        order.getRegularList().add(toppings);
                        break;
                    case "6":
                        toppings.setName("Apple Slices");
                        order.getRegularList().add(toppings);
                        break;
                    case "7":
                        toppings.setName("Cantaloupe Chunks");
                        order.getRegularList().add(toppings);
                        break;
                    case "8":
                        toppings.setName("Cucumber Slice");
                        order.getRegularList().add(toppings);
                        break;
                    case "9":
                        toppings.setName("Orange Slices");
                        order.getRegularList().add(toppings);
                        break;

                }
            }

        }
        System.out.println("Select Your Drizzles!");
        boolean runningDrizzle = true;
        while (runningDrizzle) {
            System.out.println("1. Mango Drizzle ");
            System.out.println("2. Sweet Potato Drizzle");
            System.out.println("3. Banana Drizzle");
            System.out.println("4. Peanut Butter Drizzle");
            System.out.println("5. Cranberry Drizzle");
            System.out.println("6. Blueberry Drizzle");
            System.out.println("X to finish selection");

            System.out.println("Pick here");
            String drizzleChoice = scanner.nextLine();
            if (drizzleChoice.equalsIgnoreCase("X")) {
                runningDrizzle = false;
            } else {
                Drizzles drizzles = new Drizzles();
                switch (drizzleChoice) {

                    case "1":
                        drizzles.setName("Mango Drizzle");
                        order.getDrizzlesList().add(drizzles);
                        break;
                    case "2":
                        drizzles.setName("Sweet Potato Drizzle");
                        order.getDrizzlesList().add(drizzles);
                        break;
                    case "3":
                        drizzles.setName("Banana Drizzle");
                        order.getDrizzlesList().add(drizzles);
                        break;
                    case "4":
                        drizzles.setName("Peanut Butter Drizzle");
                        order.getDrizzlesList().add(drizzles);
                        break;
                    case "5":
                        drizzles.setName("Cranberry Drizzle");
                        order.getDrizzlesList().add(drizzles);
                        break;
                    case "6":
                        drizzles.setName("Blueberry Drizzle");
                        order.getDrizzlesList().add(drizzles);
                        break;
                }


            }

        }
        System.out.println("Would you like this yogurt in our special Pup Cup? (Y/N)");
        String pupCupChoice = scanner.nextLine().trim();

        if (pupCupChoice.equalsIgnoreCase("Y")) {
            order.setSpecialPupCup(true);
        } else {
            order.setSpecialPupCup(false);
        }

        double orderPrice = order.calculatePrice();
//        System.out.println("Total price for this yogurt: $" + orderPrice);
        printYogurtSummary(order);
        yogurtOrders.add(order);
    }

    public void addDrink() {
        ArrayList<Drink> drinkList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean addingDrinks = true;

        while (addingDrinks) {
            System.out.println("Select your drink:");
            System.out.println("1. Pupacchino");
            System.out.println("2. Water");
            System.out.println("3. Pumpkin Smoothie");
            System.out.println("4. Doggo Latte");
            System.out.println("X to finish");
            System.out.println("Pick here:");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("X")) {
                addingDrinks = false;
                continue;
            }

            String drinkName = "";
            switch (choice) {
                case "1":
                    drinkName = "Pupacchino";
                    break;

                case "2":
                    drinkName = "Water";
                    break;

                case "3":
                    drinkName = "Agua Fresca";
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            System.out.println("Choose drink size: SMALL, MEDIUM, LARGE");
            String sizeInput = scanner.nextLine().trim().toUpperCase();

            Sizing.Size size;
            try {
                size = Sizing.Size.valueOf(sizeInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid size. Defaulting to SMALL.");
                size = Sizing.Size.SMALL;
            }

            Drink drink = new Drink(drinkName, size);
            drinkList.add(drink);
        }
    }

    public void addSides() {
        ArrayList<Sides> sidesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean addingSides = true;

        while (addingSides) {
            System.out.println("Select your drink:");
            System.out.println("1. Dog Toy");
            System.out.println("2. Pup Patty");
            System.out.println("X to finish");
            System.out.println("Pick here:");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("X")) {
                addingSides = false;
                continue;
            }

            String sideName = "";
            switch (choice) {
                case "1":
                    sideName = "Dog Toy";
                    break;

                case "2":
                    sideName = "Pup Patty";
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            System.out.println("Choose drink size: SMALL, MEDIUM, LARGE");
            String sizeInput = scanner.nextLine().trim().toUpperCase();

            Sizing.Size size;
            try {
                size = Sizing.Size.valueOf(sizeInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid size. Defaulting to SMALL.");
                size = Sizing.Size.SMALL;
            }

            Sides sides = new Sides(sideName, size);
            sidesList.add(sides);
        }
    }
    private void printYogurtSummary(YogurtTreat order) {
        System.out.println("\n===== Your Yogurt Selection =====");

        System.out.println("Size: " + order.getSize());
        System.out.println("Flavor: " + order.getFlaborbase());

        System.out.println("\nProtein Boosts:");
        if (order.getPremiumList().isEmpty()) {
            System.out.println("  None");
        } else {
            for (ProteinBoost p : order.getPremiumList()) {
                System.out.println("  - " + p.getName() + (p.isExtra() ? " (extra)" : ""));
            }
        }

        System.out.println("\nHealthy Fats:");
        if (order.getHealhtyfats().isEmpty()) {
            System.out.println("  None");
        } else {
            for (HealthyFat f : order.getHealhtyfats()) {
                System.out.println("  - " + f.getName() + (f.isExtra() ? " (extra)" : ""));
            }
        }

        System.out.println("\nFruit Toppings:");
        if (order.getRegularList().isEmpty()) {
            System.out.println("  None");
        } else {
            for (Toppings t : order.getRegularList()) {
                System.out.println("  - " + t.getName());
            }
        }

        System.out.println("\nDrizzles:");
        if (order.getDrizzlesList().isEmpty()) {
            System.out.println("  None");
        } else {
            for (Drizzles d : order.getDrizzlesList()) {
                System.out.println("  - " + d.getName());
            }
        }

        System.out.println("\nTotal price for this yogurt: $" + order.calculatePrice());
        System.out.println("=================================\n");
    }
    private void writeReceipt(ArrayList<YogurtTreat> yogurtOrders) {
        try {
            // Create receipts folder if it doesn’t exist
            java.io.File folder = new java.io.File("receipts");
            if (!folder.exists()) {
                folder.mkdir();
            }

            // Create a file name based on date/time
            String fileName = "receipts/" + java.time.LocalDateTime.now()
                    .toString()
                    .replace(":", "")
                    .replace("-", "")
                    .replace(".", "") + ".txt";

            java.io.FileWriter writer = new java.io.FileWriter(fileName);

            writer.write("======= Bone Appetit Receipt =======\n\n");

            double totalOrderPrice = 0;

            // Loop through all yogurts added
            for (YogurtTreat order : yogurtOrders) {
                writer.write("Yogurt:\n");
                writer.write(" Size: " + order.getSize() + "\n");
                writer.write(" Flavor: " + order.getFlaborbase() + "\n");

                writer.write(" Protein Boosts:\n");
                if (order.getPremiumList().isEmpty()) {
                    writer.write("   None\n");
                } else {
                    for (ProteinBoost p : order.getPremiumList()) {
                        writer.write("   - " + p.getName() + (p.isExtra() ? " (extra)" : "") + "\n");
                    }
                }

                writer.write(" Healthy Fats:\n");
                if (order.getHealhtyfats().isEmpty()) {
                    writer.write("   None\n");
                } else {
                    for (HealthyFat f : order.getHealhtyfats()) {
                        writer.write("   - " + f.getName() + (f.isExtra() ? " (extra)" : "") + "\n");
                    }
                }

                writer.write(" Toppings:\n");
                if (order.getRegularList().isEmpty()) {
                    writer.write("   None\n");
                } else {
                    for (Toppings t : order.getRegularList()) {
                        writer.write("   - " + t.getName() + "\n");
                    }
                }

                writer.write(" Drizzles:\n");
                if (order.getDrizzlesList().isEmpty()) {
                    writer.write("   None\n");
                } else {
                    for (Drizzles d : order.getDrizzlesList()) {
                        writer.write("   - " + d.getName() + "\n");
                    }
                }

                double yogurtPrice = order.calculatePrice();
                writer.write("\n Price: $" + yogurtPrice + "\n");
                writer.write("----------------------------------\n");

                totalOrderPrice += yogurtPrice;
            }

            writer.write("\nTOTAL ORDER: $" + totalOrderPrice + "\n");
            writer.write("Thank you for your order!\n");

            writer.close();

            System.out.println("Receipt saved to: " + fileName);

        } catch (Exception e) {
            System.out.println("Error saving receipt.");
        }
    }

}