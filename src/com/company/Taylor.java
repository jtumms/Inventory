package com.company;

import java.util.ArrayList;

/**
 * Created by john.tumminelli on 9/20/16.
 */
public class Taylor extends Guitar {
    String topWood;
    String sideWood;

    public Taylor(String topWood, String sideWood) {
        this.topWood = topWood;
        this.sideWood = sideWood;
        this.brand = "Taylor";

    }

    public Taylor(String itemNumber, String brand, int quantity, String topWood, String sideWood) {
        super(itemNumber, brand, quantity);
        this.topWood = topWood;
        this.sideWood = sideWood;
    }
}
