/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc02;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 22/04/2022
 */
public class Socio implements Comparable<Socio>{
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }
    public Socio(String dni){
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public boolean equals(Socio a){
        return dni.equals(a.dni);
    }
    
    int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    
    @Override
    public String toString(){
        return "------Socio------\n"+"DNI = "+dni+"\nNombre = "+nombre+"\nFechAlta = "+fechaAlta
                +"\nAntiguedad = "+ antiguedad()+"\n";
    }

    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }
    
    
}
