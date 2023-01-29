/*
 * Ejemplo de uso de while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.
 */
package com.mycompany.prog04_extra10;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class Contador {

    public static void main(String[] args) {
        int aux = 100;
        while( aux >= 1){
            System.out.println(aux);
            aux--;
        }
    }
    
}
