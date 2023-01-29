/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_examen_alejandro;

import java.util.Objects;

/**
 *
 * @author 1DAW16
 */
public class CuentaBancaria implements Comparable<CuentaBancaria> {


    private double saldo;
    private Persona titular;
    private String ccc; 



    //---------------------------------------------------------------        
    //             CONSTRUCTORES
    //---------------------------------------------------------------    
    public CuentaBancaria(String ccc){
        this.ccc = ccc;
    }

    //Constructor para insertar la coleccion LinkedHashSet.
    public CuentaBancaria(double saldo, String nombre, String apellidos, String dni, String ccc) {
        this.saldo = saldo;
        this.titular = new Persona(nombre,apellidos,dni);
        this.ccc = ccc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    @Override
    public String toString() {
        return "\nCuentaBancaria{" + "saldo=" + saldo + ", titular=" + titular + ", ccc=" + ccc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.ccc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaBancaria other = (CuentaBancaria) obj;
        if (!Objects.equals(this.ccc, other.ccc)) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public int compareTo(CuentaBancaria o) {
        return ccc.compareTo(o.ccc); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
