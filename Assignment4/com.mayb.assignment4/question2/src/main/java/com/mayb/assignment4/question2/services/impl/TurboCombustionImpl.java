package com.mayb.assignment4.question2.services.impl;

import com.mayb.assignment4.question2.domain.Turbo;
import com.mayb.assignment4.question2.domain.Vehicle;


/**
 * Created by Long on 3/31/2017.
 */
public class TurboCombustionImpl implements com.mayb.assignment4.question2.services.Vehicle {

    public Vehicle getVehicle() {
        Vehicle car = new Vehicle("Turbo"
                , "Nissan"
                ,"Combustion"
                ,5
                ,"RWD"
                , new Turbo("t88", 65.4f)
        );


        return car;
    }

    public String showType(){
        return "Electric Engine";
    }
}
