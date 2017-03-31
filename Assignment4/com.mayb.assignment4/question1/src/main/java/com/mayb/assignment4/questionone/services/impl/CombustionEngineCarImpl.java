package com.mayb.assignment4.questionone.services.impl;

import com.mayb.assignment4.questionone.domain.VehicleData;
import com.mayb.assignment4.questionone.services.Vehicle;


/**
 * Created by Long on 3/31/2017.
 */
public class CombustionEngineCarImpl implements Vehicle {

    public VehicleData getVehicle(){
        VehicleData car = new VehicleData("Petroleum"
                , "Volkswagen"
                ,"Combustion"
                ,5
                ,"FWD"
                );

        return car;
    }

    public String showType(){
        return "Combustion Engine";
    }
}
