/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_examen_alejandro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Alejandro Alberola Gopar
 * @Version 1.0
 * @Since 29/04/2022
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        Set<CuentaBancaria> cuentas = new LinkedHashSet<>();
        do {
            System.out.println("Seleccionar una opción:");
            System.out.println("[1] Abrir una nueva cuenta.");
            System.out.println("[2] Ver un listado de las cuentas disponibles.");
            System.out.println("[3] Eliminar una cuenta.");
            System.out.println("[4] Listar por saldo menor a mayor.");
            System.out.println("[5] Listar por saldo mayor a menor.");
            System.out.println("[6] Agregar 5 y comprobar.");
            System.out.println("[7] Ordenar por Nif.");
            System.out.println("[0] Salir.");
            opcion = sc.nextByte();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Vamos a abrir una nueva Cuenta bancaria.");
                    System.out.println("En primer lugar introduce el saldo.");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Introduce el nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce los apellidos:");
                    String apellidos = sc.nextLine();
                    System.out.println("Introduce su DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Introduce su CCC:");
                    String ccc = sc.nextLine();
                    //Por defecto al insertar las cuentas, estas se agregarán por ccc.
                    boolean resultado = cuentas.add(new CuentaBancaria(saldo, nombre, apellidos, dni, ccc));
                    if (resultado == true) {
                        System.out.println("Cuenta agregada correctamente.");
                    } else {
                        System.out.println("No se ha podido insertar la cuenta.");
                    }

                    break;
                case 2:
                    //Al listar hay que tener en cuenta que es una LinkeHashSet por lo que se mostrará en orden de insercción.
                    System.out.println("------Listado de Cuentas------");
                    System.out.println(cuentas);
                    break;

                case 3:
                    //Previamente hemos creado un constructor que recibe un ccc para borrarlo.
                    System.out.println("Introduce un CCC para borrar.");
                    String cccBorrar = sc.nextLine();
                    if (cuentas.remove(new CuentaBancaria(cccBorrar))) {
                        System.out.println("Se ha borrado correctamente.");
                    } else {
                        System.out.println("No se ha podido borrar.");
                    }
                    break;

                case 4:
                    //Creamos una lista de tipo ArrayList a la cual le pasaremos los datos de la anterior y con 
                    //Comparator creamos un comparador donde hacemos un override del método compare a nuestra necesidad.
                    System.out.println("Ordenación por saldo de menor a mayor.");
                    List<CuentaBancaria> listaOrdenada = new ArrayList<>(cuentas);
                    Comparator<CuentaBancaria> comparadorSaldo = new Comparator<>() {
                        @Override
                        public int compare(CuentaBancaria o1, CuentaBancaria o2) {
                            return o1.getCcc().compareTo(o2.getCcc()); //To change body of generated methods, choose Tools | Templates.
                        }
                    };
                    //Con el .sort colocamos la lista a nuestra manera.
                    listaOrdenada.sort(comparadorSaldo);
                    //Imprimimos para ver los resultados.
                    System.out.println(listaOrdenada);
                    break;

                case 5:
                    //Creamos una lista de tipo ArrayList a la cual le pasaremos los datos de la anterior y con 
                    //Comparator creamos un comparador donde hacemos un override del método compare a nuestra necesidad.
                    System.out.println("Ordenación por saldo de mayor a menor.");
                    List<CuentaBancaria> listaOrdenadaMayor = new ArrayList<>(cuentas);
                    Comparator<CuentaBancaria> comparadorSaldoMayor = new Comparator<>() {
                        @Override
                        public int compare(CuentaBancaria o1, CuentaBancaria o2) {
                            return o2.getCcc().compareTo(o1.getCcc()); //To change body of generated methods, choose Tools | Templates.
                        }
                    };
                    //Con el .sort colocamos la lista a nuestra manera.
                    listaOrdenadaMayor.sort(comparadorSaldoMayor);
                    //Imprimimos
                    System.out.println(listaOrdenadaMayor);
                    break;
                case 6:
                    //Metemos 5 cuentas a mano, 2 de ellas repetidas y luego las mostramos por pantalla
                    // y efectivamente vemos las que insertamos y que el tamaño de la lista es 3.
                    Set<CuentaBancaria> cuentasEjemplo = new LinkedHashSet<>();
                    cuentasEjemplo.add(new CuentaBancaria(10, "Alejandro", "Alberola", "42418602R", "ES1111"));
                    cuentasEjemplo.add(new CuentaBancaria(10, "Alejandro", "Alberola", "42418602R", "ES2222"));
                    cuentasEjemplo.add(new CuentaBancaria(10, "Alejandro", "Alberola", "42418602R", "ES3333"));
                    cuentasEjemplo.add(new CuentaBancaria(10, "Alejandro", "Alberola", "42418602R", "ES1111"));
                    cuentasEjemplo.add(new CuentaBancaria(10, "Alejandro", "Alberola", "42418602R", "ES1111"));
                    System.out.println("Se han insertado 3 cuentas que son:\n"+cuentasEjemplo);
                    System.out.println("Efectivamente el tamaño del array es = "+cuentasEjemplo.size());
                    break;
                case 7:
                    //Creamos una lista de tipo ArrayList a la cual le pasaremos los datos de la anterior y con 
                    //Comparator creamos un comparador donde hacemos un override del método compare a nuestra necesidad.
                    System.out.println("Ordenación por lista por Nif.");
                    List<CuentaBancaria> listaOrdenadaNif = new ArrayList<>(cuentas);
                    Comparator<CuentaBancaria> comparadorNif = new Comparator<>() {
                        @Override
                        public int compare(CuentaBancaria o1, CuentaBancaria o2) {
                            return (o1.getTitular().getDni()).compareTo((o2.getTitular().getDni())); //To change body of generated methods, choose Tools | Templates.
                        }
                    };
                    //Con el .sort colocamos la lista a nuestra manera.
                    listaOrdenadaNif.sort(comparadorNif);
                    //Imprimimos.
                    System.out.println(listaOrdenadaNif);
                    break;
            }

        } while (opcion != 0);
    }
}
