package com.yearup;

public class HealthyFats {
    String name;
    double price;
    boolean extra;

    public HealthyFats(String name, double price, boolean extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public HealthyFats(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(String Size) {
        switch (Size) {
            case "S":
                if (extra){
                    return 1.50;
                }else {
                    return 1.0;
                }


            case "M":
                if (extra){
                    return 3.0;
                }else {
                    return 2.0;
                }

            case "L":
                if (extra){
                    return 4.50;
                }else {
                    return 3.0;
                }
            default:
                return 0;

        }





    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

}
