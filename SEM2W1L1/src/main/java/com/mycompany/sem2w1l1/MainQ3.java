/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2w1l1;

/**
 *
 * @author User
 */
public class MainQ3 {
    public static void main(String[] args) {
        Account YeeFong = new Account(1122,200000);
        YeeFong.setAnnualInterestRate(4.5);
        YeeFong.withdraw(2500);
        YeeFong.deposit(3000);
        System.out.println(YeeFong.getBalance());
        System.out.println(YeeFong.getMonthlyInterest());
        System.out.println(YeeFong.getDateCreated());
        
    }
}
