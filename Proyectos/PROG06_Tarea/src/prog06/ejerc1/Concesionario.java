/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog06.ejerc1;

import java.time.LocalDate;

/**
 *
 * @author
 */
public class Concesionario {

    final static int TAM_CONCESIONARIO = 50;
    Vehiculo concesionario[];
    int numVehiculos;

    public Concesionario() {
        concesionario = new Vehiculo[TAM_CONCESIONARIO];
        numVehiculos = 0;
    }

    public String buscaVehiculo(String matricula) {
        for (int i = 0; i < numVehiculos; i++) {
            if (concesionario[i].getMatricula().equals(matricula)) {
                return concesionario[i].getMarca() + " " + concesionario[i].getMatricula() + " " + concesionario[i].getPrecio();
            }
        }
        return null;
    }
        
    public int insertarVehiculo(String marca, String matricula, int numkms, LocalDate fecha_mat, String descripcion, int precio, String propietario, String dni_propietario) {
        if (numVehiculos >= TAM_CONCESIONARIO) 
            return -1;
        else if (this.buscaVehiculo(matricula)!=null)
            return -2;
        else {
            concesionario[numVehiculos]=new Vehiculo(marca, matricula, numkms, fecha_mat, descripcion, precio, propietario, dni_propietario);
            numVehiculos++;
        }
        
        return 0;
    }
    
    public void listaVehiculos (){
        int i=0;
        while (i<numVehiculos){
            System.out.println ("Vehículo:" + concesionario[i].getMarca() + " Matrícula: " + concesionario[i].getMatricula() + " Precio: " + concesionario[i].getPrecio() + " Descripción: " + concesionario[i].getDescripcion());
            i++;
        }
    }
    
    public boolean actualiza_kmVeh (String matricula, int kms){
        for (int i = 0; i < numVehiculos; i++) {
            if (concesionario[i].getMatricula().equals(matricula)) {
                concesionario[i].setNum_kms(kms);
                return true;
            }
        }
        return false;
    }
    
}
