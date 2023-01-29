/**
 * Clase Alumno.
 */
package com.mycompany.prog06_4;

/**
 * @author Diego Rodríguez Jacinto <drplaybasketball17@gmail.com> 1DAW Nº26
 * @date 7 mar. 2022
 * @version 1.0
 */
public class Alumno {
//Variables.

    private String dni;
    private String grupo;
    private double notamedia;
    private String nombre;
    private String apellido;
    private static final int NUM_MAX_ASIGNATURAS = 10;//Máximo de asignaturas.
    private Asignatura asignaturas[] = null;
//Constructor.

    public Alumno(String dni, String apellido, String nombre, String grupo, double notamedia) {
        this.dni = dni;
        this.grupo = grupo;
        this.notamedia = notamedia;
        this.nombre = nombre;
        this.apellido = apellido;
        asignaturas = new Asignatura[NUM_MAX_ASIGNATURAS];
    }
//Getters y Setters.

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//Método insertar asignatura.

    public int insertarAsignatura(String nombreAsig, String profesor) {
        int posicion = -1;
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null && asignaturas[i].getNombreAsig().equalsIgnoreCase(nombreAsig)) {
                return -2;//repetido

            } else if (asignaturas[i] == null && posicion == -1) {

                posicion = i;
            }
        }
        if (posicion == -1) {
            return -1;//no espacios
        } else {
            asignaturas[posicion] = new Asignatura(nombreAsig, profesor);
            return 0;//todo ok
        }

    }
//Listar las asignaturas existentes.

    public void mostrarAsignaturas() {
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null) {
                System.out.println("El profesor es: " + asignaturas[i].getProfesor() + " , de la asignatura: " + asignaturas[i].getNombreAsig());
            }
        }

    }
//Borrar asignatura existente.

    public int borrarAsignatura(String nombreAsig) {
        int resultado = -1;
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null && asignaturas[i].getNombreAsig().equalsIgnoreCase(nombreAsig)) {
                asignaturas[i] = null;
                resultado = 0;
            }

        }
        return resultado;
    }
//Listar el objeto entero.

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", grupo=" + grupo + ", notamedia=" + notamedia + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
