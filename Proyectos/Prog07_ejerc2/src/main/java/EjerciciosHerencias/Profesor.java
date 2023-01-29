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
public class Profesor extends Persona{
    protected double sueldo;
    protected String especialidad;

    public Profesor(double sueldo, String especialidad, String nombre, String apellidos, int anio, int mes, int dia) {
        super(nombre, apellidos, anio, mes, dia);
        this.sueldo = sueldo;
        this.especialidad = especialidad;
    }
 
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
        @Override
    public String getNombre(){
        return "Profesor: "+nombre;
    }
    
        @Override
    public String mostrarDatos(){
        return "Nombre: "+ nombre+".\nApellidos: "+ apellidos+".\nFecha Nacimiento: "+fechaNacim+
                ".\nSueldo: "+sueldo+".\nEspecialidad: "+especialidad;
    }
    
    
}
