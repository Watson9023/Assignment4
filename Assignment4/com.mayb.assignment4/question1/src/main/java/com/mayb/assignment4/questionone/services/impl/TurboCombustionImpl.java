package com.mayb.assignment4.questionone.services.impl;

import com.mayb.assignment4.questionone.domain.TurboVehicle;
import com.mayb.assignment4.questionone.domain.VehicleData;
import com.mayb.assignment4.questionone.services.Vehicle;

/**
 * Created by Long on 3/31/2017.
 */
public class TurboCombustionImpl implements Vehicle {

    public VehicleData getVehicle(){
        VehicleData car = new TurboVehicle("Petroleum"
                , "Volkswagen"
                ,"Combustion"
                ,5
                ,"FWD"
                ,"t66"
        );

        return car;
    }

    public String showType(){
        return "Combustion Engine";
    }
}
