package com.Watson.inheritance;

import javax.swing.*;

/**
 * Created by Long on 3/31/2017.
 */
public class runClientAccounts {
    public static void main(String[] args) {
        Client fnbClient = new Client();
        String name = JOptionPane.showInputDialog("Please Enter Client name: ");
        fnbClient.setClientName(name);
        String sName = JOptionPane.showInputDialog("Please Enter Client surname: ");
        fnbClient.setClientSurname(sName);
        String num = JOptionPane.showInputDialog("Please Enter Account Number: ");
        int accNum = Integer.parseInt(num);
        fnbClient.setAccountNumber(accNum);
        String type = JOptionPane.showInputDialog("Please Enter Account Type: ");
        fnbClient.setAccountType(type);
        String bal = JOptionPane.showInputDialog("Please Enter Account Balance: R");
        int accBal = Integer.parseInt(bal);
        fnbClient.setAccountBalance(accBal);
        String deposit = JOptionPane.showInputDialog("Please Enter amount to deposit: R");
        int dep = Integer.parseInt(deposit);
        fnbClient.deposit(dep);
        if(accBal > 0) {
            String withraw = JOptionPane.showInputDialog("Please Enter amount to withdraw: R");
            int wDraw = Integer.parseInt(withraw);
            fnbClient.withdraw(wDraw);
        }
        JOptionPane.showMessageDialog(null, "Account Number: " +fnbClient.getAccountNumber() + "\nName " + fnbClient.getClientName()+ "\nSurname " + fnbClient.getClientSurname() + "\nAccount Type: " + fnbClient.getAccountType() + "\nBalance: " + fnbClient.getAccountBalance());
    }
}
