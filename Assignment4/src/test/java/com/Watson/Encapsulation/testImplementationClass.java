package com.Watson.Encapsulation;

import com.Watson.BreakingDesignPrinciples.Encapsulation.ImplementationClass;
import com.Watson.BreakingDesignPrinciples.Encapsulation.myClass;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Long on 3/31/2017.
 */
public class testImplementationClass {
    ImplementationClass _impl;

    public testImplementationClass() {
        _impl = new ImplementationClass(new myClass("Rice"), 15, 6.99);
    }

    @Test
    public void testSingleCost()
    {
        double expectedValue = 7.66000000000001;
        Assert.assertEquals(_impl.calculateSignleItem(), expectedValue);
    }


    @Test
    public void failTestSingleCost()
    {
        double failValue = 27;
        Assert.assertEquals(_impl.calculateSignleItem(), failValue);
    }

    @Test
    public void testTotalCost()
    {
        double expectedValue = 75.312;
        Assert.assertEquals(_impl.calculateTotalCost(), expectedValue);
    }

    @Test
    public void failTestTotalCost()
    {
        double failValue = 4;
        Assert.assertEquals(_impl.calculateTotalCost(), failValue);
    }


}
