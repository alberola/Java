/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc2;
import java.util.Arrays;
/**
 *
 * @author 1daw16
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Invertir Integer:");
  
        Integer[] numeros={0,1,2,3,4,5,6,7,8,9};
        
        System.out.println(Arrays.asList(numeros));

        Util<Integer> u= new Util<Integer>();

        u.invertir(numeros);

        for (int i=0;i<numeros.length;i++) System.out.println(numeros[i]);
        
        System.out.println("Invertir float:");
        
        Float[] numeros2={0.f,1.f,2.f,3.f,4.f,5.f,6.f,7.f,8.f,9.f};
        System.out.println(Arrays.asList(numeros2));

        Util<Float> v= new Util<Float>();

        v.invertir(numeros2);

        for (int i=0;i<numeros2.length;i++) System.out.println(numeros2[i]);
        
        System.out.println("Invertir Double:");
        
        Double[] numeros3={0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        System.out.println(Arrays.asList(numeros3));

        Util<Double> z= new Util<Double>();

        z.invertir(numeros3);

        for (int i=0;i<numeros.length;i++) System.out.println(numeros[i]);
        
        
    }
    
}
