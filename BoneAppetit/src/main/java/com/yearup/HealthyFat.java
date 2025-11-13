package com.yearup;

import Enums.Sizing;

public class HealthyFat {
    String name;
    boolean extra;
    boolean isPremium;


    public HealthyFat() {
    }

    public HealthyFat(String name, boolean extra, boolean isPremium) {
        this.name = name;
        this.extra = extra;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public boolean isExtra() {
        return extra;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public double getPrice(Sizing.Size size) {
        double price = 0;

        switch (size) {
            case SMALL:
                if (extra) {
                    price = 1.50;
                } else {
                    price = 1.00;
                }
                break;
            case MEDIUM:
                if (extra) {
                    price = 3.00;
                } else {
                    price = 2.00;
                }
                break;
            case LARGE:
                if (extra) {
                    price = 4.50;
                } else {
                    price = 3.00;
                }
                break;
        }
        if (isPremium) {
            price += 0.50;
        }

        return price;
    }
}
