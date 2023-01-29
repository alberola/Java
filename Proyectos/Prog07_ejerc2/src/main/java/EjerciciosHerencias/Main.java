/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosHerencias;


/**
 *
 * @author 1daw16
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("\tPERSONA");
        System.out.println("Nombre : " + persona.getNombre());
        System.out.println("Apellido : "+persona.getApellidos());
        System.out.println("Fecha nacimiento: " + persona.getFechaNacim());
        */
        Alumno alumno = new Alumno("1DAW",9.5,"Alejandro","Alberola Gopar",2000, 4, 14);
        System.out.println(alumno.mostrarDatos());
        /*
        System.out.println("\tALUMNO");
        System.out.println("Nombre : " + alumno.getNombre());
        System.out.println("Apellido : "+alumno.getApellidos());
        System.out.println("Fecha nacimiento: " + alumno.getFechaNacim());
        System.out.println("Nota media: " +alumno.getNotaMedia());
        System.out.println("Grupo: " +alumno.getGrupo());
        */
        Profesor profesor = new Profesor(2000,"Matematicas","Alejandro","Alberola Gopar",2000, 4, 14);
        System.out.println(profesor.mostrarDatos());
        /*
        System.out.println("\tPROFESOR");
        System.out.println("Nombre : " + profesor.getNombre());
        System.out.println("Apellido : "+ profesor.getApellidos());
        System.out.println("Fecha nacimiento: " + profesor.getFechaNacim());
        System.out.println("Sueldo: " + profesor.getSueldo());
        System.out.println("Especialidad: " +profesor.getEspecialidad());
        */
    }
    
}
