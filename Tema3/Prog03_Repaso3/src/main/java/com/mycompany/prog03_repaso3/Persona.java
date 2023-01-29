/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog03_repaso3;

/**
 *
 * @author 1daw16
 */
public class Persona {
    private static final char SEXO_POR_DEFECTO = 'H';
    private static final String NOMBRE_POR_DEFECTO = "";
    private static final int EDAD_POR_DEFECTO = 0;
    private static final int PESO_POR_DEFECTO = 0;
    private static final int ALTURA_POR_DEFECTO = 0;
    private String nombre;
    private char sexo;
    private int edad;
    private String dni;
    private int peso;
    private int altura;
    Persona(){
        nombre = NOMBRE_POR_DEFECTO;
        sexo = SEXO_POR_DEFECTO;
        edad = EDAD_POR_DEFECTO;
        peso = PESO_POR_DEFECTO;
        altura = ALTURA_POR_DEFECTO;
    }
    Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;        
        this.edad = edad;
        this.sexo = sexo;
    }
    Persona(String nombre, char sexo, int edad, String dni, int peso, int altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC(){
        if ((peso/(altura^2)< 20)){           
            return -1;
        }else if((peso/(altura^2))> 20 && (peso/(altura^2))< 25){            
            return 0;
        }else{           
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        if(edad>=18){
           return true; 
        }else{
            return false;
        }
    }
    private char comprobarSexo(){
        return ((sexo == 'H' || sexo == 'M')?sexo:'H');
    }
    public String toString(){
        return "El nombre es : "+nombre+".\nEl sexo es: "+sexo+".\nLa edad: "+edad+".\nEl DNI: "+dni+".\nEl peso: "
                +peso+"kg.\nLa altura: "+altura+"cm.";
    }
    public String generaDNI(){
        int dni = (int) (10000000+Math.random()*99999999);
        int resto = dni%23;
        String letras = "TRWAGMYFPDXBWJZAQVHLCKE";
        char letra = letras.charAt(resto);
        String dniLetra = (""+dni+letra);        
        return dniLetra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
