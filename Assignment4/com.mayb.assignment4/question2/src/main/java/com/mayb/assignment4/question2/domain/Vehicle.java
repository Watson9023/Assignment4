package com.mayb.assignment4.question2.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by Long on 3/31/2017.
 */
public class Vehicle implements Serializable {

    private Date manufactureDate;
    private String fuelType;
    private String manufacturer;
    private String EngineType;
    private int seats;
    private String drivetrain;
    private Turbo T;

    public Vehicle(String fuelType, String manufacturer, String engineType, int seats, String drivetrain) {

        this.fuelType = fuelType;
        this.manufacturer = manufacturer;
        this.EngineType = engineType;
        this.seats = seats;
        this.drivetrain = drivetrain;
    }
    public Vehicle(String fuelType, String manufacturer, String engineType, int seats, String drivetrain, Turbo turbo) {

        this.fuelType = fuelType;
        this.manufacturer = manufacturer;
        this.EngineType = engineType;
        this.seats = seats;
        this.drivetrain = drivetrain;
        this.T = turbo;
    }

    public Turbo getTurbo() {
        return T;
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



