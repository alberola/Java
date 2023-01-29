/**
 * Clase Main.
 */
package com.mycompany.prog06_4;

import java.util.Scanner;

/**
 * @date 7 mar 2022
 * @author Diego Rodríguez Jacinto <drplaybasketball@gmail.com> 1DAW Número 26.
 * @version 1.0 Nombre de la Clase: Principal
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables del Alumno.
        String dni = null; 
        String grupo = null;
        double notamedia;
        String nombre;
        String apellido;
        Aula aula = new Aula();
        //variable para el menu
        int opcionesMenu;
        do {
            Menu.opcionesMenu();
            opcionesMenu = sc.nextInt();
            sc.nextLine();
            switch (opcionesMenu) {
                case 1:
                    System.out.println("Inserta el nombre del alumno: ");
                    nombre = sc.nextLine();
                    System.out.println("Inserta el apellido del alumno: ");
                    apellido = sc.nextLine();
                    System.out.println("Inserta el dni del alumno: ");
                    dni = sc.nextLine();
                    System.out.println("Inserta el grupo del alumno: ");
                    grupo = sc.nextLine();
                    while (Validaciones.comprobarDni(dni) == false) {
                        System.out.println("Erróneo. Vuelva a introducir el Dni del nuevo alumno.");
                        dni = sc.nextLine();
                    }
                    System.out.println("Inserta la nota media del alumno de este curso: ");
                    notamedia = sc.nextDouble();
                    sc.nextLine();
                    int resultado = aula.insertarAlumno(dni, nombre, grupo, apellido, notamedia);
                    switch (resultado) {
                        case -1:
                            System.out.println("No hay espacios vacios.");
                            break;
                        case -2:
                            System.out.println("Se repite.");
                            break;
                        case -3:
                            System.out.println("Se inserta correctamente.");
                            System.out.println("Dame el número de asignaturas a insertar para el nuevo alumno: ");
                            int numAsig = sc.nextInt();
                            sc.nextLine();
                            if(numAsig >=2 && numAsig <=10){
                            do {
                                System.out.println("Inserta el nombre de la asignatura: ");
                                String nombreAsig = sc.nextLine();
                                System.out.println("Inserta el nombre del profesor de esta asignatura: ");
                                String profesor = sc.nextLine();
                                resultado = aula.insertarAsignatura(dni, nombreAsig, profesor);//posicion es posicion alumno.
                                switch (resultado) {
                                    case 0:
                                        System.out.println("Se inserta de manera adecuada.");
                                        break;
                                    case -1:
                                        System.out.println("No hay espacios libres.");
                                        break;
                                    case -2:
                                        System.out.println("Se repite.");
                                        break;
                                }

                                numAsig--;
                            } while (numAsig != 0);
                            }else{
                                System.out.println("Error al inseartar asignaturas.");
                            }
                            break;
                    }
                    break;
                //Caso 2, listar alumnos.
                case 2:
                    aula.listarTodosAlumnos();
                    break;
                //Caso 3, listar alumnos al buscarlo previamente.   
                case 3:
                    System.out.println("Inserta el dni del alumno quieres buscar: ");
                    dni = sc.nextLine();
                    aula.mostrarAlumno(dni);
                    break;
                //Caso 4, borrar asignatura ya creada.
                case 4:
                    System.out.println("Inserta el nombre de la asignatura que quieres borrar: ");
                    String nombreAsig = sc.nextLine();
                    resultado = aula.borrarAsignatura(dni, nombreAsig);
                    if (resultado == 0) {
                        System.out.println("Se ha borrado correctamente la asignatura buscada.");
                    } else {
                        System.out.println("No se ha podido borrar la asignatura.");
                    }
                    break;
                //Caso 5, insertar nuevas asignaturas. CÓDIGO REUTILIZADO DEL CASO -3 DEL SEGUNDO SWITCH QUE SIRVE PARA INSERTAR NUEVAS ASIGNATURAS.
                case 5:
                    System.out.println("Dame el número de asignaturas que quieres insertar: ");
                    int numAsig = sc.nextInt();
                    sc.nextLine();
                    do {
                        System.out.println("Inserta el nombre de la nueva asignatura: ");
                        nombreAsig = sc.nextLine();
                        System.out.println("Dame el nombre del profesor de esta nueva asignatura: ");
                        String profesor = sc.nextLine();
                        resultado = aula.insertarAsignatura(dni, nombreAsig, profesor);
                        switch (resultado) {
                            case 0:
                                System.out.println("Se inserto correctamente la nueva asignatura.");
                                break;
                            case -1:
                                System.out.println("No hay espacios vacíos.");
                                break;
                            case -2:
                                System.out.println("Se repite.");
                                break;
                        }

                        numAsig--;
                    } while (numAsig != 0);
                    break;
                //Caso 6, salida del programa.    
                case 6:
                    System.out.println("Cerrando el programa.");
                    break;
            }

        } while (opcionesMenu != 6);

    }

}
