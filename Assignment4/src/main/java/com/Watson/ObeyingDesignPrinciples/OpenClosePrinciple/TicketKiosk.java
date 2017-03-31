package com.Watson.ObeyingDesignPrinciples.OpenClosePrinciple;

import java.util.List;

/**
 * Created by Long on 3/31/2017.
 */
public class TicketKiosk {
    public double calculateTotal(List<PricePrinciple> principles, List<Person> people)
    {
        double total=0.0;
        for(Person p :people)
        {
            for(PricePrinciple pr: principles)
                if(pr.principleApplies(p))
                    total = pr.calculatePrice(p);
        }
        return total;
    }
}
