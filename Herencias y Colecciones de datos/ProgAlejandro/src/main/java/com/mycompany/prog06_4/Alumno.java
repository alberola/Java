/*
 * Clase Alumno la cual contendra los atributos de los mismos y crea un array de tipo Asignaturas el cual contendrá los
 * nombres de las asignaturas y los profesores, además de los métodos destinados a dicho array.
 */
package com.mycompany.prog06_4;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private double notaMedia;
    private String dni;
    private final int numMax = 10;
    private Asignaturas asignatura[] = new Asignaturas [numMax];
    
    //Constructores de la clase Alumno.  
    public Alumno(String nombre, String apellidos, double notaMedia, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notaMedia = notaMedia;
        this.dni = dni;
    }
    
    Alumno(){
        for ( int i = 0 ; i < asignatura.length ; i++){
            asignatura[i] = null;
        }
    }
    
    //Setters y Getters.
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Método para insertarAsignatura.
    public int insertarAsignatura(String nombreAsignatura, String nombreProfesor){
        if (buscarAsignatura(nombreAsignatura) != -1){
            return -2;
        }
        for ( int i = 0 ; i < asignatura.length ; i++){
            if ( asignatura[i] == null){
                asignatura[i] = new Asignaturas(nombreAsignatura, nombreProfesor);
                return 0;
            }
        }
        return -1;
    }
    
    //Método para buscar asignatura
    public int buscarAsignatura(String nombreAsignatura) {
        int posicion;
        for (int i = 0; i < asignatura.length; i++) {
            if (asignatura[i] != null && nombreAsignatura.equalsIgnoreCase(asignatura[i].getNombreAsignatura())) {
                posicion = i;
                return posicion; //Retornará la posición del array donde se ha encontrado la asignatura.
            }
        }
        return -1; // Si no se ha encontrado el alumno retornará -1.
    }
    
    //Método para borrar una asignatura.
    public int borrarAsignatura(String nombreAsignatura) {
        int posicion = buscarAsignatura(nombreAsignatura);
        if (buscarAsignatura(dni) != -1) {
            asignatura[posicion] = null;
            return posicion;
        }
        return -1;// Si no hay ninguna asignatura con es nombre (no existe) retornará -1.
    }
    
    public void mostrarDatosAsignaturas(int posicion) {
        System.out.println("La asignatura es: " + asignatura[posicion].getNombreAsignatura() +
                            "\nEl profesor es: " + asignatura[posicion].getNombreProfesor());
    }
    
    //Método listar Asignaturas insertadas teniendo en cuenta el dni del alumno.
    public void mostrarAsignaturaAlumno(String dni) {
        int posicion = buscarAsignatura(dni);
        mostrarDatosAsignaturas(posicion);
    }
    
    
}
