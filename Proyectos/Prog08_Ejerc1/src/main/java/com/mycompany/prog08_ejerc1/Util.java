/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc1;

/**
 *
 * @author 1daw16
 */
public class Util {
    
    //Metodo comparar tamaño arrays genericos 
    
    public static <T> int compararTamanoGenerico (T[] a, T[] b) { 
        return a.length-b.length; 
    }
    
    //Metodo comparar tamaño arrays
    
    public static int compararTamano(Object[] a,Object[] b) { 
        return a.length-b.length; 
    }
    
    
}
