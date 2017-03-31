package com.Watson.ObeyingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public abstract class AdiministrationProcess {
    public String employeeName, employeeSurname;

    public void addEmployee(String name, String surname)
    {
        this.employeeName = name;
        this.employeeSurname = surname;
    }

    public void updateName(String newName){
        employeeName = newName;
    }

    public void updateSurname(String surname)
    {
        employeeSurname = surname;
    }
}
