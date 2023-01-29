/*
 * Clase principal del programa la cual hará la llamda a los métodos 
 */
package com.mycompany.prog07_tarea;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 04/04/2022
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, dni, iban, tipoCuenta, listaEntidades;
        double saldo;
        byte seleccion;
        Banco cuenta = new Banco();
        do {
            System.out.println("1.-Abrir una nueva cuenta.");
            System.out.println("2.-Ver un listado de las cuentas disponibles.");
            System.out.println("3.-Obtener los datos de una cuenta concreta.");
            System.out.println("4.-Realizar un ingreso en una cuenta. (Solo hay que implementar una u otra, ingreso o retirada)");
            System.out.println("5.-Salir de la aplicación.");
            seleccion = sc.nextByte();

            switch (seleccion) {
                case 1:
                    System.out.println("Introduce el nombre del titular de la cuenta.");
                    nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduce los apellidos del titular.");
                    apellidos = sc.nextLine();
                    System.out.println("Introduce el dni del titular.");
                    dni = sc.nextLine();
                    System.out.println("Introduce el saldo de la cuenta a crear.");
                    saldo = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Introduce el Iban de la cuenta.");
                    iban = sc.nextLine();
                    while (!Validaciones.validarIban(iban)) {
                        System.out.println("Iban incorrecto vuelva a introducirlo:");
                        iban = sc.nextLine();
                    }
                    boolean valido;
                    do {
                        System.out.println("Ahora introduzca el tipo de cuenta que quiera crear (Ahorro o Corriente).");
                        tipoCuenta = sc.nextLine();
                        if (tipoCuenta.equalsIgnoreCase("Ahorro")) {
                            System.out.println("Ha elegido una cuenta de ahorro.");
                            System.out.println("Introduzca el tipo de interés.");
                            double tipoInteres = sc.nextDouble();
                            sc.nextLine();
                            valido = true;
                            CuentaBancaria cuentaAhorro = new CuentaAhorro(tipoInteres, nombre, apellidos, dni, saldo, iban);
                            boolean resultado = cuenta.addCuenta(cuentaAhorro);
                            if (resultado == true) {
                                System.out.println("Se ha introducido correctamente.");
                            } else {
                                System.out.println("No se ha podido introducir la cuenta.");
                            }

                        } else if (tipoCuenta.equalsIgnoreCase("Corriente")) {
                            System.out.println("Ha elegido una cuenta corriente.");
                            System.out.println("Introduzca la lista de entidades.");
                            listaEntidades = sc.nextLine();
                            System.out.println("Ahora introduzca la comision de mantenimiento. ");
                            double comisionMantenimiento = sc.nextDouble();
                            sc.nextLine();
                            valido = true;
                            CuentaBancaria cuentaCorriente = new CuentaCorrientePersonal(comisionMantenimiento, listaEntidades, nombre, apellidos, dni, saldo, iban);
                            boolean resultado = cuenta.addCuenta(cuentaCorriente);
                            if (resultado == true) {
                                System.out.println("Se ha introducido correctamente.");
                            } else {
                                System.out.println("No se ha podido introducir la cuenta.");
                            }
                        } else {
                            System.out.println("Error al iniciar.");
                            valido = false;
                        }
                    } while (!valido);

                    break;
                case 2:
                    System.out.println(cuenta.listarCuentas());

                    break;

                case 3:

                    System.out.println("Usted ha decidido obtener los datos de una cuenta: ");
                    System.out.println("Introduzca el iban de la cuenta:");
                    String ibanListar = sc.nextLine();
                    sc.nextLine();
                    System.out.println(cuenta.listarCuenta(ibanListar));

                    break;

                case 4:

                    System.out.println("Usted ha decidido ingresar dinero:");
                    System.out.println("Introduzca el iban de la cuenta:");
                    String ibanIngresar = sc.nextLine();
                    System.out.println("Ahora introduce la cantidad a ingresar.");
                    double saldoIngresar = sc.nextDouble();
                    sc.nextLine();
                    boolean result = cuenta.ingresarDinero(ibanIngresar, saldoIngresar);
                    if (result == true) {
                        System.out.println("Se ha introducido correctamente el saldo.");
                    } else {
                        System.out.println("No se ha podido introducir el saldo.");
                    }
                    
                    break;

            }

        } while (seleccion != 5);
    }

}
