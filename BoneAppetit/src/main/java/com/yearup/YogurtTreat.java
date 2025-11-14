package com.yearup;

//import Enums.HealthyFats;
//import Enums.ProteinBoosts;
import Enums.RegularToppings;
import Enums.Sizing;

import java.util.ArrayList;
import java.util.Scanner;

public class YogurtTreat {
    private Sizing.Size size;
    private String flaborbase;
    private ArrayList<HealthyFat> healhtyfats = new ArrayList<>();
    private ArrayList<ProteinBoost> PremiumList = new ArrayList<>();
    private ArrayList<Toppings> RegularList = new ArrayList<>();
    private Drizzles drizzles;
    private Sides sides;
    double price;

    public YogurtTreat(Sizing.Size size, String flaborbase, ArrayList<HealthyFat> healhtyfats, ArrayList<ProteinBoost> premiumList, ArrayList<Toppings> regularList, Drizzles drizzles, Sides sides, double price) {
        this.flaborbase = flaborbase;
        this.healhtyfats = healhtyfats;
        this.PremiumList = premiumList;
        this.RegularList = regularList;
        this.drizzles = drizzles;
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

    public Drizzles getDrizzles() {
        return drizzles;
    }

    public void setDrizzles(Drizzles drizzles) {
        this.drizzles = drizzles;
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
            System.out.println("Choose your Healthy Fats! ");
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

            System.out.println("Pick here");
            String fruitchoice = scanner.nextLine();
            if (fruitchoice.equalsIgnoreCase("X")) {
                runningfruit = false;
            } else {
                Toppings toppings = new Toppings();
                switch (fruitchoice) {

                    case "1":
                        toppings.setName("Pumpkin Puree");
                        RegularList.add(toppings);
                        break;
                    case "2":
                        toppings.setName("Coconut Oil");
                        RegularList.add(toppings);
                        break;
                    case "3":
                        toppings.setName("Apple Sauce");
                        RegularList.add(toppings);


                }
            }
        }
    }
}
