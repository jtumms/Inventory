package com.company;

/**
 * Created by john.tumminelli on 9/20/16.
 */
public class Guild extends Guitar {
    String topWood;
    String sideWood;

    public Guild(String topWood, String sideWood) {
        this.topWood = topWood;
        this.sideWood = sideWood;
        this.brand = "Fender";

    }

    public Guild(String itemNumber, String brand, int quantity, String topWood, String sideWood) {
        super(itemNumber, brand, quantity);
        this.topWood = topWood;
        this.sideWood = sideWood;
    }
}
