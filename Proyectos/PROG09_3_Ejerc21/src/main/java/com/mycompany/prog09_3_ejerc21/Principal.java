/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc21;

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
public class Principal {


    public static void main(String[] args) {
        escribirFichero();
        //Como podemos ver al leer no se guarda el password (sale null).
        leerFichero();
        
    }
        
    
        //Metodo de prueba para ver si se escribió bien en el fichero (y si se guardan los atributos transcient)
    public static void escribirFichero() {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Cliente a;

        try {

            //Cargamos el fichero y le metemos la variable emp de tipo empleado con los atributos del mismo
            // cada vez que le metemos un alumno nuevo guardamos (writeObject(a)) en el fichero alumnos.dat
            fos = new FileOutputStream("clientes.dat");
            salida = new ObjectOutputStream(fos);
            //Creamos un nuevo cliente.
            a = new Cliente("Eduardo", "1234567");
            //Escribimos en el fichero
            salida.writeObject(a);
            a = new Cliente("Brian", "123brian123");
            salida.writeObject(a);
            a = new Cliente("Alejandro", "qwerty1234");
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
    
    public static void leerFichero(){
        
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Cliente a;


        //En este caso vamos a leer un fichero ya existente por lo cual nos dirigiremos a la ruta donde se encuentra el 
        //fichero Clientes.dat (carpeta raiz) y mostraremos sus datos, hay que destacar que al haberlo hecho en otro ejercicio
        //tendremos que volver a meter datos en el fichero ya que la ruta del mismo no coincide con la anterior.
        try {
            fis = new FileInputStream("clientes.dat");
            entrada = new ObjectInputStream(fis);
            a = (Cliente) entrada.readObject();
            System.out.println(a.getNombre()+ " " + a.getPassWord()) ;
            a = (Cliente) entrada.readObject();
            System.out.println(a.getNombre()+ " " + a.getPassWord()) ;
            a = (Cliente) entrada.readObject();
            System.out.println(a.getNombre()+ " " + a.getPassWord()) ;

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
    
}
