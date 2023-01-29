/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_ejerc15_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 06/05/2022
 */
public class Serial1 {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p, leer;
        

        try {
            //Se crea el fichero
            fos = new FileOutputStream("C:\\Users\\1DAW16\\Documents\\NetBeansProjects\\PROG09_Ejerc15_1\\personas.dat");                                                 
            salida = new ObjectOutputStream(fos);
            //Se crea el primer objeto Persona
            p = new Persona("12345678A","Lucas González", 30);
   
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
   
            //Se crea el segundo objeto Persona
            p = new Persona("98765432B","Anacleto Jiménez", 28);
   
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
   
            //Se crea el tercer objeto Persona
            p = new Persona("78234212Z","María Zapata", 35);
   
            //Se escribe el objeto en el fichero
            salida.writeObject(p);

           //Capturaremos las posibles excepciones genericas
        } catch (FileNotFoundException e) {
                 System.out.println("1"+e.getMessage());                                                          
        } catch (IOException e) {
                 System.out.println("2"+e.getMessage());
                 
            //Para finalizar cerraremos los ficheros que hemos tocado.
            //Este bloque de código se ejecuta siempre.
        } finally {
            try {
                if(fos!=null){
                   fos.close();
                }
                if(salida!=null){
                   salida.close();
                }
            } catch (IOException e) {
                     System.out.println("3"+e.getMessage());
            }
        }

    }
}
