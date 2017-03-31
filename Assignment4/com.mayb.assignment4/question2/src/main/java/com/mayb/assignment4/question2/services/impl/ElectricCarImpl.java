package com.mayb.assignment4.question2.services.impl;

import com.mayb.assignment4.question2.domain.Vehicle;


/**
 * Created by Long on 3/31/2017.
 */
public class ElectricCarImpl implements com.mayb.assignment4.question2.services.Vehicle {

    public Vehicle getVehicle() {
        Vehicle car = new Vehicle("Electricity"
                , "Tesla"
                ,"Electric"
                ,5
                ,"FWD"
        );


        return car;
    }

    public String showType(){
        return "Electric Engine";
    }
}
