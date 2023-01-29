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
public class Libro extends Publicacion implements Prestable{
    private boolean prestado = false;

    public Libro(String isbn, String titulo, int anioPublicacion) {
        super(isbn, titulo, anioPublicacion);
    }
   
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean estado) {
        this.prestado = estado;
    }
    
    
    @Override
    public int presta(){
        /*No meter sout en métodos.(Hacerlo con retorno de enteros por ejemplo 0 -1 y luego un switch en el main).
            if( estado == true){
                System.out.println("No se puede prestar un libro que ya está prestado.");
            }
        */
            if (prestado == true){
                return -1;
            }   else{
                prestado = true;
                return 0;
            }
    }
    
    @Override
    public int devuelve(){
        /*No meter sout en métodos.(Hacerlo con retorno de enteros por ejemplo 0 -1 y luego un switch en el main).
            if(estado == false){
                System.out.println("Este libro no ha sido prestado por lo que no puede devolverse.");
            } else{
            } 
        */
        if (prestado == false){
            return -1;
        }   else{
            prestado = false;
            return 0;
        }

    }
    
    @Override
    public boolean estaPrestado(){
        return prestado == true;
    }

    @Override
    public String toString(){
        return "ISBN: " + isbn + " título: " + titulo + " año de publicacion: " + anioPublicacion +
                ((!prestado)?"(no prestado)":"(prestado)");
    }
    
    
}
