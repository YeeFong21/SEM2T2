/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2;

/**
 *
 * @author User
 */
public class Telephone {
    String areaCode;
    String number;
    static int numberOfTelephoneObject = 0;
    
    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
    }
    
    public String getAreaCode(){
        return this.areaCode;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
}
