package com.mayb.assignment4;

import com.mayb.assignment4.questionone.conf.Config;
import com.mayb.assignment4.questionone.domain.TurboVehicle;
import com.mayb.assignment4.questionone.domain.VehicleData;
import com.mayb.assignment4.questionone.services.Vehicle;
import com.mayb.assignment4.questionone.services.impl.CombustionEngineCarImpl;
import com.mayb.assignment4.questionone.services.impl.ElectricCarImpl;
import com.mayb.assignment4.questionone.services.impl.TurboCombustionImpl;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;


/**
 * Created by Long on 3/31/2017.
 */
public class TestOOP {

    private Vehicle vehicle;
    @BeforeMethod
    public void setUp() throws Exception{
        ApplicationContext apc = new AnnotationConfigApplicationContext(Config.class);
        vehicle = (Vehicle)apc.getBean("normalCar");
    }

    @Test
    public void testObjectCreation(){

        VehicleData vd = vehicle.getVehicle();
        System.out.print("Vehicle Type = " + vd.getManufacturer());
        Assert.assertNotNull(vd);
    }

    @Test
    public void testSecureVariableAccess(){
        VehicleData vd = vehicle.getVehicle();

        Assert.assertTrue(vd.getDrivetrain()=="FWD", "Incorrect drivetrain returned");


    }

    @Test
    public void testObjectInheritance(){
       VehicleData ec = new ElectricCarImpl().getVehicle();
       // System.out.println(ec.getEngineType());
       Assert.assertEquals(ec.getEngineType(), "Electric");   //Object can access parent class methods and variables, and local special methods


    }

    @Test
    public void testPolymorphism(){
       VehicleData car = new TurboCombustionImpl().getVehicle();

        org.junit.Assert.assertTrue(car instanceof VehicleData  && car instanceof TurboVehicle);
    }
}
