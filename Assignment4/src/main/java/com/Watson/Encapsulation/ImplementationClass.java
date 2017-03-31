package com.Watson.BreakingDesignPrinciples.Encapsulation;

/**
 * Created by Long on 3/31/2017.
 */
public class ImplementationClass {
    private int amt = 60;
    private double price = 34.75;
    private myClass _methods;

    public ImplementationClass(myClass methods, int amount, double price)
    {
        this._methods = methods;
        this.price = price;
        this.amt = amount;
    }

    public double calculateSignleItem()
    {
        return _methods.calculatePricePerItem(price);
    }

    public double calculateTotalCost()
    {
        return _methods.calculateTotalAmount(price, amt);
    }

    public void displayData()
    {
        System.out.println(_methods.displaySingleItem());
        System.out.println("\n\n");
        System.out.println(_methods.displayTotal());
    }
}
