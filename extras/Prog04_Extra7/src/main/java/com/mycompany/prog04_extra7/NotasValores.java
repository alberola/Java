/*
 * Realiza un programa en Java que realice la correspondencia entre nota y valor. 
 */
package com.mycompany.prog04_extra7;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class NotasValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota: ");
        int nota = sc.nextInt();
        switch(nota){
            case 5:
                System.out.println("Tienes un suficiente.");
                break;
            case 6:
                System.out.println("Tienes un bien.");
                break;
            case 7:
                System.out.println("Tienes un notable bajo.");
                break;
            case 8:
                System.out.println("Tienes un notable alto.");
                break;
            case 9:
                System.out.println("Tienes un sobresaliente.");
                break;
            case 10:
                System.out.println("Tienes matricula de honor.");
                break;
            default:
                if(nota < 5){
                    System.out.println("Estás suspenso.");
                }else if (nota > 10){
                    System.out.println("Tienes una notaza.");
                }break;
        }
    }   
}
