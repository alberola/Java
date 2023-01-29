/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 09/05/2022
 */
public class Alumno extends Persona{
    
    //Atributos (en este caso solo hay uno propio de Alumno)
    
    private Fecha fechaMatricula;

    //Constructores
    
    public Alumno(String nif, String nombre, int edad, Fecha fechaMatricula) {                                    
        super(nif, nombre, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }

    public Alumno() {
    }
    
    //Getters / Setters
    
    public Fecha getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula.setDia(fechaMatricula.getDia());                                                      
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAño(fechaMatricula.getAño());
    }  
   
}