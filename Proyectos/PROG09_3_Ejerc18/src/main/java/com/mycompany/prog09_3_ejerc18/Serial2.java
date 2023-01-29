/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */
public class Serial2 {

    public static void main(String[] args) {

        //Para realizar este ejercicio he tenido problemas con las rutas y las clases por lo que he copiado ambos métodos
        //y los he ejecutado en este main.
        escribirFichero();
        leerFichero();

    }

    public static void leerFichero() {

        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona p;

        try {

            //En este caso vamos a leer un fichero ya existente por lo cual nos dirigiremos a la ruta donde se encuentra el 
            //fichero personas.dat (carpeta raiz) y mostraremos sus datos, hay que destacar que al haberlo hecho en otro ejercicio
            //tendremos que volver a meter datos en el fichero ya que la ruta del mismo no coincide con la anterior 
            //(com.mycompany.prog09_3_ejerc19)
            fis = new FileInputStream("personas.dat");
            entrada = new ObjectInputStream(fis);
            p = (Persona) entrada.readObject(); //es necesario el casting

            System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
            p = (Persona) entrada.readObject();
            System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
            p = (Persona) entrada.readObject();
            System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());

            //Se capturarán los posibles errores genéricos
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

            //Para finalizar se cerrarán los ficheros si se han tocado correctamente
        } catch (Exception e) {
            System.out.println("Error Generico");
            e.printStackTrace();
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
        Empleado emp;

        try {
            //Cargamos el fichero y le metemos la variable emp de tipo empleado con los atributos del mismo
            // cada vez que le metemos un empleado nuevo guardamos en el fichero personas.dat
            fos = new FileOutputStream("personas.dat");
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
