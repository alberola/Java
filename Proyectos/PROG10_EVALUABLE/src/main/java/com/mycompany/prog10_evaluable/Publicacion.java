/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog10_evaluable;

import java.util.Objects;

/**
 *
 * @author 1daw16
 */
public abstract class Publicacion implements Comparable<Publicacion>{
    protected String isbn;
    protected int anioPublicacion;
    protected String titulo;

    public Publicacion(String isbn, int anioPublicacion, String titulo) {
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
    }
    
    //Constructor para Borrar o listar por isbn.
    public Publicacion(String isbn) {
        this.isbn = isbn;
    }   
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        return "Publicacion{" + "isbn=" + isbn + ", anioPublicacion=" + anioPublicacion + ", titulo=" + titulo + '}';
    }

    @Override
    public int compareTo(Publicacion o) {
        return o.getIsbn().compareTo(isbn);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.isbn);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }
    
    
   
    
    
    
    
}
