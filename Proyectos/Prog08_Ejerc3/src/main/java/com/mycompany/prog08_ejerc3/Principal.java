/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc3;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
/**
 *
 * @author 1daw16
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo conjunto TreeSet");      
        TreeSet <Integer> t;
        t=new TreeSet<Integer>();     

        t.add(new Integer(4));
        t.add(new Integer(3));
        t.add(new Integer(1));
        t.add(new Integer(99));       
        t.add(500);
        t.add(-1000);
        t.add(7000);
        t.add(-99);
        t.add(12000);
        t.add(800);

        for (Integer i:t) {System.out.println(i);
            }
        
        System.out.println("\nEjemplo conjunto LinkedHashSet");    
        
        LinkedHashSet <Integer> l;

        l=new LinkedHashSet<Integer>();     

        l.add(new Integer(4));
        l.add(new Integer(3));
        l.add(new Integer(1));
        l.add(new Integer(99));

        for (Integer i:l) System.out.println(i);
        System.out.println(l);
        
        System.out.println("\nEjemplo conjunto HashSet"); 
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(25);
            System.out.println(hashSet);
    }
}
