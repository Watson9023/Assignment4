package com.Watson.ObeyingDesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Travels extends Ticket{
    @Override
    public double calculatePrice()
    {
        return this.getPrice() * this.getHours() * 0.6;
    }
}
