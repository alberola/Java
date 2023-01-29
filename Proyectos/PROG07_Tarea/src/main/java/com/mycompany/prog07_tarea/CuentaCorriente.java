/*
 * Clase hija de CuentaBancaria
 */
package com.mycompany.prog07_tarea;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 04/04/2022
 */
public class CuentaCorriente extends CuentaBancaria{
    protected String listaEntidades;

    public CuentaCorriente(String listaEntidades, String nombre, String apellidos, String dni, double saldo, String iban) {
        super(nombre, apellidos, dni, saldo, iban);
        this.listaEntidades = listaEntidades;
    }

    

    
   
}
