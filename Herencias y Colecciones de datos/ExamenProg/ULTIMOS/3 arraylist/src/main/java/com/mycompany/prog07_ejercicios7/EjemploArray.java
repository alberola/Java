/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog07_ejercicios7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 27/04/2022
 */
public class EjemploArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> lista = new ArrayList<>();
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
                    
                    //En este ejemplo al tratarse de un tipo List se pueden insertar valores repetidos.
                    
                    System.out.println("Procedemos a Insertar varios ejemplos.");
                    LocalDate hora = LocalDate.now();
                    
                    lista.add(new Vehiculo("Volskwagen", "1111AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418602R"));
                    lista.add(new Vehiculo("Volskwagen", "2222AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418601A"));
                    lista.add(new Vehiculo("Volskwagen", "1111AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418602R"));
                    lista.add(new Vehiculo("Volskwagen", "1111AAA", 45, hora, "Descripcion", 10, "Alejandro Alberola", "42418602R"));
                    Comparator<Vehiculo> c = new Comparator<>() {
                        @Override
                        public int compare(Vehiculo o1, Vehiculo o2) {
                            return o1.dniPropietario.compareTo(o2.dniPropietario);
                        }
                    };
                    lista.sort(c);
                    System.out.println(lista);
                    break;

                case 2:
                    System.out.println("Introduce un Dni para borrarlo.");
                    String dniPropietario = sc.nextLine();
                    lista.remove(new Vehiculo(dniPropietario));
                    System.out.println(lista);
                    break;

                case 3:
                    System.out.println("Ordenación por matrícula.");
                    System.out.println("Ya está ordenador por matrícula.");
                    System.out.println(lista);
                    Comparator<Vehiculo> e = new Comparator<>() {
                        @Override
                        public int compare(Vehiculo o1, Vehiculo o2) {
                            return o1.matricula.compareTo(o2.matricula);
                        }
                    };
                    lista.sort(e);
                    System.out.println(lista);
                    break;

                case 4:
                    System.out.println("Ordenación por Dni del Propietario.");
                    System.out.println("Ya está ordenado por Dni");
                    break;
            }
        } while (opcion != 5);
    }

}
