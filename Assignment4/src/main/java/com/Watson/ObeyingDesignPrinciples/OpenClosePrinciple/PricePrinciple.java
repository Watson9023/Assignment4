package com.Watson.ObeyingDesignPrinciples.OpenClosePrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public abstract class PricePrinciple {
    public boolean principleApplies(Person p){
        return false;
    }
    public double calculatePrice(Person p){
        return p.ticketType.getPrice();
    }
}
