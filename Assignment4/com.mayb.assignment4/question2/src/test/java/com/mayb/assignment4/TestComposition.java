package com.mayb.assignment4;

import com.mayb.assignment4.question2.domain.Vehicle;
import com.mayb.assignment4.question2.services.impl.TurboCombustionImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Long on 3/31/2017.
 */
public class TestComposition {

    @Test
    public void TestComposition(){
        Vehicle turboCar = new TurboCombustionImpl().getVehicle();
        Assert.assertEquals(turboCar.getTurbo().getSize(), "t88", "Turbo does not match/exist");

    }


}
