/*
 * Pedir tres números por teclado y mostrarlos ordenadamente de menor a mayor.
 */
package com.mycompany.prog04_extra13;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class CalculoMayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer número: ");
        int a = sc.nextInt();
        System.out.println("Dame el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Dame el tercer número: ");
        int c = sc.nextInt();
        System.out.println("El valor máximo es: "+ Math.max(a, Math.max(b, c)));
        if(a > b && b > c){
            System.out.println(a + "," + b + "," + c);
        }else if (a > c && c > b){
            System.out.println(a + "," + c + "," + b);
        }else if (b > a && a > c){
            System.out.println(b + "," + a + "," + c); 
        }else if (b > c && c > a){
            System.out.println(b + "," + c + "," + a);
        }else if (c > a && a > b){
            System.out.println(c + "," + a + "," + b);
        }else if (c > b && b > a){
            System.out.println(c + "," + b + "," + a);
        }
    }
        
}
