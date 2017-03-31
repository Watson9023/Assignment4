package com.Watson.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Children extends PricePrinciple {
    public boolean principleApplies(Person p) {
        return p.age < 13;
    }

    public double calculatePrice(Person p) {
        return p.ticketType.getPrice()*0.50;
    }
}
