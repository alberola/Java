/*
 * Clase principal del programa que se encarga de pedir los datos por pantalla y hacer las llamadas a los métodos necesarios.
 */
package prog06.ejerc1;

import java.util.Scanner;
import prog06.ejerc1.util.Validar;

/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class Principal {

    static Scanner sca = new Scanner(System.in);

    /*
    Muestra el menú en pantalla.
     */
    public static int mostrarMenu() {

        System.out.println("GESTIÓN DE DISCOS DE UNA COLECCIÓN.");

        System.out.println("1.Nuevo Disco.");
        System.out.println("2.Listar Discos.");
        System.out.println("3.Buscar Discos.");
        System.out.println("4.Borrar Disco.");
        System.out.println("5.Listado de discos de un autor concreto.");
        System.out.println("6.Listado de discos de un género concreto.");
        System.out.println("7.Extra Insertar canción.");
        System.out.println("8.Extra listar canciones.");
        System.out.println("9.Extra modificar canción.");
        System.out.println("10.Extra borrar canción.");
        System.out.println("11.Salir.");

        int opt = sca.nextInt();
        sca.nextLine(); //consumimos el salto de línea sino al leer el siguiente error tenemos error.
        return opt;
    }

    public static void main(String args[]) {
        int opt;

        String autor, titulo, genero, codigo;
        int duracion;

        //En principio la referencia al Vehículo apuntará a null.
        ColeccionDiscos discos = new ColeccionDiscos();

        do {
            opt = mostrarMenu();

            switch (opt) {

                //Crear nuevo vehículo. Si ya existe alguno, desaparecerá su referencia al crear el nuevo.
                case 1:
                    System.out.println("Nuevo disco");
                    System.out.println("Introduce el autor del disco");
                    autor = sca.nextLine();
                    System.out.println("Introduce el título del disco.");
                    titulo = sca.nextLine();                    
                    System.out.println("Introduce el género del disco.");
                    genero = sca.nextLine();
                    System.out.println("Introduce la duracion del disco.");
                    duracion = sca.nextInt();
                    sca.nextLine();
                    System.out.println("Introduce el codigo del disco.");
                    codigo = sca.nextLine();
                    while(!Validar.validaCodigo(codigo)){
                        System.out.println("El código introducido es erroneo.");
                        System.out.println("Introducelo nuevamente: ");
                        codigo = sca.nextLine();
                    }
                    //Llegados a este punto, hay que insertar el vehículo
                    int result = discos.insertarDisco(autor, titulo, genero, duracion, codigo);
                    switch (result) {
                        case 0:
                            System.out.println("El disco ha sido insertado en la colección");
                            
                            break;
                        case -1:
                            System.out.println("La colección está llena.");
                            break;
                        case -2:
                            System.out.println("El disco ya existe.");
                            break;
                        default:
                            break;
                    }

                    break;

                case 2:
                    discos.listarDiscos();       
                    break;
                case 3:
                    System.out.println("Búsqueda de disco por codigo.");
                    System.out.println("Introduce el codigo.");
                    String codigoBusqueda = sca.nextLine();
                    discos.mostrarDisco(codigoBusqueda);
                    break;

                case 4:
                    System.out.println("Borrar disco.");
                    System.out.println("Introduce el código.");
                    String codigoBorrar = sca.nextLine();
                    System.out.println((discos.borrarDisco(codigoBorrar)!= -1)?"El Disco ha sido borrado con exito.":
                            "No se encuentra ningún disco con ese código." );
                    break;
                    
                case 5:
                    System.out.println("Búsqueda de disco por autor.");
                    System.out.println("Introduce el autor.");
                    String autorBusqueda = sca.nextLine();
                    discos.mostrarDiscoAutor(autorBusqueda);
                    break;
                    
                case 6:
                    System.out.println("Búsqueda de disco por género.");
                    System.out.println("Introduce un género para mostrar los discos y las canciones.");
                    String generoBusqueda = sca.nextLine();
                    discos.mostrarDiscoGenero(generoBusqueda);
                    break;
                    
                    
                case 7:
                    /*
                    System.out.println("Introduce el código del disco donde deseas introducir la canción.");
                    String codigoCancion = sca.nextLine();
                    La forma en la que lo plantearia sería que el usuario me diera un codigo 
                     y que según ese código calcular la posicion con el método busquedaDisco e insertar ahí las canciones
                    pero no me queda tiempo y estoy saturado, así como preguntando cuantas canciones quiere poner...*/
                    break;
                    
                case 8:
                    
                    break;
                    
                case 9:
                    
                    break;
                    
                case 10:
                    /*
                    System.out.println("Introduce el titulo de la canción a borrar.");
                    String cancionBorrar = sca.nextLine();
                    System.out.println((cancion.borrarCancion(cancionBorrar)!= -1)?"El Disco ha sido borrado con exito.":
                            "No se encuentra ningún disco con ese código." );
                    */              
                    break;
                  
                    
                case 11: {
                    System.out.println("Eso es todo. BYE");
                    break;
                }     
            }
        } while (opt != 11);
    }

}
