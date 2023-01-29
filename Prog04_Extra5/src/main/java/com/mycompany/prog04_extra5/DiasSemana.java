/*
 * Realiza un programa en Java que lea un número por teclado y muestre a qué día de la semana corresponde.
 * Realiza el programa con <<if>>
 */
package com.mycompany.prog04_extra5;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class DiasSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número del 1 al 7: ");
        int num = sc.nextInt();
        if(num > 7 || num < 1){
            System.out.println("No es ningún día de la semana."); 
        }else if(num==1){
            System.out.println("Es lunes.");
        }else if(num==2){
            System.out.println("Es martes.");
        }else if(num==3){
            System.out.println("Es miercoles");
        }else if(num==4){
            System.out.println("Es jueves.");
        }else if(num==5){
            System.out.println("Es viernes.");
        }else if(num==6){
            System.out.println("Es sabado.");
        }else if(num==7){
            System.out.println("Es domingo.");
        }
    }
    
}
