/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2;

/**
 *
 * @author User
 */
interface Account {
    int deposit(int amount);
    boolean withdraw(int amount);
}

class BankAccount implements Account{
    int balance;
    
    public BankAccount(int integer){
        this.balance = integer;
    }
    
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    
    public boolean withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        } else
            return false;
    }
}
