package com.yearup;

//import Enums.HealthyFats;
//import Enums.ProteinBoosts;
import Enums.Sizing;

import java.util.ArrayList;
import java.util.Scanner;

public class YogurtTreat {
    private Sizing.Size size;
    private String flaborbase;
    private ArrayList<HealthyFat> healhtyfats = new ArrayList<>();
    private ArrayList<ProteinBoost> PremiumList = new ArrayList<>();
    private ArrayList<Toppings> RegularList = new ArrayList<>();
    private ArrayList<Drizzles> drizzlesList = new ArrayList<>();
    private Sides sides;
    double price;

    public YogurtTreat(Sizing.Size size, String flaborbase, ArrayList<HealthyFat> healhtyfats, ArrayList<ProteinBoost> premiumList, ArrayList<Toppings> regularList, ArrayList<Drizzles> drizzlesList, Sides sides, double price) {
        this.flaborbase = flaborbase;
        this.healhtyfats = healhtyfats;
        this.PremiumList = premiumList;
        this.RegularList = regularList;
        this.drizzlesList = drizzlesList;
        this.sides = sides;
        this.price = price;
        this.size = size;
    }

    public YogurtTreat() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBasePrice(Sizing.Size size) {

        switch (size) {
            case SMALL:
                price = 3.50;
                break;
            case MEDIUM:
                price = 5.00;
                break;
            case LARGE:
                price = 8.50;
                break;
        }
        return price;

    }


    public void setSize(Sizing.Size size) {
        this.size = size;
    }

    public String getFlaborbase() {
        return flaborbase;
    }

    public void setFlaborbase(String flaborbase) {
        this.flaborbase = flaborbase;
    }

    public ArrayList<HealthyFat> getHealhtyfats() {
        return healhtyfats;
    }

    public void setHealhtyfats(ArrayList<HealthyFat> healhtyfats) {
        this.healhtyfats = healhtyfats;
    }

    public ArrayList<ProteinBoost> getPremiumList() {
        return PremiumList;
    }

    public void setPremiumList(ArrayList<ProteinBoost> premiumList) {
        PremiumList = premiumList;
    }

    public ArrayList<Toppings> getRegularList() {
        return RegularList;
    }

    public void setRegularList(ArrayList<Toppings> regularList) {
        RegularList = regularList;
    }

    public ArrayList<Drizzles> getDrizzlesList() {
        return drizzlesList;
    }

    public void setDrizzlesList(ArrayList<Drizzles> drizzlesList) {
        this.drizzlesList = drizzlesList;
    }

    public Sides getSides() {
        return sides;
    }

    public void setSides(Sides sides) {
        this.sides = sides;
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
        System.out.println(order.price);


        System.out.println("Enter flavor base:");
        order.setFlaborbase(scanner.nextLine().trim());

        //todo touppercase,.totrim


        boolean running = true;
        while (running) {
            //Oats
            //- Yogurt drops
            //-  Quinoa
            //- Chia seeds
            //
            //Peanut butter drops
            //
            //Chicken bits
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
                        PremiumList.add(boost);
                        break;
                    case "2":
                        boost.setName("Yogurt Drops");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "3":
                        boost.setName("Quinoa");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "4":
                        boost.setName("Chia Seeds");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "5":
                        boost.setName("Peanut Butter Drops");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "6":
                        boost.setName("Chicken Bits");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
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
                        healhtyfats.add(healthyFat);
//                        order.getHealhtyfats().add(healthyFat);
                        break;
                    case "2":
                        healthyFat.setName("Coconut Oils");
                        healthyFat.setExtra(extraforhealthyfats);
                        healhtyfats.add(healthyFat);
                        break;
                    case "3":
                        healthyFat.setName("Apple Sauce");
                        healthyFat.setExtra(extraforhealthyfats);
                        healhtyfats.add(healthyFat);
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
                        RegularList.add(toppings);
                        break;
                    case "2":
                        toppings.setName("Carrots");
                        RegularList.add(toppings);
                        break;
                    case "3":
                        toppings.setName("Blueberries");
                        RegularList.add(toppings);
                    case "4":
                        toppings.setName("Strawberries");
                        RegularList.add(toppings);
                    case "5":
                        toppings.setName("Banana slices");
                        RegularList.add(toppings);
                    case "6":
                        toppings.setName("Apple Slices");
                        RegularList.add(toppings);
                    case "7":
                        toppings.setName("Cantaloupe Chunks");
                        RegularList.add(toppings);
                    case "8":
                        toppings.setName("Cucumber Slice");
                        RegularList.add(toppings);
                    case "9":
                        toppings.setName("Orange Slices");
                        RegularList.add(toppings);

                }
            }

        }
        System.out.println("Select Your Drizzles!");
        boolean runningDrizzle = true;
        while (runningDrizzle) {
            //Sauces (Drizzles)
            //Mango drizzles
            //
            //Sweet potato swirl
            //
            //Bannana drizzle
            //
            //
            //Peanut butter drizzle
            //
            //Cranberry drizzle
            //
            //Blueberry drizzle
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
                        drizzlesList.add(drizzles);
                        break;
                    case "2":
                        drizzles.setName("Sweet Potato Drizzle");
                        drizzlesList.add(drizzles);
                        break;
                    case "3":
                        drizzles.setName("Banana Drizzle");
                        drizzlesList.add(drizzles);
                    case "4":
                        drizzles.setName("Peanut Butter Drizzle");
                        drizzlesList.add(drizzles);
                    case "5":
                        drizzles.setName("Cranberry Drizzle");
                        drizzlesList.add(drizzles);
                    case "6":
                        drizzles.setName("Blueberry Drizzle");
                        drizzlesList.add(drizzles);

                }
            }
        }
    }
}