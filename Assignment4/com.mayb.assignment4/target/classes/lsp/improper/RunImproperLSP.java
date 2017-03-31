package com.mayb.assignment4.lsp.improper;

import java.awt.geom.Area;

/**
 * Created by root by Long on 3/31/2017.
 */
public class RunImproperLSP {

    public static void main (String [] args){

        Rectangle myRect = new Square();
        myRect.setHeight(4);
        myRect.setWidth(6);
        System.out.println(AreaCalculator.CalculateArea(myRect));


    }
}
