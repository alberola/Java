/*
 * Clase Principal del programa (main) la cual se encarga de ejecutar el menu del programa y hacer los llamamientos a los metodos de las
 * distintas clases.
 */
package com.mycompany.prog06_4;
import java.util.Scanner;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte seleccion = 0;
        String nombre,apellidos,dni;
        double notaMedia;
        Clase clase = new Clase ();
        
        do{
            System.out.println("1.-Nuevo Alumno.\n" +"2.-Listar Alumnos.\n" +"3.-Buscar Alumnos.\n" +"4.-Actualizar nombre alumno.\n" + "5.-Borrar Alumnos."
                    + "\n"+"6.-Listar Asignaturas.\n"+"7.-Salir");
            seleccion = sc.nextByte();
            sc.nextLine();
            switch(seleccion){
                case 1:
                    
                    //Datos que se piden por pantalla.
                    
                    System.out.println("Introduce el nombre del alumno: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduce sus apellidos: ");
                    apellidos = sc.nextLine();
                    System.out.println("Introduce la nota media de la asignatura:");
                    notaMedia = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Introduce el DNI:");
                    dni = sc.nextLine();
                    
                    //Validacion del dni.
                    
                    while(!Validaciones.validarDni(dni)){
                        System.out.println("El Dni introducido no es correcto.");
                        System.out.println("Recuerda que debé contener 8 digitos y una letra mayúscula.");
                        dni = sc.nextLine();
                    }
                    int resultado = clase.insertarAlumno(nombre, apellidos, notaMedia, dni);
                    switch(resultado){
                        case -2:
                            System.out.println("El DNI que intentas introducir ya pertenece a un alumno de la clase.");                           
                            break;                           
                        case -1:
                            System.out.println("La clase está llena.");                            
                            break;                           
                        case 0:
                            System.out.println("Se ha introducido el alumno correctamente.");
                            /*
                            System.out.println("Se ha introducido el alumno correctamente.");
                            System.out.println("Ahora introduce el número de asignaturas del mismo.");
                            int numAsignaturas = sc.nextInt();
                            sc.nextLine();
                            if (numAsignaturas >2){
                                do{
                                    System.out.println("Introduce nombre de la asignatura: ");
                                    String nombreAsignatura = sc.nextLine();
                                    System.out.println("Introduce el nombre del profesor: ");
                                    String nombreProfesor = sc.nextLine();


                                }while();
                            } else{
                                System.out.println("No se han podido introducir ese número de asignaturas.");
                            }
                            */
                            break;
                    }
                    
                    
                    break;
                    
                case 2:
                    clase.listarAlumnos();
                    break;
                    
                case 3:
                    System.out.println("Para buscar un alumno introduce su DNI: ");
                    String dniListar = sc.nextLine();
                    
                    clase.mostrarAlumno(dniListar);  
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("Para borrar alumnos introduce el DNI del alumno que deseas borrar.");
                    String dniBorrar = sc.nextLine();
                    System.out.println((clase.borrarAlumnos(dniBorrar) != -1)?"Se ha borrado correctamente.":"No se encuentra ningun alumno con ese DNI.");
                    break;

                case 6:
                    System.out.println("Para listar las asignaturas introduce el DNI del alumno: ");
                    String dniAsignaturas = sc.nextLine();
                    
                    break;
            }   
            
        }while (seleccion != 7);
        
        
    }
    
}
