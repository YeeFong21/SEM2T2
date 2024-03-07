/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2w1l1;

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;

public class L1Q2 {
    public static void main(String[] args) {
        int count = 0;
        seperateSpecialCharacter("text1.txt",count);
        count++;
        seperateSpecialCharacter("text2.txt",count);
        count++;
        seperateSpecialCharacter("text3.txt",count);
        count++;
        seperateNumbers("text4.txt",count);
    }
       
    public static void seperateSpecialCharacter(String path, int count){
        try{
            Scanner in = new Scanner(new FileInputStream(path));
            String line;
            String newLine = "";
            int characterCount = 0;
            while(in.hasNextLine()){
                line = in.nextLine();
                newLine = newLine + line.replaceAll("[,;\\s]", " ") + "\n";      
            }
            System.out.println(newLine);
            
            if(count == 0){
                System.out.println((newLine.replaceAll("[\\s]", "")).length());
            }
            in.close();
            
            
        } catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        
    }
    
    public static void seperateNumbers(String path,int count){
        try{
            Scanner in = new Scanner(new FileInputStream(path));
            String line;
            String newLine = "";
            int characterCount = 0;
            while(in.hasNextLine()){
                line = in.nextLine();
                newLine = newLine + line.replaceAll("[0-9]", "") + "\n";      
            }
            System.out.println(newLine);
            
            if(count == 0){
                System.out.println((newLine.replaceAll("[\\s]", "")).length());
            }
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }

}
    
    
