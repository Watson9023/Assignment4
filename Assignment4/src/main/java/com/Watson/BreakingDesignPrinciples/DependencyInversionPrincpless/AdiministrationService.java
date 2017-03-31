package com.Watson.BreakingDesignPrinciples.DependencyInversionPrincpless;

/**
 * Created by Long on 3/29/2017.
 */
public class AdiministrationService {
    public double calculateSalary(Person p, String type)
    {
        if(type=="Management")
            return new Management(p).calculateSalary();
        else
            return new Employee(p).calculateSalary();
    }
}
