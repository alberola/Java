/*
 * Realizar un programa con <<for>> que muestre los caracteres ASCII de 0 a 255
 */
package com.mycompany.prog04_extra8;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 23/01/2022
 */
public class Ascii {

    public static void main(String[] args) {
        for (int i = 0; i <= 255; i++){
            System.out.println("El código ASCII de "+i+" es "+((char)i));
        }
    }
    
}
