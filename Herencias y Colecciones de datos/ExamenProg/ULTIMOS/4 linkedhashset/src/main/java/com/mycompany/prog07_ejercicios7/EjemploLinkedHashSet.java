/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog07_ejercicios7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 27/04/2022
 */
public class EjemploLinkedHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Vehiculo> lista = new LinkedHashSet<>();
        byte opcion;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1.-Insertar.");
            System.out.println("2.-Borrar.");
            System.out.println("3.-Ordenar por matrícula.");
            System.out.println("4.-Ordenar por NIF.");
            System.out.println("5.-Salir.");
            opcion = sc.nextByte();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    //Al ser de tipo set no se podran insertar valores iguales en este caso los dnis y se insertarán por fecha de entrada.
                    System.out.println("Procedemos a Insertar varios ejemplos.");
                    LocalDate hora = LocalDate.now();
                    lista.add(new Vehiculo("Volskwagen", "1111AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418602R"));
                    lista.add(new Vehiculo("Volskwagen", "2222AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418601A"));                   
                    //Creo dos variables para ver que efecticamente no se han podido insertar ya que imprimen false.
                    boolean resultado = lista.add(new Vehiculo("Volskwagen", "1111AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418602R"));
                    System.out.println(resultado);
                    boolean resultado2 = lista.add(new Vehiculo("Volskwagen", "1111AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418602R"));
                    System.out.println(resultado2);
                    System.out.println(lista);
                    break;

                case 2:
                    System.out.println("Introduce una Matricula para borrar.");
                    String matricula = sc.nextLine();
                    if(lista.remove(new Vehiculo(matricula))){
                        System.out.println("Ha salido bien.");
                    } else{
                        System.out.println("Ha salido mal.");
                    }
                    System.out.println(lista);
                    break;

                case 3:
                    System.out.println("Ordenación por matrícula.");
                    List<Vehiculo> listaMatricula = new ArrayList<>(lista);
                    Comparator<Vehiculo> m = new Comparator<>(){
                        @Override
                        public int compare(Vehiculo o1, Vehiculo o2){
                            return o1.matricula.compareTo(o2.matricula);
                        }
                    };
                    listaMatricula.sort(m);
                    System.out.println(lista);
                    System.out.println(listaMatricula);
                    break;

                case 4:
                    System.out.println("Ordenación por Nif.");
                    List<Vehiculo> listaNif = new ArrayList<>(lista);
                    Comparator<Vehiculo> c = new Comparator<>() {
                        @Override
                        public int compare(Vehiculo o1, Vehiculo o2) {
                            return o1.dniPropietario.compareTo(o2.dniPropietario); //To change body of generated methods, choose Tools | Templates.
                        }
                    };
                    listaNif.sort(c);
                    System.out.println(lista);
                    System.out.println(listaNif);
                    break;
            }
        } while (opcion != 5);
    }

}
