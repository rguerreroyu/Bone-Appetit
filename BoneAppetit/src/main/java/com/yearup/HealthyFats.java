package com.yearup;

import Enums.Sizing;

public class HealthyFats {
    String name;
    boolean extra;

    public HealthyFats(String name, boolean extra) {
        this.name = name;
        this.extra = extra;
    }

    public HealthyFats(){}

    public String getName() {
        return name;
    }

    public boolean isExtra() {
        return extra;
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

        return price;
    }


}