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

    public Sizing.Size getSize() {
        return size;
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
    public double calculatePrice() {
        double total = 0;

        // Base price
        if (size == Sizing.Size.SMALL) {
            total += 5.50;
        } else if (size == Sizing.Size.MEDIUM) {
            total += 7.00;
        } else if (size == Sizing.Size.LARGE) {
            total += 8.50;
        }

        // Protein Boosts
        for (ProteinBoost boost : PremiumList   ) {
            if (size == Sizing.Size.SMALL) {
                if (boost.isExtra()) {
                    total += 1.50;
                } else {
                    total += 1.00;
                }
            } else if (size == Sizing.Size.MEDIUM) {
                if (boost.isExtra()) {
                    total += 3.00;
                } else {
                    total += 2.00;
                }
            } else if (size == Sizing.Size.LARGE) {
                if (boost.isExtra()) {
                    total += 4.50;
                } else {
                    total += 3.00;
                }
            }
        }

        // Healthy Fats
        for (HealthyFat fat : healhtyfats) {
            if (size == Sizing.Size.SMALL) {
                if (fat.isExtra()) {
                    total += 1.50;
                } else {
                    total += 1.00;
                }
            } else if (size == Sizing.Size.MEDIUM) {
                if (fat.isExtra()) {
                    total += 3.00;
                } else {
                    total += 2.00;
                }
            } else if (size == Sizing.Size.LARGE) {
                if (fat.isExtra()) {
                    total += 4.50;
                } else {
                    total += 3.00;
                }
            }
        }

        // Regular toppings and drizzles are included (no cost)

        return total;
    }
    private boolean specialPupCup;

    public boolean isSpecialPupCup() {
        return specialPupCup;
    }

    public void setSpecialPupCup(boolean specialPupCup) {
        this.specialPupCup = specialPupCup;
    }



}