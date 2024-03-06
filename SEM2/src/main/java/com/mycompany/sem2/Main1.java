/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2;

/**
 *
 * @author User
 */
public class Main1 {
    public static void main(String[] args) {
        Telephone [] telephone = new Telephone[5];
        
        Telephone t1 = new Telephone("03","79676300");
        Telephone t2 = new Telephone("03","79676301");
        Telephone t3 = new Telephone("03","79676302");
        Telephone t4 = new Telephone("03","79676303");
        Telephone t5 = new Telephone("03","79676304");
        
        telephone[0] = t1;
        telephone[1] = t2;
        telephone[2] = t3;
        telephone[3] = t4;
        telephone[4] = t5;
        
        for(int i = 0 ; i < telephone.length; i++){
            System.out.println(telephone[i].makeFullNumber());
        }
    }
}
