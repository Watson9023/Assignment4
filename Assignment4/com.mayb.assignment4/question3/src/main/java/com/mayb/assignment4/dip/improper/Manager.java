package com.mayb.assignment4.dip.improper;

/**
 * Created by root on 2016/03/27.
 */
public class Manager {
    //High level classes cannot depend on lower level classes
    //Otherwise it is in violiation of the dependency inversion principle

    SalesAssistant w;
    Engineer e;
    Manager(){}


    public void manageSalesAssistant()
    {
        w.work();
    }

    public void manageEngineer()
    {
        e.work();
    }

    public void setW(SalesAssistant w) {
        this.w = w;
    }

    public void setE(Engineer e) {
        this.e = e;
    }
}
