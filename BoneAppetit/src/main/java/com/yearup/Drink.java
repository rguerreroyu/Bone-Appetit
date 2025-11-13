package com.yearup;

import Abstract.MenuItem;

public class Drink extends MenuItem {

    public Drink(String name, double price) {
        super("Pupacchino", 2.0);

    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
