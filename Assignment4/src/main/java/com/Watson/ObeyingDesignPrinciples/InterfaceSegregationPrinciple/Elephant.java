package com.Watson.ObeyingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Long on 3/31/2017.
 */
public class Elephant implements LandAnimal{
    public void walk() {
        System.out.println("Walking. . .");
    }

    public void run() {
        System.out.println("Running. . .");
    }
}
