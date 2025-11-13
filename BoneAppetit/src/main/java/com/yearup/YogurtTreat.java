package com.yearup;

import Enums.HealthyFats;
import Enums.ProteinBoosts;
import Enums.RegularToppings;
import Enums.Sizing;

import java.util.ArrayList;
import java.util.Scanner;

public class YogurtTreat {
    private Sizing.Size size;
    private String flaborbase;
    private ArrayList<HealthyFat> healhtyfats = new ArrayList<>();
    private ArrayList<ProteinBoost> PremiumList = new ArrayList<>();
    private ArrayList<RegularToppings> RegularList = new ArrayList<>();
    private Drizzles drizzles;
    private Sides sides;
    double price;

    public YogurtTreat(Sizing.Size size, String flaborbase, ArrayList<HealthyFat> healhtyfats, ArrayList<ProteinBoost> premiumList, ArrayList<RegularToppings> regularList, Drizzles drizzles, Sides sides, double price) {
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

    public ArrayList<RegularToppings> getRegularList() {
        return RegularList;
    }

    public void setRegularList(ArrayList<RegularToppings> regularList) {
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
            System.out.println("Choose your Protein Boosts ");
            //todo add proetinboosts
            System.out.println("X to finish selection");
            System.out.println("Pick here");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("X")){
                running = false;
            }
            else{
                System.out.println("Would you like extra true or false");
                boolean extra = Boolean.parseBoolean(scanner.nextLine());
                ProteinBoost boost = new ProteinBoost();
                switch(choice) {
                    case "1":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "2":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "3":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "4":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "5":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "6":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "7":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "8":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                    case "9":
                        boost.setName("first topping");
                        boost.setExtra(extra);
                        PremiumList.add(boost);
                        break;
                }


            }

        }


    }
}

