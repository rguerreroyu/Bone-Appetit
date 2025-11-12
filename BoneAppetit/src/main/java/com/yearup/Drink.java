package com.yearup;

public class Drink extends MenuItem{

    public Drink(String name, double price) {
        super("Pupacchino", 2.0);

    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
