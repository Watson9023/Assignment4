package com.Watson.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Adults extends PricePrinciple {
    public boolean principleApplies(Person p) {
        return p.age > 65;
    }

    public double calculatePrice(Person p) {
        return p.ticketType.getPrice()*0.75;
    }
}
