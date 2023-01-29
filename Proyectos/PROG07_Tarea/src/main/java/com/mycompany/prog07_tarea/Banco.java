/*
 * Clase donde se encuentra el Banco con el array para insertar el tipo de cuenta
 */
package com.mycompany.prog07_tarea;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 04/04/2022
 */
public class Banco {
    private final int numMax = 100;
    private CuentaBancaria cuentas[] = new CuentaBancaria[numMax];
    
    //Constructor que poner a null todos los valores del array.   
    Banco() {
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = null;
        }
    }
    
    //Metodo para añadir cuenta.
    
    public boolean addCuenta (CuentaBancaria cuentaBanca){
        for( int i = 0 ; i < cuentas.length ; i++) {
            if (cuentas[i] == null ){
                cuentas[i] = cuentaBanca;
                return true;
            }
        }
        return false;
    }
    
    //Método para listar todas las cuentas disponibles.

    public String listarCuentas() {
        String listado = "\nListado de Cuentas.\n";
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                listado += cuentas[i].devolverInfoString();
            }
        }
        return listado;
    }
    
    public String listarCuenta(String iban){
        String listado = "\nListado de Cuenta."+iban+"\n";
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null && cuentas[i].getIban().equalsIgnoreCase(iban)) {
                listado += cuentas[i].devolverInfoString();
                return listado;
            }
        }
        return "No se ha encontrado dicha cuenta.";
    }
    public boolean ingresarDinero(String iban, double saldo){
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null && cuentas[i].getIban().equalsIgnoreCase(iban)) {
                cuentas[i].setSaldo(cuentas[i].getSaldo()+saldo);
                return true;
            }
        }
        return false;
    }
    
}
    
     

