package com.mayb.assignment4.questionone.conf;

import com.mayb.assignment4.questionone.services.Vehicle;
import com.mayb.assignment4.questionone.services.impl.CombustionEngineCarImpl;
import com.mayb.assignment4.questionone.services.impl.ElectricCarImpl;
import org.springframework.context.annotation.Bean;


/**
 * Created by Long on 3/31/2017.
 */
public class Config {

    @Bean(name="electricCar")
    public Vehicle getCar(){ return new ElectricCarImpl();  }

    @Bean(name="normalCar")
    public Vehicle getVan(){ return new CombustionEngineCarImpl();  }

}
