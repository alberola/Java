/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog07_ejerc4;

/**
 *
 * @author 1daw16
 */
public class Revista extends Publicacion {
    private int numeroRevista;

    public Revista(String isbn, String titulo, int anioPublicacion, int numeroRevista) {
        super(isbn, titulo, anioPublicacion);
        this.numeroRevista = numeroRevista;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }
    
    
    
    
    
    
}
