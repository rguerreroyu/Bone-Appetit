package com.yearup;
import Enums.Sizing;
import Abstract.MenuItem;

public class Drink extends MenuItem {

            private Sizing.Size size;

            public Drink(String name, Sizing.Size size) {
                super(name, 0); // price calculated dynamically
                this.size = size;
            }

            @Override
            public double calculatePrice() {
                switch (size) {
                    case SMALL:
                        return 2.0;
                    case MEDIUM:
                        return 2.5;
                    case LARGE:
                        return 3.0;
                    default:
                        return 2.0;
                }
            }

            public Sizing.Size getSize() {
                return size;
            }

            public void setSize(Sizing.Size size) {
                this.size = size;
            }
        }

