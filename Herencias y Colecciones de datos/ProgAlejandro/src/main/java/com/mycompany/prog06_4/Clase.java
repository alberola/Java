/*
 * Clase llamada clase donde se creará un array de tipo alumno y tendremos los constructores para inicializar el aray a null
 * y los métodos que se nos piden.
 */
package com.mycompany.prog06_4;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Clase {

    private final int numMax = 50;
    private Alumno alumno[] = new Alumno[numMax];

    Clase() {
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = null;
        }
    }

    //Método para insertar un Alumno.
    public int insertarAlumno(String nombre, String apellidos, double notaMedia, String dni) {
        if (buscarAlumno(dni) != -1) {
            return -2; //Retorna -2 si ya hay un alumno con el dni (el alumno ya existe).
        }
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i] == null) {
                alumno[i] = new Alumno(nombre, apellidos, notaMedia, dni);
                return 0; //Retorna 0 si se guarda.
            }
        }
        return -1;//Si no se cumplen las anteriores retornará un -1 es decir el array está lleno.
    }

    //Método para buscar alumno dentro del array.
    public int buscarAlumno(String dni) {
        int posicion;
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i] != null && dni.equals(alumno[i].getDni())) {
                posicion = i;
                return posicion; //Retornará la posición del array donde se ha encontrado el alumno.
            }
        }
        return -1; // Si no se ha encontrado el alumno retornará -1.
    }

    //Método para borrar un alumno.
    public int borrarAlumnos(String dni) {
        int posicion = buscarAlumno(dni);
        if (buscarAlumno(dni) != -1) {
            alumno[posicion] = null;
            return posicion;
        }
        return -1;// Si no hay ningún alumno con el dni (no existe) retornará -1.
    }
    
    //Método para imprimir todos los datos de los alumnos.
    public void listarAlumnos() {
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i] != null) {
                listarDatos(i);
            }
        }
    }

    //Método para recoger los datos del alumno y usarlo en listar alumnos.
    public void listarDatos(int posicion) {
        if (posicion != -1) {
            System.out.println("Alumno "+posicion+".");
            System.out.println("Nombre del Alumno: " + alumno[posicion].getNombre());
            System.out.println("Apellido del Alumno: " + alumno[posicion].getApellidos());
            System.out.println("Dni del Alumno: " + alumno[posicion].getDni());
            System.out.println("Nota media del Alumno: " + alumno[posicion].getNotaMedia());           
            System.out.println();

        } else {
            System.out.println("No se ha introducido ningún alumno con ese DNI.");
        }
    }

    //Método listar alumnos insertados, con el dni.
    public void mostrarAlumno(String dni) {
        int posicion = buscarAlumno(dni);
        listarDatos(posicion);
    }
}
