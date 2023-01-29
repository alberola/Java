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
public abstract class Publicacion {
    protected String titulo, isbn;
    protected int anioPublicacion;

    public Publicacion(String isbn, String titulo, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
      
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String toString(){
        return "ISBN: "+ isbn + " título: " + titulo + " año de publicacion: " + anioPublicacion;
    }
}
