/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunitaria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1daw16
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of sumarNumeros method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSumarNumeros() {
        int a = 6;
        int b = 4;
        
        Calculadora obj1 = new Calculadora();
        
        int resultado = obj1.sumarNumeros(a, b);
        assertEquals(10,resultado);
    }
    //@Test restar números
    public void testRestarNumeros(){
        int a = 8;
        int b = 6;
        
        Calculadora obj2 = new Calculadora();
        int resultado = obj2.restarNumeros(a, b);
        assertEquals(2,resultado);
    }
    
}
