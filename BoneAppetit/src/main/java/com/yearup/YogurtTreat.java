package com.yearup;

import java.util.ArrayList;
import java.util.Scanner;

public class YogurtTreat {
    private String size;
    private String flaborbase;
//    private ProteinBoosts proteinboosts;
    private HealthyFats healhtyfats;
    ArrayList<ProteinBoosts> PremiumList = new ArrayList<>();
    ArrayList<RegularToppings> RegularList = new ArrayList<>();
//    private RegularToppings regulartoppings;
    private Drizzles drizzles;
    private Sides sides;

    public YogurtTreat(String size, String flaborbase, HealthyFats healhtyfats, ArrayList<ProteinBoosts> premiumList, ArrayList<RegularToppings> regularList, Drizzles drizzles, Sides sides) {
        this.size = size;
        this.flaborbase = flaborbase;
        this.healhtyfats = healhtyfats;
        PremiumList = premiumList;
        RegularList = regularList;
        this.drizzles = drizzles;
        this.sides = sides;
    }

    public YogurtTreat(){}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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

    public class YogurtCalculator {

        public static double calculateYogurtPrice(
                int numberOfProteinBoosters,
                int numberOfExtraProteinBoosters) {

            double basePrice = 5.50;
            double meatPrice = 1.00;
            double extraMeatPrice = 0.50;

            double total = basePrice
                    + (meatPrice * numberOfProteinBoosters)
                    + (extraMeatPrice * numberOfExtraProteinBoosters);

            return total;
        }

        public double calculatePrice() {
            return 0;//getBasePrice() * (weightInGrams / 100.0);
        }

    }
    public void addYogurt(){
        System.out.println("Size");
        Scanner scanner = new Scanner(System.in);
        YogurtTreat order = new YogurtTreat();
        order.setSize(scanner.nextLine());//touppercase,.totrim


        System.out.println("Flavorbase");
        order.setFlaborbase(scanner.nextLine());

        System.out.println("");

    }



}

