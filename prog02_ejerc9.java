/**
 * Práctica 9 DAW - Programación.
 * 
 * 9.- Diseña un programa Java, denominado PROG02_Ejerc9, que dado un año indique si es bisiesto o no. 
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 05/11/2021
 */
package com.mycompany.prog02_ejerc9;
import java.util.Scanner;
public class prog02_ejerc9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año para calcular si es bisiesto o no.");
        int año = sc.nextInt();//Creamos variable año y pedimos lectura por teclado
        if ((año % 4 ==0 && año % 100 !=0) || (año % 100 ==0 && año % 400 ==0)){//Mediante un if aplicamos los requisitos para saber si es bisiesto.
            System.out.printf("%d Es bisiesto",año); //Si se cumple es bisiesto
        }else{
            System.out.printf("%d No es bisiesto.",año); //Si no se cumple no es bisiesto
        }
        
    }
    
}
