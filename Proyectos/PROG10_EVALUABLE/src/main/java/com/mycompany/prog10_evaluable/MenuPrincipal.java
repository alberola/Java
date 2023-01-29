/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog10_evaluable;

import java.util.Scanner;

/**
 *
 * @author 1daw16
 */
public class MenuPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Publicacion publicacion;
        String isbn, titulo,prestado, dni, opcion,tematica,revisado,dniRevisor;
        Biblioteca biblioteca = new Biblioteca();
        int anioPublicacion,numero,mes;
        byte opt = 0;
        
        do{
            System.out.println("-------MENU DEL PROGRAMA-------");
            System.out.println("1.-insertar libros y una Investigaciónes (Solamente),");
            System.out.println("2.-borrar una por ISBN");
            System.out.println("3.-buscar una por ISBN ");
            System.out.println("4.-listarlas todas desde un Principal.");
            System.out.println("5.-Insertar 10 de forma automatizada y mostrarlos.");
            System.out.println("6.-Guardar Publicaciones en fichero TXT");
            System.out.println("7.-Imprimir ordenado por año.");
            System.out.println("8.-Imprimir ordenado por Isbn.");
            System.out.println("9.-Busqueda con Binnary Search.");
            System.out.println("10.-Salir.");
            opt = sc.nextByte();
            sc.nextLine();
            
            switch(opt){
                case 1:
                    System.out.println("Inserte el Isbn del libro:");
                    isbn = sc.nextLine();
                    System.out.println("Inserte el año de publicacion.");
                    anioPublicacion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Inserte el titulo.");
                    titulo = sc.nextLine();
                    System.out.println("¿Que desea insertar un libro o una investigacion?");
                    opcion = sc.nextLine();
                    if(opcion.equalsIgnoreCase("Libro")){
                        System.out.println("De acuerdo, para insertar un libro tiene que decir si esta prestado");
                        prestado = sc.nextLine();
                        System.out.println("Inserte el Dni del autor");
                        dni = sc.nextLine();
                        while(!Validacion.validarDni(dni)){
                            System.out.println("DNI INVALIDO INTRODUZCALO DE NUEVO.");
                            dni = sc.nextLine();
                        }
                        publicacion = new Libro(prestado,dni,isbn,anioPublicacion,titulo);
                        if (biblioteca.insertarPublicacion(publicacion) == true){
                            System.out.println("Introducido correctamente.");
                        }
                    } else{
                        System.out.println("De acuerdo, ha elegido una investigacion");
                        System.out.println("Introduzca el numero de la investigacion");
                        numero = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ahora introduzca el mes.");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce la tematica.");
                        tematica = sc.nextLine();
                        System.out.println("Introduce si está revisado.");
                        revisado = sc.nextLine();
                        System.out.println("Introduce el Dni del revisor.");
                        dniRevisor = sc.nextLine();
                        publicacion = new Investigacion(revisado,dniRevisor,numero,mes,tematica,isbn,anioPublicacion,titulo);
                        biblioteca.insertarPublicacion(publicacion);
                    }
                break;
                case 2:
                        System.out.println("Introduzca el Isbn de la publicacion que desea Borrar.");
                        String isbnBuscar = sc.nextLine();
                        if (biblioteca.borrarIsbn(isbnBuscar) == true){
                            System.out.println("Publicacion borrada con exito.");
                        } else{
                            System.out.println("No se ha podido borrar la publicacion.");
                        }
                    break;
                case 3:
                    System.out.println("Introduzca el isbn para imprimir la publicacion que desea.");
                        String isbnBuscarListar = sc.nextLine();
                        biblioteca.buscarIsbn(isbnBuscarListar);
                    break;
                    
                case 4:
                    System.out.println("-------Listado de Publicaciones-------\n");
                    biblioteca.listarCuentas();
                    break;
                case 5:
                    System.out.println("Insertando Publicaciones.");
                    biblioteca.insertarEjemplos();
                    if (!biblioteca.getBiblioteca().isEmpty()){
                        System.out.println("Publicaciones insertadas correctamente.");
                    } else {
                        System.out.println("No se han podido insertar las publicaciones.");
                    }
                    break;
                case 6:
                    System.out.println("---GUARDANDO FICHERO EN TXT---");
                    biblioteca.guardarFicheroTxt();
                    System.out.println("------------------------------");
                    System.out.println("Datos almacenados.");
                    break;
                case 7:
                    System.out.println("--------LISTA ORDENADA POR AÑO--------");
                    biblioteca.ordenarAnio();
                    break;
                case 8:
                    System.out.println("--------LISTA ORDENADA POR ISBN--------");
                    biblioteca.ordenarIsbn();
                    break;
                case 9:
                    System.out.println("Introduce el ISBN que desea buscar.");
                    String isbnBinnary = sc.nextLine();
                    System.out.println("Metodo en mantenimiento siguiendo formato.");
                    break;                
            }
            
        } while (opt !=10);
    }
    
}
