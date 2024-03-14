/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2t2;

/**
 *
 * @author User
 */
import java.util.*;
public class MainQ8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        
        numOfCars.add(8888);
        numOfCars.add(921);
        numOfCars.add(625);
        
        milesPerHour.add(135.7);
        milesPerHour.add(140.3);
        milesPerHour.add(118.4);
        
        display(numOfCars);
        display(milesPerHour);
        
    }
    
    public static void display(ArrayList<? extends Number> arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("");
    }
}
