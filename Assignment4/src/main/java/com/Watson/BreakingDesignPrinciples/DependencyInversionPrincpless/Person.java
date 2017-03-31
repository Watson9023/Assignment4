package com.Watson.BreakingDesignPrinciples.DependencyInversionPrincpless;

/**
 * Created by Long on 3/29/2017.
 */
public abstract class Person {
    private String name, surname;
    private double rate, hours;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateBasic()
    {
        return rate * hours;
    }
}
