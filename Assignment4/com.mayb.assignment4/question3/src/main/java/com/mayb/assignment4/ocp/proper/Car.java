package com.mayb.assignment4.ocp.proper;

/**
 * Created by by Long on 3/31/2017.
 */
public abstract class Car {

    private String make;

    public Car(String make){
        this.make = make;
    }
    public abstract void drive();

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
