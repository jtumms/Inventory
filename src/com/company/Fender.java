package com.company;

/**
 * Created by john.tumminelli on 9/20/16.
 */
public class Fender extends Guitar {
    String pickups;
    String numPickups;

    public Fender(String pickups, String numPickups) {
        this.pickups = pickups;
        this.numPickups = numPickups;
        this.brand = "Fender";

    }

    public Fender(String itemNumber, String brand, int quantity, String pickups, String numPickups) {
        super(itemNumber, brand, quantity);
        this.pickups = pickups;
        this.numPickups = numPickups;
    }
}
