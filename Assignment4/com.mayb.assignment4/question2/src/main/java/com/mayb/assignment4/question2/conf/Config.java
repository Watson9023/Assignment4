package com.mayb.assignment4.question2.conf;

import com.mayb.assignment4.question2.services.Vehicle;
import com.mayb.assignment4.question2.services.impl.CombustionEngineCarImpl;
import com.mayb.assignment4.question2.services.impl.ElectricCarImpl;
import org.springframework.context.annotation.*;


/**
 * Created by Long on 3/31/2017.
 */
public class Config {

    @Bean(name="electricCar")
    public Vehicle getCar(){ return new ElectricCarImpl();  }

    @Bean(name="normalCar")
    public Vehicle getVan(){ return new CombustionEngineCarImpl();  }

}
