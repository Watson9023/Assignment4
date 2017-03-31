package com.Watson.ObeyingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class AdimistrationDepartment extends AdiministrationProcess {
    String name = "Watson", surname = "Matunhire";

    public void saveEmployeeDetails(){
        addEmployee(name, surname);
    }

    public void updateEmployee(String name, String surname)
    {
        updateName(name);
        updateSurname(surname);
    }
}
