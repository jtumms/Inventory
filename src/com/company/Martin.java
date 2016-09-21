package com.company;

/**
 * Created by john.tumminelli on 9/20/16.
 */
public class Martin extends Guitar {
    String topWood;
    String sideWood;

    public Martin(String topWood, String sideWood) {
        this.topWood = topWood;
        this.sideWood = sideWood;
        this.brand = "Martin";

    }

    public Martin(String itemNumber, String brand, int quantity, String topWood, String sideWood) {
        super(itemNumber, brand, quantity);
        this.topWood = topWood;
        this.sideWood = sideWood;
    }
}
