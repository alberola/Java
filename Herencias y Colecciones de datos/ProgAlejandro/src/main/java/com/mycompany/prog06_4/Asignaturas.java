/*
 * Clase asignaturas la cual unicamente contendrá los atributos de las mismas, así como los setter/getters.
 */
package com.mycompany.prog06_4;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Asignaturas {
    private String nombreProfesor;
    private String nombreAsignatura;

    public Asignaturas(String nombreProfesor, String nombreAsignatura) {
        this.nombreProfesor = nombreProfesor;
        this.nombreAsignatura = nombreAsignatura;
    }
      

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nomrbeAsignatura) {
        this.nombreAsignatura = nomrbeAsignatura;
    }
    
}
