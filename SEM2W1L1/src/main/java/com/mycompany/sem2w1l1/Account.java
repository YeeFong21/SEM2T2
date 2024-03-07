/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2w1l1;

/**
 *
 * @author User
 */
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("You have insufficient balance to withdraw that amount");
            System.out.println("Your current balance is " + balance);
        } else{
            System.out.println("You have successfully withdraw");
            balance -= amount;
            System.out.println("Your current balance is " + balance);
        }
    }
    
    public void deposit(double amount){
        balance += amount;
        System.out.println("You have successfully deposit");
        System.out.println("Your current balance is " + balance);
    }
}
