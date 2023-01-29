/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog07_ejercicios7;
import java.time.LocalDate;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 18/02/2022
 */
public class Concesionario {

    private final int numMaximo = 50;
    private Vehiculo concesionario[] = new Vehiculo[numMaximo];

    //Constructor que pone todos los huecos del concesionario a null hasta que se vayan ocupando.
    public Concesionario() {
        for (int i = 0; i < concesionario.length; i++) {
            concesionario[i] = null;
        }
    }

    //Método para insertar vehículo
    public int insertarVehiculo(String marca, String matricula, int numKms, LocalDate fechaMat, String descripcion, int precio, String propietario, String dniPropietario) { 
        if(buscarVehiculo(matricula) != null){
            return -2;
        }
        for (int i = 0; i < concesionario.length; i++) {
            if (concesionario[i] == null) {
                concesionario[i] = new Vehiculo(marca, matricula, numKms, fechaMat, descripcion, precio, propietario, dniPropietario);
                return 0;
            }
        }
        return -1;
    }

    //Metodo que busque un vehículo según su matrícula e imprime los datos de este.
    public String buscarVehiculo(String matricula) {
        for (int i = 0; i < concesionario.length; i++) {            
            if (concesionario[i] != null && matricula.equals(concesionario[i].matricula)) {
                return "El vehiculo " + i + "." + "\nLa marca es: " + concesionario[i].getMarca() + "\nSu matrícula es: " + concesionario[i].getMatricula()
                        + "\nSu precio es: " + concesionario[i].getPrecio();

            }
        }
        return null;
    }

    //Metodo que busque un vehículo según su matrícula y borra los datos de este.
    public void borrarVehículo(String matricula) {
        for (int i = 0; i < concesionario.length; i++) {
            if (concesionario[i] != null && matricula.equals(concesionario[i].matricula)) {
                concesionario[i] = null;
                System.out.println("Coche borrado con exito.");
                break;
            }
        }
        System.out.println("No hay ningún vehiculo con esa matrícula.");
    }

    //Método para listar todos los Vehículos del concesionario.
    public String mostrarVehículos() {
        for (int i = 0; i < concesionario.length; i++) {
            if (concesionario[i] != null) {
                return "El vehiculo " + i + "." + "\nLa marca es: " + concesionario[i].getMarca() + "\nSu matrícula es: " + concesionario[i].getMatricula()
                        + "\nSu precio es: " + concesionario[i].getPrecio();
            }
        }
        return "No hay ningun vehículo en el concesionario.";
    }
}

