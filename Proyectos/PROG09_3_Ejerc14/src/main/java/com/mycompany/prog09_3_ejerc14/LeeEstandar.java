/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc14;

import java.io.IOException;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 06/05/2022
 */
public class LeeEstandar {

    public static void main(String[] args) {
        //Cadena donde iremos almacenando el valor de la cadena
        //Por defecto un StringBuilder tendra asignado 16 caracteres
        //Podemos definirle una cadena de caracteres o bien un numero entero de caracteres máximos
        StringBuilder strB = new StringBuilder("hola");
        char c;
        //Por si ocurre una excepcion ponemos el bloque try-catch
        System.out.println(strB.capacity());
        try {
            //Mientras la entrada de teclado no sea intro o un salto de linea
            while ((c = (char) System.in.read()) != '\n') {
                //Se añade el caracter leido a la cadena str
                strB.append(c);

            }
        } catch (IOException ex) {

        }
        System.out.println(strB);
        System.out.println(strB.capacity());
    }

}
