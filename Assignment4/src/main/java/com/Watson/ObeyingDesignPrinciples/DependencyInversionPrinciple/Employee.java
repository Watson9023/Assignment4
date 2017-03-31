package com.Watson.ObeyingDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Employee extends Person implements  Adiminstration  {
    private double overTimeRate, overTimeHours;

    public Employee(Person p)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
    }

    public Employee(){

    }

    public Employee(Person p, double overTime, double hours)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
        setoverTimeHours(hours);
        setOverTimeRate(overTime);
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public double getoverTimeHours() {
        return overTimeHours;
    }

    public void setoverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double calculateSalary()
    {
        return (overTimeHours*overTimeRate) + calculateBasic();
    }
}
