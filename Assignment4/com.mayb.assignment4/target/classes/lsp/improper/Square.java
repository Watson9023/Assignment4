package com.mayb.assignment4.lsp.improper;

/**
 * Created by root on by Long on 3/31/2017.
 */
public class Square extends Rectangle{
    private int height;
    private int width;

    public Square() {
    }

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
