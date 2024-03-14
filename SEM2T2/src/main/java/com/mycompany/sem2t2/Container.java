/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2t2;

/**
 *
 * @author User
 */
public class Container<T> {
    private T t;
    boolean gotThing;
    
    public Container(){
        gotThing = false;
    }
    
    public void add(T t){
        this.t = t;
        gotThing = true;
    }
    
    public T retrieve(){
        if(gotThing){
            return t;
        }else 
            return null;
    }
    
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.add("Java");
        System.out.println(container1.retrieve());;
        
        Container<Integer> container2 = new Container<>();
        container2.add(50);
        System.out.println(container2.retrieve());
    }
}
