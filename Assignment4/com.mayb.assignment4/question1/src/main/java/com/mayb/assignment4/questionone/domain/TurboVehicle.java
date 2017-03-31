package com.mayb.assignment4.questionone.domain;


/**
 * Created by Long on 3/31/2017.
 */
public class TurboVehicle extends VehicleData {

    String turboType;
    public TurboVehicle(String fuelType, String manufacturer, String engineType, int seats, String drivetrain, String turboType){
        super( fuelType,  manufacturer,  engineType,  seats,  drivetrain);
        this.turboType= turboType;
    }


}
