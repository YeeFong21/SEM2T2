/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2w1l1;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Account1 {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;
    
    public Account1(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        transactions = new ArrayList<>();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
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
    
    public void withdraw(double amount, String description) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, description));
    }

    public void deposit(double amount, String description) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, description));
    }
    
    public void printSummary(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Interest Rate: " + annualInterestRate + "%");
        System.out.println("Balance: $" + balance);
        System.out.println("Transactions:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
    
    
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String toString() {
        return "Date: " + date + "\nType: " + type + "\nAmount: $" + amount + "\nBalance: $" + balance + "\nDescription: " + description + "\n";
    }
}
