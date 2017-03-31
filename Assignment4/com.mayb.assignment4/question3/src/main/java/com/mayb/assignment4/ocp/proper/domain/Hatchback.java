package com.mayb.assignment4.ocp.proper.domain;

import com.mayb.assignment4.ocp.proper.Car;

/**
 * Created by by Long on 3/31/2017.
 */
public class Hatchback extends Car {

    public Hatchback(String make) {
        super(make);
    }


    @Override
    public void drive() {
        System.out.println("I am driving "+getMake()+" hatchback !");

    }

}
