/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc21;

import java.io.Serializable;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */

public class Cliente implements Serializable{   
    
    //Atributos
    
    private String nombre;
    private transient String passWord;
     
    //Constructores
     
    public Cliente(String nombre, String passWord) {                                                             
              this.nombre=nombre;
              this.passWord= passWord;
     }
     
    //Getters / Setters 
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
     
     
}
