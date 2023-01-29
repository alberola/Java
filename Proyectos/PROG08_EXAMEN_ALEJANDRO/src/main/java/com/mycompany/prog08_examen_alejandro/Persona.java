/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_examen_alejandro;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @sincer 29/04/2022
 */

public class Persona {
        protected String nombre;
        protected String apellidos;
        protected String dni;

        // Constructores
        // -------------
                
        // Constructor
        public Persona (String nombre, String apellidos, String dni) {           
            this.nombre= nombre;
            this.apellidos= apellidos;
            this.dni= dni;
        }
        
        // Constructor copia
        public Persona (Persona persona) {           
            this.nombre= persona.getNombre();
            this.apellidos= persona.getApellidos();
            this.dni= persona.getDni();
        }
        
        // Métodos get
        // -------------
        
        // Método getNombre
        protected String getNombre (){
            return nombre;
        }
        
        // Método getApellidos
        protected String getApellidos (){
            return apellidos;
        }
        
        // Método getFechaNacim
        protected String getDni (){
            return this.dni;
        }

        // Métodos set
        // -------------

        // Método setNombre
        protected void setNombre (String nombre){
            this.nombre= nombre;
        }
        
        // Método setApellidos
        protected void setApellidos (String apellidos){
            this.apellidos= apellidos;
        }
        
        // Método setFechaNacim
        protected void setFechaNacim (String dni){
            this.dni= dni;
        }       

        // Método devolverContenidoString 

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }
        
        
}
