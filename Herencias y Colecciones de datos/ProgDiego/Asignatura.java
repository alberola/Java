/**
 * Clase Asignatura.
 */
package com.mycompany.prog06_4;

/**
 * @date 7 mar 2022
 * @author Diego Rodríguez Jacinto <drplaybasketball@gmail.com> 1DAW Número 26.
 * @version 1.0 Nombre de la Clase: Asignatura
 */
public class Asignatura {

    private String nombreAsig;
    private String profesor;

    public Asignatura(String nombreAsig, String profesor) {
        this.nombreAsig = nombreAsig;
        this.profesor = profesor;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

}
