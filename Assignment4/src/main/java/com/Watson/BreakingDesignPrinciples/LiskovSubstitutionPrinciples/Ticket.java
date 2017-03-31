package com.Watson.BreakingDesignPrinciples.LiskovSubstitutionPrinciples;

/**
 * Created by Long on 3/29/2017.
 */
public class Ticket {

    char type;
    double price;
    int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
