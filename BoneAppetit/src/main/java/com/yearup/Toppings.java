package com.yearup;

import Enums.Sizing;

public class Toppings {


    public class RegularTopping {
        private String name;

        public RegularTopping() {
        }

        public RegularTopping(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

