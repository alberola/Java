/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosHerencias;

import java.time.LocalDate;



/**
 *
 * @author 1daw16
 */
public abstract class Persona {
    
    protected String nombre;

    protected String apellidos;

    protected LocalDate fechaNacim;

    public Persona(String nombre, String apellidos, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = LocalDate.of(anio, mes, dia);
    }

     
     
     
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

    public LocalDate getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(LocalDate fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public String mostrarDatos(){
        return "Nombre: "+ nombre+".\nApellidos: "+ apellidos+".\nFecha Nacimiento: "+fechaNacim;
    }
     
     
     
     
}
