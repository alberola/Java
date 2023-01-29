/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */

public class Serial5 {

    public static void main(String[] args) {                                                                      
 
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
  
        try {
            
            //Cargamos el fichero y le metemos la variable emp de tipo empleado con los atributos del mismo
            // cada vez que le metemos un alumno nuevo guardamos (writeObject(a)) en el fichero alumnos.dat
            
            fos = new FileOutputStream("C:\\Users\\1DAW16\\Documents\\NetBeansProjects\\PROG09_3_Ejerc17\\alumnos.dat");
            salida = new ObjectOutputStream(fos);
            //Creamos una fecha pasandole el formato correspondiente
            f = new Fecha(5,9,2011);
            a = new Alumno("12345678A","Lucas González", 20, f);
            salida.writeObject(a);
            f = new Fecha(7,9,2011);
            a = new Alumno("98765432B","Anacleto Jiménez", 19, f);                                                
            salida.writeObject(a);
            f = new Fecha(8,9,2011);
            a = new Alumno("78234212Z","María Zapata", 21, f);
            salida.writeObject(a);
           
            //Captamos los posibles errores genéricos
            
        } catch (FileNotFoundException e) {
                 System.out.println(e.getMessage());
        } catch (IOException e) {
                 System.out.println(e.getMessage());
                 
            //Bloque de codigo que siempre se ejecutara cuya funcionalidad es cerrar los archivos.
            
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                     System.out.println(e.getMessage());                                                          
            }
        }
    }
}