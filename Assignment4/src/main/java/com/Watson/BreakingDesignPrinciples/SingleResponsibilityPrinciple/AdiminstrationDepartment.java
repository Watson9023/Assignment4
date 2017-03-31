package com.Watson.BreakingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Long on 3/29/2017.
 */
public class AdiminstrationDepartment extends UncorrectPrinciple{
    String name = "Jason", surname = "Hans";

    public void saveEmployeeDetails(){
        addEmployee(name, surname);
    }

    public void updateEmployee(String name, String surname)
    {
        updateName(name);
        updateSurname(surname);
    }

}
