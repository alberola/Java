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
public class Alumno extends Persona{
    protected String grupo;
    protected double notaMedia;

    public Alumno(String grupo, double notaMedia, String nombre, String apellidos, int anio, int mes, int dia) {
        super(nombre, apellidos, anio, mes, dia);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }
  
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    @Override
    public String getNombre(){
        return "Alumno: "+nombre;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre: "+ nombre+".\nApellidos: "+ apellidos+".\nFecha Nacimiento: "+fechaNacim+
                ".\nGrupo: "+grupo+".\nNota Media: "+notaMedia;
    }
    
    
    
    
    
}
