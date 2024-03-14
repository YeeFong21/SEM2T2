/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2t2;

/**
 *
 * @author User
 */
public class Duo<A,B> {
    A first;
    B second;
    
    public Duo(A first,B second){
        this.first = first;
        this.second = second;
    }
    
    public A getFirst(){
        return first;
    }
    
    public B getSecond(){
        return second;
    }
}
