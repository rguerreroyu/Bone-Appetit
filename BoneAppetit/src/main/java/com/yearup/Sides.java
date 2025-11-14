package com.yearup;

import Abstract.MenuItem;
import Enums.Sizing;

public class Sides extends MenuItem {

    private Sizing.Size size;

    public Sides(String name, Sizing.Size size) {
        super(name, 0);
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    public Sizing.Size getSize() {
        return size;
    }

    public void setSize(Sizing.Size size) {
        this.size = size;
    }
}
