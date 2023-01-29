/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc18;

import java.io.Serializable;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */
public class Persona implements Serializable{
    
    //Atributos
    
    private String nif;
    private String nombre;
    private int edad;
    
    //Constructores
    
    public Persona() {
    }

    public Persona(String nif, String nombre, int edad) {                                                         
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getters / Setters
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
