package com.Watson.inheritance;

/**
 * Created by Long on 3/31/2017.
 */
public class Accounts {
    private int accNumber;
    private String accType;
    private double balance;
    public Accounts()
    {

    }

    public Accounts(int num, String type, double bal)
    {

    }

    public void setAccountNumber(int num)
    {
        accNumber = num;
    }

    public void setAccountType(String type)
    {
        accType = type;
    }

    public void setAccountBalance(double bal)
    {
        balance = bal;
    }

    public int getAccountNumber()
    {
        return accNumber;
    }

    public String getAccountType()
    {
        return accType;
    }

    public double getAccountBalance()
    {
        return balance;
    }

    public double withdraw(double amt)
    {
        return balance -= amt;
    }

    public double deposit(double amt)
    {
        return balance += amt;
    }
}
