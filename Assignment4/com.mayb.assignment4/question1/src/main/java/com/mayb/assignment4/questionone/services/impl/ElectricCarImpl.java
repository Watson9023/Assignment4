package com.mayb.assignment4.questionone.services.impl;

import com.mayb.assignment4.questionone.domain.VehicleData;
import com.mayb.assignment4.questionone.services.Vehicle;

/**
 * Created by Long on 3/31/2017.
 */
public class ElectricCarImpl implements Vehicle{

    public VehicleData getVehicle() {
        VehicleData car = new VehicleData("Electricity"
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
