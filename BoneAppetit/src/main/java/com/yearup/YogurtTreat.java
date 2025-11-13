package com.yearup;

import Enums.Sizing;

import java.util.ArrayList;
import java.util.Scanner;

public class YogurtTreat {
    private Sizing.Size size;
    private String flaborbase;
    private HealthyFats healhtyfats;
    ArrayList<ProteinBoosts> PremiumList = new ArrayList<>();
    ArrayList<RegularToppings> RegularList = new ArrayList<>();
    private Drizzles drizzles;
    private Sides sides;
    double price;

    public YogurtTreat(Sizing.Size size, String flaborbase, HealthyFats healhtyfats, ArrayList<ProteinBoosts> premiumList, ArrayList<RegularToppings> regularList, Drizzles drizzles, Sides sides, double price) {
        this.flaborbase = flaborbase;
        this.healhtyfats = healhtyfats;
        PremiumList = premiumList;
        RegularList = regularList;
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
        double price = 0;

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

    public HealthyFats getHealhtyfats() {
        return healhtyfats;
    }

    public void setHealhtyfats(HealthyFats healhtyfats) {
        this.healhtyfats = healhtyfats;
    }

    public ArrayList<ProteinBoosts> getPremiumList() {
        return PremiumList;
    }

    public void setPremiumList(ArrayList<ProteinBoosts> premiumList) {
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


    public void addYogurt(){
        System.out.println("Choose your size: Small, Medium, Large");
        Scanner scanner = new Scanner(System.in);
        YogurtTreat order = new YogurtTreat();
        System.out.println("Choose size (SMALL, MEDIUM, LARGE):");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            order.setSize(Sizing.Size.valueOf(input));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid size entered. Please use SMALL, MEDIUM, or LARGE.");
            return;
        }
        double basePrice = getBasePrice(order.size);
        order.setPrice(basePrice);
        System.out.println(order.price);


        System.out.println("Enter flavor base:");
        order.setFlaborbase(scanner.nextLine().trim());
        //touppercase,.totrim

        System.out.println("");

    }



}

