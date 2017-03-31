package com.Watson.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Ticket {
    double price;
    char type;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
