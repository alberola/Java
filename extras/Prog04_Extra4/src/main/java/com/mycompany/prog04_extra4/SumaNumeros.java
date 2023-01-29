/*
 * Programa que lea 10 números desde teclado en un proceso
 * repetitivo y muestre la suma. Realizar el programa con <<do-while>>
 */
package com.mycompany.prog04_extra4;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class SumaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0;
        do{
            System.out.println("Dame un número");
            int num = sc.nextInt();
            contador++;
            suma +=num;
            
        } while (contador < 10);
        System.out.println("La suma total es : "+ suma +".");
    }
    
}
