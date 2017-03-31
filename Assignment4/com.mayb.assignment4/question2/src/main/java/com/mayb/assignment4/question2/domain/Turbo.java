package com.mayb.assignment4.question2.domain;

import java.io.Serializable;

/
/**
 * Created by Long on 3/31/2017.
 */
public class Turbo implements Serializable {

    private String size;
    private float powerUpgrade;

    public Turbo() {
    }

    public Turbo(String size, float powerUpgrade) {

        this.size = size;
        this.powerUpgrade = powerUpgrade;
    }

    public String getSize() {
        return size;
    }

    public float getPowerUpgrade() {
        return powerUpgrade;
    }
}
