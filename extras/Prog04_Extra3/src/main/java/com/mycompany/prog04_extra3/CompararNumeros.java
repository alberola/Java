/*
 * 3.-Programa que lea dos números pasados por teclado
 * y muestre el mayor en pantalla. Si son iguales deberá mostrar un mensaje indicándolo.
 */
package com.mycompany.prog04_extra3;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class CompararNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer número: ");
        int a = sc.nextInt();
        System.out.println("Dame el segundo número: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Ambos son iguales.");
        }else{
            System.out.println(((a>b)?a+" es mayor.":b+" es mayor."));
        }
        
    }
    
}
