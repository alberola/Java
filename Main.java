/*
 * Práctica 4 DAW- Programación
 *
 * 4.-Diseña un programa Java denominado PROG02_Ejerc4 que dada la edad de una persona,
 * muestre un mensaje indicando si es mayor de edad. NO se puede utilizar el operador condicional if.
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 05/11/2021
 */
package com.mycompany.prog02_ejerc4;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String mayor;//Se crea variable string para después agregar las dos opciones a imprimir.
        System.out.println("Dime tu edad:");
        int edad = sc.nextInt();//Se pide por teclado variable edad.
        mayor = (edad>=18)? "Eres mayor de edad.":"Eres menor de edad.";//Con un operador ternario comprobamos si edad>=18 y depende del mismo imprimiremos una de la dos opciones por pantalla.
        System.out.println(mayor);
    }
}
