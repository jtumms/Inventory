package com.company;

/**
 * Created by john.tumminelli on 9/20/16.
 */
public class Gibson extends Guitar {
    String pickups;
    String numPickups;

    public Gibson(String pickups, String numPickups) {
        this.pickups = pickups;
        this.brand = "Gibson";
    }

    public Gibson(String itemNumber, String brand, int quantity, String pickups, String numPickups) {
        super(itemNumber, brand, quantity);
        this.pickups = pickups;
        this.numPickups = numPickups;
    }
}

