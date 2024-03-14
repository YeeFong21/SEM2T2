/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2l2;

/**
 *
 * @author User
 */
public class CompareMax {
    
    public static <T extends Comparable> T maximum(T x, T y, T z){
        T max = x;
        
        if (y.compareTo(max) > 0) {
            max = y; 
        }

        // Compare z with max
        if (z.compareTo(max) > 0) {
            max = z; 
        }

        return max;
    }
    
    public static void main(String[] args) {
        int maximum = maximum(5,23,1);
        System.out.println(maximum);
    }
}
