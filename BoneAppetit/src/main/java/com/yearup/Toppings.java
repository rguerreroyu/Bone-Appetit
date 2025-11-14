package com.yearup;

public class Toppings {
    String name;
    boolean extra;
    boolean isPremium;


    public Toppings() {
    }

    public Toppings(String name, boolean extra, boolean isPremium) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}

