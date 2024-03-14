/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sem2l2;

/**
 *
 * @author User
 */
public class MainQ1 {

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("Lucky Huat Ah!!");
        MyGeneric<Integer> intObj = new MyGeneric<>(8888);
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
