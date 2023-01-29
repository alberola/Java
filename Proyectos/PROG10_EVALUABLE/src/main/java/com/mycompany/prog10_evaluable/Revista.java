/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog10_evaluable;

/**
 *
 * @author 1daw16
 */
public abstract class Revista extends Publicacion{
    protected int numero;
    protected int mes;
    protected String tematica;

    public Revista(int numero, int mes, String tematica, String isbn, int anioPublicacion, String titulo) {
        super(isbn, anioPublicacion, titulo);
        this.numero = numero;
        this.mes = mes;
        this.tematica = tematica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }  
    
}
