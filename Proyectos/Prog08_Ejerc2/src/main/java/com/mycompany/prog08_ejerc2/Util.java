/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog08_ejerc2;

/**
 *
 * @author 1daw16
 */
public class Util<T> {
    
    T t1;
    
    public void invertir(T[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            t1 = array[i];

            array[i] = array[array.length - i - 1];

            array[array.length - i - 1] = t1;

        }

    }
}
