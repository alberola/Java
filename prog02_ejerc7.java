/**
 * Práctica 7 DAW - Programación  
 *
 * 7.- Diseña un programa Java denominado PROG02_Ejerc7 para resolver una ecuación de primer grado
 * con una incógnita (x), suponiendo que los coeficientes de la ecuación son C1 y C2 se inicializan en el método main:
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 05/11/2021
 */
package com.mycompany.prog02_ejerc7;
import java.util.Scanner;
public class prog02_ejerc7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float resultado;//Creamos la variable correspondiente a x o resultado la cual despues calcularemos.
        System.out.println("Procederemos a calcular una ecuacion de primer grado.\n");
        System.out.println("Dame el valor de a: ");
        float a = sc.nextInt();//Pedimos por pantalla la variable correspondiente a.
        System.out.println("Dame el valor de b: ");
        float b = sc.nextInt();//Pedimos por pantalla la variable correspondiente a b.
        resultado = (-b/a);//Una vez tenemos los valores de a y b realizamos la operacion correspondiente suponiendo que ponemos bien la ecuacion que seria pasar la b hacia la derecha por lo cual quedarioia negativa y dividirla entre a.
        System.out.printf("El valor de la ecuacion %fx + %f = 0 es:\n x = %.2f. ",a,b,resultado); //Una vez calculado el valor de resultado imprimimos por pantalla el mismo.
    }
}
