/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import persona.*;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */
public class Serial6 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Alumno a;

        escribirFichero();

        //En este caso vamos a leer un fichero ya existente por lo cual nos dirigiremos a la ruta donde se encuentra el 
        //fichero alumnos.dat (carpeta raiz) y mostraremos sus datos, hay que destacar que al haberlo hecho en otro ejercicio
        //tendremos que volver a meter datos en el fichero ya que la ruta del mismo no coincide con la anterior.
        try {
            fis = new FileInputStream("alumnos.dat");
            entrada = new ObjectInputStream(fis);
            a = (Alumno) entrada.readObject();
            System.out.println(a.getNif() + " " + a.getNombre() + " " + a.getEdad()
                    + " " + a.getFechaMatricula().getDia() + "-"
                    + a.getFechaMatricula().getMes() + "-"
                    + a.getFechaMatricula().getAño());
            a = (Alumno) entrada.readObject();
            System.out.println(a.getNif() + " " + a.getNombre() + " " + a.getEdad()
                    + " " + a.getFechaMatricula().getDia() + "-"
                    + a.getFechaMatricula().getMes() + "-"
                    + a.getFechaMatricula().getAño());
            a = (Alumno) entrada.readObject();
            System.out.println(a.getNif() + " " + a.getNombre() + " " + a.getEdad()
                    + " " + a.getFechaMatricula().getDia() + "-"
                    + a.getFechaMatricula().getMes() + "-"
                    + a.getFechaMatricula().getAño());

            //Se capturarán los posibles errores genéricos
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

            //Para finalizar se cerrarán los ficheros si se han tocado(Modificado) correctamente
            //Este bloque de código siempre se ejecutará.
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void escribirFichero() {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;

        try {

            //Cargamos el fichero y le metemos la variable emp de tipo empleado con los atributos del mismo
            // cada vez que le metemos un alumno nuevo guardamos (writeObject(a)) en el fichero alumnos.dat
            fos = new FileOutputStream("alumnos.dat");
            salida = new ObjectOutputStream(fos);
            //Creamos una fecha pasandole el formato correspondiente
            f = new Fecha(5, 9, 2011);
            a = new Alumno("12345678A", "Lucas González", 20, f);
            salida.writeObject(a);
            f = new Fecha(7, 9, 2011);
            a = new Alumno("98765432B", "Anacleto Jiménez", 19, f);
            salida.writeObject(a);
            f = new Fecha(8, 9, 2011);
            a = new Alumno("78234212Z", "María Zapata", 21, f);
            salida.writeObject(a);

            //Captamos los posibles errores genéricos
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

            //Bloque de codigo que siempre se ejecutara cuya funcionalidad es cerrar los archivos.
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
