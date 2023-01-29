/**
 * Clase Aula.(clase: nombre usado en el enunciado del ejercicio.)
 */
package com.mycompany.prog06_4;

/**
 * @author Diego Rodríguez Jacinto <drplaybasketball17@gmail.com> 1DAW Nº26
 * @date 7 mar. 2022
 * @version 1.0
 */
public class Aula {
//Variables.

    private Alumno[] alumnos;
    private int numAlumnos;
    private static final int MAX_ALUMNOS = 5;
//Constrcutores.

    public Aula(Alumno[] alumno, int numAlumnos) {
        this.alumnos = alumno;
        this.numAlumnos = numAlumnos;
    }

    public Aula() {
        this.numAlumnos = 0;
        this.alumnos = new Alumno[MAX_ALUMNOS];//Array de 50 alumnos.
    }
//Getters y Setters.

    public Alumno[] getAlumno() {
        return alumnos;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumnos = alumno;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
//Métodos propios.
    //Buscar alumno.

    public Alumno buscarAlumno(String dni) {

        for (int i = 0; i < numAlumnos; i++) {

            if (alumnos[i].getDni().equals(dni)) {
                return alumnos[i];
            }
        }
        return null;
    }
//Buscar alumno por la posición.

    public int buscarAlumnoPosicion(String dni) {
        int posicion = -1;
        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i] != null && alumnos[i].getDni().equalsIgnoreCase(dni)) {
                posicion = i;//Devuelve la posicion.
            }
        }
        return posicion;//Devuelve esto, si no encuentra.RETORNA -1, no encuentra ningun alumno dentro del array.
    }
//Insertar alumno con todas las variables por parámetro.

    public int insertarAlumno(String dni, String grupo, String nombre, String apellido, double notamedia) {
        int posicion = -3;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                posicion = i;

            } else if (alumnos[i] != null && alumnos[i].getDni().equalsIgnoreCase(dni)) {
                return -2;
            }
        }
        if (posicion == -3) {
            return -1;
        } else {
            alumnos[posicion] = new Alumno(dni, apellido, grupo, nombre, notamedia);
            return -3;//al retornar -3 se inserta el alumno.
        }

    }
//Borrar alumno.

    public void borrarAlumno(String dni) {
        int posicion = buscarAlumnoPosicion(dni);
        alumnos[posicion] = null;
        if (alumnos[posicion] == null) {
            System.out.println("Este dni no corresponde a ningun alumno.");
        }
    }
//Mostrar alumnos insertados.

    public void listarTodosAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                listarTodosDatos(i);
            }
        }
    }
//Método para recoger los datos del alumno y usarlo en listar alumnos.

    public void listarTodosDatos(int posicion) {
        if(posicion != -1){
        System.out.println("Nombre del Alumno: " + alumnos[posicion].getNombre());
        System.out.println("Apellido del Alumno: " + alumnos[posicion].getApellido());
        System.out.println("Dni del Alumno: " + alumnos[posicion].getDni());
        System.out.println("Grupo del Alumno: " + alumnos[posicion].getGrupo());
        System.out.println("Nota media del Alumno: " + alumnos[posicion].getNotamedia());
        mostrarAsignaturas(posicion);
        }else{
            System.out.println("No se ha introducido ningún alumno todavía.");
        }
    }
//Método listar alumnos insertados, con el dni.

    public void mostrarAlumno(String dni) {
        int posicion = buscarAlumnoPosicion(dni);
        listarTodosDatos(posicion);
    }
//Método insertar asignatura.

    public int insertarAsignatura(String dni, String nombreAsig, String profesor) {
        int posicionAlumno = buscarAlumnoPosicion(dni);
        int resultado = alumnos[posicionAlumno].insertarAsignatura(nombreAsig, profesor);
        return resultado;
    }
//Listar asignaturas ya insertadas.    

    public void mostrarAsignaturas(int posicion) {
        alumnos[posicion].mostrarAsignaturas();
    }
//Borrar asignatura ya insertada.   

    public int borrarAsignatura(String dni, String nombreAsig) {
        int posicion = buscarAlumnoPosicion(dni);
        int resultado = alumnos[posicion].borrarAsignatura(nombreAsig);
        return resultado;
    }

}
