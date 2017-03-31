package com.mayb.assignment4.dip.proper;

import com.mayb.assignment4.dip.improper.Engineer;
import com.mayb.assignment4.dip.improper.SalesAssistant;
import com.mayb.assignment4.dip.proper.services.IWorker;

/**
 * Created by root on 2016/03/27.
 */
public class Manager {
    /*
        by removing the dependencies on other
        specific classes, we are now relying on an
        interface rather than a concrete class
        So we could add another type of employee
        without changing the manager class
    */

    IWorker w;

    Manager(){};

    public void manageEmployee()
    {
        w.work();
    }

    public void setWorker(IWorker w) {
        this.w = w;
    }

}
