/*
 * Realiza un programa en Java que lea un número por teclado y muestre a qué día de la semana corresponde.
 * Realiza el ejercicio anterior con <<switch-case>>
 */
package com.mycompany.prog04_extra6;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class DiasSemanales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número del 1 al 7: ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Es lunes.");
                break;
            case 2:
                System.out.println("Es martes.");
                break;
           case 3:
                System.out.println("Es miercoles");
                break;
           case 4:
                System.out.println("Es jueves.");
                break;
           case 5:
                System.out.println("Es viernes.");
                break;
           case 6:
                System.out.println("Es sabado.");
                break;
           case 7: 
                System.out.println("Es domingo.");
                break;
           default:
                   System.out.println("Número de la semana no válido.");
                   break;
        }
    }
        
    
}
