/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2w1l1;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;


public class Part1Q2 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\SEM2W1L1\\src\\main\\java\\com\\mycompany\\sem2w1l1\\TanYeeFong_23004901.txt"));
            String []word = new String[500];
            int index = 0;

            while(in.hasNextLine()){
            word[index] = in.nextLine();
            index++;         
        }
            in.close();      
            
        String firstLetter = "";
            
        for(int i = 0 ; i < index; i++){
            firstLetter += word[i];
            }
        
        System.out.print(firstLetter);
        
        Scanner letter = new Scanner(System.in);
        System.out.println("\nEnter the second part of letter: ");
        String secondLetter = letter.nextLine();
        
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\SEM2W1L1\\src\\main\\java\\com\\mycompany\\sem2w1l1\\TanYeeFong_23004901.txt"));
            out.println(firstLetter);
            out.println("");
            out.print(secondLetter);
            out.close();
        } catch(IOException e){
            System.out.println("Probelm with file output");
        }
        
        try{
            Scanner in2 = new Scanner(new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\SEM2W1L1\\src\\main\\java\\com\\mycompany\\sem2w1l1\\TanYeeFong_23004901.txt"));
            while (in2.hasNextLine()){
                String finalLetter = in2.nextLine();
                System.out.print(finalLetter);
            }
        } catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
       
        } catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        
        
       
    } 
}
