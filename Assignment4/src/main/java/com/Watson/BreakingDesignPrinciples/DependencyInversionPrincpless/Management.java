package com.Watson.BreakingDesignPrinciples.DependencyInversionPrincpless;

/**
 * Created by Long on 3/29/2017.
 */
public class Management extends Person{
    private double costPerKM;
    private int totalKMs;

    public Management(Person p)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
    }

    public Management(){

    }

    public Management(Person p, double cost, int kms)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
        costPerKM = cost;
        totalKMs = kms;
    }


    public double getCostPerKM() {
        return costPerKM;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }

    public int getTotalKMs() {
        return totalKMs;
    }

    public void setTotalKMs(int totalKMs) {
        this.totalKMs = totalKMs;
    }

    public double calculateSalary(){
        return (costPerKM * totalKMs) + calculateBasic();
    }

}
