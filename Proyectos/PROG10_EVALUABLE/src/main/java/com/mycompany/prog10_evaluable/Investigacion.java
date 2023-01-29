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
public class Investigacion extends Revista{

    private String revisado;
    private String dniRevisor;

    public Investigacion(int numero, int mes, String tematica, String isbn, int anioPublicacion, String titulo) {
        super(numero, mes, tematica, isbn, anioPublicacion, titulo);
    }

    
    
    
    public Investigacion(String revisado, String dniRevisor, int numero, int mes, String tematica, String isbn, int anioPublicacion, String titulo) {
        super(numero, mes, tematica, isbn, anioPublicacion, titulo);
        this.revisado = revisado;
        this.dniRevisor = dniRevisor;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getDniRevisor() {
        return dniRevisor;
    }

    public void setDniRevisor(String dniRevisor) {
        this.dniRevisor = dniRevisor;
    }
   
    
    
    @Override
    public String toString() {
        return "Investigacion{" + '}';
    }
    
    
    
    
}
