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
public class Libro extends Publicacion{
    private String prestado;
    private String dni;

    public Libro(String prestado,String dni, String isbn, int anioPublicacion, String titulo) {
        super(isbn, anioPublicacion, titulo);
        this.prestado = prestado;
        this.dni = dni;
    }

    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
    
    @Override
    public String toString() {
        return  "Publicacion{" + "isbn=" + isbn + ", anioPublicacion=" + anioPublicacion + ", titulo=" + titulo + "\nTIPO = " +
                "Libro{" + "prestado=" + prestado + ", dni=" + dni + '}';
    }
    
    
}
