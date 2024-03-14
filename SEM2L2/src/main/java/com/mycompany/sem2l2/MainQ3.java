/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2l2;

/**
 *
 * @author User
 */
public class MainQ3 {
    public static void main(String[] args) {
        StorePairGeneric<Integer,Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer,Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer,Integer> c = new StorePairGeneric<>(6,3);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
        
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}
