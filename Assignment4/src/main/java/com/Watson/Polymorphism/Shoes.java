package com.Watson.BreakingDesignPrinciples.Polymorphism;

/**
 * Created by Long on 3/31/2017.
 */
public class Shoes {
    int size ;
    String action = "Standing";

    public Shoes()
    {

    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }

    public String performAction()
    {
        System.out.println("The man is " + action);
        return action;
    }
}
