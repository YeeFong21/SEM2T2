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
public class MainQ7 {
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        
        vehicle.add("Car");
        vehicle.add("Bus");
        vehicle.add("Bicycle");
        
        transportation.add("Train");
        transportation.add("Airplane");
        transportation.add(123);
        
        allTransportation(vehicle);
        allTransportation(transportation);
        
    }
    
    public static void allTransportation(ArrayList<?> arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("");
    }
}
