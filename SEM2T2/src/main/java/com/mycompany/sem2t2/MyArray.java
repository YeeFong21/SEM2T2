/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2t2;

/**
 *
 * @author User
 */
public class MyArray {
    public static <T> void listAll(T[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"Jane", "Tom", "Bob"};
        Character[] characters = {'a', 'b', 'c'};
        
        listAll(integers);
        listAll(strings);
        listAll(characters);
    }
}
