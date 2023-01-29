/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog10_evaluable;

/**
 *
 * @author 1daw16
 */
public class Validacion {
    public static boolean validarDni (String dni){
        return dni.matches("[0-9]{8}[A-Z]{1}");
    }
}
