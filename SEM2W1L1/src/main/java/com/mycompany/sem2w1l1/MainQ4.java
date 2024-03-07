/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2w1l1;

/**
 *
 * @author User
 */
public class MainQ4 {
    public static void main(String[] args) {
        Account1 a = new Account1("George",1122,1000);
        a.setAnnualInterestRate(1.5);
        
        a.deposit(30, "Deposit");
        a.deposit(40, "Deposit");
        a.deposit(50, "Deposit");
        a.withdraw(5, "Withdrawal");
        a.withdraw(4, "Withdrawal");
        a.withdraw(2, "Withdrawal");
        
        a.printSummary();
    }
}
