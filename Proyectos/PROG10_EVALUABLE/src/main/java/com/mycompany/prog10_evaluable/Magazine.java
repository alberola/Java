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
public class Magazine extends Revista{
    private int semana;

    public Magazine(int semana, int numero, int mes, String tematica, String isbn, int anioPublicacion, String titulo) {
        super(numero, mes, tematica, isbn, anioPublicacion, titulo);
        this.semana = semana;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }
    
    
    
    
    
}
