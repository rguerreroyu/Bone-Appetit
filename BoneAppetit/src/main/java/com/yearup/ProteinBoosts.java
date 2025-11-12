package com.yearup;

import java.util.ArrayList;

public class ProteinBoosts extends Ingredients {
    ArrayList<String>ProteinBoosters = new ArrayList<>();

    public ProteinBoosts() {
        super("Protein boosters", 2.0);
        ProteinBoosters.add("Oats");
        ProteinBoosters.add("Yogurt Drops ");
        ProteinBoosters.add("Quinoa ");
        ProteinBoosters.add("Chia Seeds ");
        ProteinBoosters.add("Peanut Butter Drops ");
        ProteinBoosters.add("Chicken Bits ");


    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
