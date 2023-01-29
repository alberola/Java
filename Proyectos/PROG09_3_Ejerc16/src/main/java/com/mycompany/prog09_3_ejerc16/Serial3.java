/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */
public class Serial3 {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Empleado emp;

        try {
            //Cargamos el fichero y le metemos la variable emp de tipo empleado con los atributos del mismo
            // cada vez que le metemos un empleado nuevo guardamos en el fichero personas.dat
            fos = new FileOutputStream("C:\\Users\\1DAW16\\Documents\\NetBeansProjects\\PROG09_3_Ejerc16\\personas.dat");
            salida = new ObjectOutputStream(fos);
            emp = new Empleado("12345678A", "Lucas González", 30, 1200.40);
            salida.writeObject(emp);
            emp = new Empleado("98765432B", "Anacleto Jiménez", 28, 1000);
            salida.writeObject(emp);
            emp = new Empleado("78234212Z", "María Zapata", 35, 1100.25);
            salida.writeObject(emp);
            //Catch para controlar las posibles excepciones que se generen
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            //Comprobacion final que se ejecutará siempre.
        } finally {
            try {
                //Si el fichero no es nulo (es decir hemos escrito o hay contenido) lo cerraremos
                if (fos != null) {
                    fos.close();
                }
                //Igual con la salida
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
