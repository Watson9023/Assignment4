package com.mayb.assignment4.questionone.domain;

import java.io.Serializable;


/**
 * Created by Long on 3/31/2017.
 */
public class VehicleData implements Serializable {

    private String fuelType;
    private String manufacturer;
    private String EngineType;
    private int seats;
    private String drivetrain;

    public VehicleData(String fuelType, String manufacturer, String engineType, int seats, String drivetrain) {

        this.fuelType = fuelType;
        this.manufacturer = manufacturer;
        this.EngineType = engineType;
        this.seats = seats;
        this.drivetrain = drivetrain;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getEngineType() {
        return EngineType;
    }

    public int getSeats() {
        return seats;
    }

    public String getDrivetrain() {
        return drivetrain;
    }


}



