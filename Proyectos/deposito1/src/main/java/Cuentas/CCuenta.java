/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 22/03/2022
 */
public class CCuenta {

    //Atributos
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto vacio.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que pasa x parametros y los iguala a los atributos.
     * @param nom String que hace referencia al nombre.
     * @param cue String que hace referencia a la cuenta.
     * @param sal Double que hace referencia al saldo de la cuenta.
     * @param tipo Double que hace referencia al tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * @return estado
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * @param cantidad se ingresará la variable  cantidad al saldo de la cuenta.
     * @throws Exception No se puede ingresar cantidades negativas.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * 
     * @param cantidad  se retirará una cantidad que se pasa por parámetro.
     * @throws Exception No se puede retirar cantidad negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return nombre devuelve el nombre del dueño de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre setea el nombre al usuario de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve el numero de cuenta del cliente
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta setea el numero de cuenta a la cuenta del cliente.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * @return saldo devuelve el valor del saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo setea el saldo al valor introducido.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés devuelve el valor de tipo de interes.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés modifica el valor del tipoInterés (lo setea).
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}