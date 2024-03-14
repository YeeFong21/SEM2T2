/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2l2;

/**
 *
 * @author User
 */
public class FindMinMax {
    public static <T extends Comparable> String minmax(T[] array){
        T min = array[0];
        T max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return "Min = " + min + " Max = " + max;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        String intResult = minmax(intArray);
        String strResult = minmax(strArray);

        System.out.println(intResult); 
        System.out.println(strResult);
    }
}
