package com.Watson.Composition;

/**
 * Created by Long on 3/30/2017.
 */
public class Account {
    private int accNumber;
    private String accType;
    private double balance;
    public Account()
    {

    }

    public Account(int num, String type, double bal)
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

    public String toString()
    {
        String msg = String.format("Account Number: %s\nAccount Type: %s\nAccount Balance: R%s\n", getAccountNumber(), getAccountType(), getAccountBalance());
        return msg;
    }
}
