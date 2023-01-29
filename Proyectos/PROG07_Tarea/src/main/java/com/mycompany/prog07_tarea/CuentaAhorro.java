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
public class CuentaAhorro extends CuentaBancaria{
    private double tipoInteres;
    
    //Constructor.
    
    public CuentaAhorro(double tipoInteres, String nombre, String apellidos, String dni, double saldo, String iban) {
        super(nombre, apellidos, dni, saldo, iban);
        this.tipoInteres = tipoInteres;
    }   
    
    //Getter y Setters
    
    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    
    
}
