/*
 * Clase abstracta CuentaBancaria (padre).
 */
package com.mycompany.prog07_tarea;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 04/04/2022
 */
public abstract class CuentaBancaria implements Imprimible{
    
    //Atributos
    protected Persona titular;
    protected double saldo;
    protected String iban;

    //Constructor

    public CuentaBancaria(String nombre, String apellidos, String dni,double saldo, String iban) {
        this.titular = new Persona(nombre,apellidos,dni);
        this.saldo = saldo;
        this.iban = iban;
    }
    
    
    //Getters y Setters
    
    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    
    //Método toString que se editara en las clases correspondientes.
    @Override
    public String devolverInfoString(){
        return "Titular: " + titular +"\nCódigo Cuenta: " + iban + "\nSaldo: " + saldo;
    }
    
}
