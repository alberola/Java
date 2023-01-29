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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prueba Generica: ");
        Double []a={0.0,1.0,2.0,3.0,4.0}; 
        Double []b={0.0,1.0,2.0,3.0,4.0,5.0};
        int resultado = Util.<Double>compararTamanoGenerico (a, b);
        if( resultado < 0){
            System.out.println("B es mayor que A.");
        } else if( resultado > 0){
            System.out.println("A es mayor que B.");
        } else{
            System.out.println("Son del mismo tamaño.");
        }
        
        System.out.println("Prueba no generica con doubles:");
        Integer []c={0,1,2,3,4,5,6}; 
        Integer []d={0,1,2,3,4,5}; 
        int resultado2 = Util.compararTamano ((Object[])c, (Object[])d);
        if( resultado2 < 0){
            System.out.println("B es mayor que A.");
        } else if( resultado2 > 0){
            System.out.println("A es mayor que B.");
        } else{
            System.out.println("Son del mismo tamaño.");
        }
        System.out.println("Prueba no generica con floats :");
        Float []e={0.f,1.f,2.f,3.f,4.f,5.f}; 
        Float []f={0.f,1.f,2.f,3.f,4.f,5.f}; 
        int resultado3 = Util.compararTamano ((Object[])e, (Object[])f);
        if( resultado3 < 0){
            System.out.println("B es mayor que A.");
        } else if( resultado3 > 0){
            System.out.println("A es mayor que B.");
        } else{
            System.out.println("Son del mismo tamaño.");
        }
    }
    
}
