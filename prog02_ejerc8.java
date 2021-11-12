/**
 * Práctica 8 DAW - Programación  
 *
 * 8.- Diseña un programa Java denominado PROG02_Ejerc8 que dados el número de alumnos matriculados en Programación,
 * número de alumnos matriculados  en Entornos de Desarrollo y número de alumnos matriculados en Base de datos.
 * El programa deberá mostrar el % de alumnos matriculado en cada uno de los tres módulos.
 * Se supone que un alumno sólo puede estar matrículado en un módulo. Trata de mostrar un solo decimal en los porcentajes.
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 05/11/2021
 */
package com.mycompany.prog02_ejerc8;
import java.util.Scanner;
public class prog02_ejerc8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float total;
        float porc1,porc2,porc3;//Creamos las variables utilizando float ya que al calcular los porcentajes trabajaremos mejor con este formato
        System.out.println("¿Cuantos alumnos hay en programación?");
        float prog = sc.nextInt();//Imprimimos y pedimos por pantalla el numero de alumnos que hay en cada módulo.
        System.out.println("¿Cuantos alumnos hay en Entornos de Desarrollo?");
        float ed = sc.nextInt();
        System.out.println("¿Cuantos alumnos hay en Base de datos?");
        float bae = sc.nextInt();
        total = prog+ed+bae;//Una vez sabemos los alumnos de cada módulo procedemos a calcular el total y el porcentaje equivalente en cada uno.
        porc1 = prog*100/total;
        porc2 = ed*100/total;
        porc3 = bae*100/total;
        System.out.printf("Del total de los %.0f alumnos.\n ",total);//Una vez calculados los porcentajes y el total imprimimos por pantalla los mismos.
        System.out.printf("%.1f%%  son de programacion.\n %.1f%% son de Entornos de Desarrollo.\n %.1f%% son de Base de Datos.",porc1,porc2,porc3);            
    }    
}
