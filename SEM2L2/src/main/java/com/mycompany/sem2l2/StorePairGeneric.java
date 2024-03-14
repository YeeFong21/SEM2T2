/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem2l2;

/**
 *
 * @author User
 */
public class StorePairGeneric <T,V> implements Comparable<StorePairGeneric<T,V>>{
    private T first;
    private V second;
    
    public StorePairGeneric(T first, V second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    
    public V getSecond(){
        return second;
    }
    
    public void setPair(T first, V second){
        this.first = first;
        this.second = second;
    }
    
    public String toString(){
        return "First = " + first + " Second = " + second;
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        StorePairGeneric<?,?> compare = (StorePairGeneric<?,?>) obj;
        return first.equals(compare.getFirst());
    }
    
    public int compareTo(StorePairGeneric<T,V> other){
        if (this.first instanceof Comparable && other.getFirst() instanceof Comparable) {
            Comparable<T> firstComparable = (Comparable<T>) this.first;
            return firstComparable.compareTo(other.getFirst());
        }
        return 0;
    }
}
