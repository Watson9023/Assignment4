package com.Watson.BreakingDesignPrinciples.LiskovSubstitutionPrinciples;

/**
 * Created by Long on 3/29/2017.
 */
public class TicketKiosk {
    public double calculatePrice(Ticket t)
    {
        if(t.type == 'A')
            return t.getPrice() * t.getHours() * 0.75;
        else if(t.type == 'R')
            return t.getPrice() * t.getHours() * 0.5;
        else if (t.type == 'V')
            return t.getHours() * t.getPrice();
        else
            return t.getPrice();
    }

}
