package com.yearup;

public class Drizzles {
        String name;
        boolean extra;


        public Drizzles() {
        }

        public Drizzles(String name, boolean extra) {
            this.name = name;
            this.extra = extra;
        }

        public String getName() {
            return name;
        }

        public boolean isExtra() {
            return extra;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setExtra(boolean extra) {
            this.extra = extra;
        }

}
