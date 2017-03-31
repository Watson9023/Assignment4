package com.Watson.BreakingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Long on 3/29/2017.
 */
public class UncorrectPrinciple {
    public String employeeName, employeeSurname;
    public double ratePerHour;

    public double calculatePayment(int daysWorked)
    {
        return ratePerHour * daysWorked;
    }

    public void addEmployee(String name, String surname)
    {
        this.employeeName = name;
        this.employeeSurname = surname;
    }

    public void promotion(double newRate)
    {
        ratePerHour = newRate;
    }

    public void updateName(String newName){
        employeeName = newName;
    }

    public void updateSurname(String surname)
    {
        employeeSurname = surname;
    }
}
