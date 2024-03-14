/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sem2t2;

/**
 *
 * @author User
 */
import java.util.*;

public class MainQ5 {

    public static void main(String[] args) {
        Duo<String,Integer> profile = new Duo<>("Tan Yee Fong", 19);
        Duo<Integer, Integer> birthday = new Duo<>(9, 21);
        Duo<Character,String> gender = new Duo<>('M',"I am gay");
        
        System.out.println(profile.getFirst());
        System.out.println(profile.getSecond());
        System.out.println(birthday.getFirst());
        System.out.println(birthday.getSecond());
        System.out.println(gender.getFirst());
        System.out.println(gender.getSecond());
        
        Duo<String,Integer> sideShape = new Duo<>("Rectangle",30);
        Duo<Double,Double> points = new Duo<>(50.4,90.6);
        System.out.println(points.getSecond());
    }
}
