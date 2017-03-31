package com.mayb.assignment4.question2.services.impl;

import com.mayb.assignment4.question2.domain.Vehicle;


/**
 * Created by Long on 3/31/2017.
 */
public class CombustionEngineCarImpl implements com.mayb.assignment4.question2.services.Vehicle {

    public Vehicle getVehicle(){
        Vehicle car = new Vehicle("Petroleum"
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
