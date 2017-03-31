package com.Watson.BreakingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Long on 3/29/2017.
 */
public class AccountsDepartment extends UncorrectPrinciple {

    double salary, rate = 25.5 ;
    int daysWorked = 20;

    public void setRate()
    {
        ratePerHour = rate;
    }

    public void updateSalary()
    {
        promotion(30.5);
    }

    public void getSalary()
    {
        salary = calculatePayment(daysWorked);
    }

    public void displayPayslip()
    {
        System.out.println("Your salary is R" + salary + " per month.");
    }
}
