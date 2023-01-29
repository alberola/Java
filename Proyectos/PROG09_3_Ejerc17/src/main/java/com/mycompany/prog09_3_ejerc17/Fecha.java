/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog09_3_ejerc17;

import java.io.Serializable;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */

public class Fecha implements Serializable{
    
    //Atributos
    
    private int dia;
    private int mes;
    private int año;

    //Constructores
        
    public Fecha(int dia, int mes, int año) {                                                                     
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public Fecha() {
    }
    
    //Getters / Setters
            
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {                                                                                 
        this.mes = mes;
    }
   
}
