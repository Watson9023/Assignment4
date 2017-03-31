package com.Watson.ObeyingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public abstract class AccountingProcess {
    public double ratePerHour;

    public double calculatePayment(int daysWorked)
    {
        return ratePerHour * daysWorked;
    }

    public void promotion(double newRate)
    {
        ratePerHour = newRate;

    }

}
