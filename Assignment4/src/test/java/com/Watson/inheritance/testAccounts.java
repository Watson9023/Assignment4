package com.Watson.inheritance;

import com.Watson.Composition.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Long on 3/31/2017.
 */
public class testAccounts {
    private Account accObject;
    @Before
    public void setUp() throws Exception {
        accObject = new Account();
    }

    @Test
    public void testSetAccountNumber() throws Exception {
        accObject.setAccountNumber(903675235);
        Assert.assertEquals(903675235,903675235);
    }

    @Test
    public void testSetAccountType() throws Exception {
        accObject.setAccountType("Savings Account");
        Assert.assertEquals("Savings Account", "Savings Account");
    }

    @Test
    public void testSetAccountBalance() throws Exception {
        accObject.setAccountBalance(909090);
        Assert.assertEquals(909090,909090);
    }

    @Test
    public void testGetAccountNumber() throws Exception {
        accObject.setAccountNumber(353416789);
        Assert.assertEquals(accObject.getAccountNumber(),353416789);
    }

    @Test
    public void testGetAccountType() throws Exception {
        accObject.setAccountType("Savings Account");
        Assert.assertEquals(accObject.getAccountType(),"Savings Account");
    }

    @Test
    public void testGetAccountBalance() throws Exception {
        accObject.setAccountBalance(9000000);
        Assert.assertEquals(accObject.getAccountBalance(),1000000,0);
    }

    @Test
    public void testWithdraw() throws Exception {
        accObject.setAccountBalance(9000000);
        accObject.withdraw(2000000);
        Assert.assertEquals(6000000,6000000);
    }

    @Test
    public void testDeposit() throws Exception {
        accObject.setAccountBalance(9000000);
        accObject.deposit(400000);
        Assert.assertEquals(9400000,9400000);
    }
}
