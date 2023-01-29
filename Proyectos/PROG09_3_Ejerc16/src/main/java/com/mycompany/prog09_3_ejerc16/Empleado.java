/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc16;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */
public class Empleado extends Persona{
    
    //Clase empleado la cual hereda de Persona 
       
    //Atributo/s en este caso solo hay uno
    private double sueldo;
    
    //Constructores
    public Empleado(String nif, String nombre, int edad, double sueldo) {                                         
        super(nif, nombre, edad);
        this.sueldo = sueldo;
    }

    public Empleado() {
    }
    
    //Getter
    public double getSueldo() {
        return sueldo;
    }
    
    //Setter
    public void setSueldo(double sueldo) {                                                                        
        this.sueldo = sueldo;
    }
}