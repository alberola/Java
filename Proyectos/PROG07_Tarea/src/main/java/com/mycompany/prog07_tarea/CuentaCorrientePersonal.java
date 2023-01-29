/*
 * Clase hija de CuentaCorriente
 */
package com.mycompany.prog07_tarea;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 04/04/2022
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    private double comisionMantenimiento;
    
    
    //Constructor
    public CuentaCorrientePersonal(double comisionMantenimiento, String listaEntidades, String nombre, String apellidos, String dni, double saldo, String iban) {
        super(listaEntidades, nombre, apellidos, dni, saldo, iban);
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    //Getters y Setters
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    
    
}
