package com.mayb.assignment4.ocp.improper;

/**
 * Created by by Long on 3/31/2017.
 */
public class Car {

    private String make;
    private String type;

    public Car(String make, String type){
        this.make = make;
        this.type = type;
    }


    public void drive(){

        if(type == "Hatchback")
            System.out.println("I am driving "+getMake()+" hatchback !");
            else
            System.out.println("I am driving "+getMake()+" Sedan car!");


    };

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
