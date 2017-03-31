package com.mayb.assignment4.lsp.improper;

/**
 * Created by root on by Long on 3/31/2017.
 */
public class AreaCalculator {

    public static int CalculateArea(Rectangle r) {
        return r.getHeight() * r.getWidth();
    }



    public static int CalculateArea(Square s) {
        return s.getHeight() * s.getHeight();
    }
}
