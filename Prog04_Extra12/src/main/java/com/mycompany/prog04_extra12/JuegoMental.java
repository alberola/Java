/*
 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
 * se introducirán dos numeros aleatorios entre 1 y 100 y has de adivinarlo
 * si lo adivinas el juego continua, hasta que falles.
 */
package com.mycompany.prog04_extra12;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 13/01/2022
 */
public class JuegoMental {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resul,aux = 0,suma;
        do{
            int a = (int) (Math.random()*100+1);
            int b = (int) (Math.random()*100+1);
            suma = a+b;
            System.out.println("Dame un número para averiguar la suma: ");
            resul = sc.nextInt();
            if (resul == suma){
                aux++;
            }
            
        }while(resul == suma);
        System.out.println("El número de intentos acertado fue de: "+aux);
    }
    
}
