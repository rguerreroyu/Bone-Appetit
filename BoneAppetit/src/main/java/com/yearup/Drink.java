package com.yearup;
import Enums.Sizing;
import Abstract.MenuItem;

import java.util.ArrayList;

public class Drink extends MenuItem {


    private Sizing.Size size;

            public Drink(String name, Sizing.Size size) {
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


