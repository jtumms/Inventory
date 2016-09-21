package com.company;

/**
 * Created by john.tumminelli on 9/19/16.
 */
public class Guitar {
    String itemNumber;
    String brand;
    int quantity;

    public Guitar() {

    }

    public Guitar(String itemNumber, String brand, int quantity) {
        this.brand = brand;
        this.itemNumber = itemNumber;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
