/*
 * Clase principal del programa donde se gestionará los concesionarios de un vehiculo.
 */
package prog.prog08_evaluable;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 14/05/2022
 */
public class Principal {

    static Scanner sca = new Scanner(System.in);

    /*
    Muestra el menú en pantalla.
     */
    public static int mostrarMenu() {

        System.out.println("GESTIÓN DE VEHÍCULOS DE UN CONCESIONARIO");

        System.out.println("1.Nuevo Vehículo.");
        System.out.println("2.Listar Vehículos.");
        System.out.println("3.Buscar Vehículo.");
        System.out.println("4.Modificar Kilómetros de Vehículo.");
        System.out.println("5.Eliminar vehículo.");
        System.out.println("6.Listar por DNI.");
        System.out.println("7.Listar por kilómetros.");
        System.out.println("8.Listar por precio.");
        System.out.println("9.Listar por nombre del propietario.");
        System.out.println("10.Listar por marca.");
        System.out.println("11.Insertar datos de prueba.");
        System.out.println("12.Listar por antigüedad.");
        System.out.println("0.Salir.");

        int opt = sca.nextInt();
        sca.nextLine(); //consumimos el salto de línea sino al leer el siguiente error tenemos error.
        return opt;
    }

    public static void main(String args[]) {
        int opt;

        String marca, matricula, descripcion, propietario, dni_propietario;
        int numkms, precio;
        int dia_mat, mes_mat, anio_mat;
        LocalDate fecha_mat;

        //
        Concesionario concesionario = new Concesionario();
        Vehiculo vehiculo;
        //Pasamos el concesionario a una lista para ordenarla según el criterio dado.
        List<Vehiculo> listaOrdenada;

        do {
            opt = mostrarMenu();

            switch (opt) {

                //Crear nuevo vehículo. Si ya existe alguno, desaparecerá su referencia al crear el nuevo.
                case 1:
                    
                    System.out.println("Nuevo Vehículo");
                    System.out.println("Introduce la marca del vehículo");
                    marca = sca.nextLine();
                    System.out.println("Introduce la matrícula del vehículo");
                    matricula = sca.nextLine();
                    System.out.println("Introduce la descripción del vehículo");
                    descripcion = sca.nextLine();
                    System.out.println("Introduce el número de kilómetros del vehículo");
                    numkms = sca.nextInt();
                    sca.nextLine();
                    System.out.println("Introduce el precio del vehículo");
                    precio = sca.nextInt();
                    sca.nextLine();
                    System.out.println("Introduce el propietario del vehículo");
                    propietario = sca.nextLine();
                    System.out.println("Introduce el dni propietario del vehículo");
                    dni_propietario = sca.nextLine();

                    System.out.println("Introduce el dia de matriculacion");
                    dia_mat = sca.nextInt();
                    sca.nextLine();

                    System.out.println("Introduce el mes de matriculacion");
                    mes_mat = sca.nextInt();
                    sca.nextLine();

                    System.out.println("Introduce el año de matriculacion");
                    anio_mat = sca.nextInt();
                    sca.nextLine();

                    fecha_mat = LocalDate.of(anio_mat, mes_mat, dia_mat);

                    //Llegados a este punto, hay que insertar el vehículo
                    vehiculo = new Vehiculo(marca, matricula, numkms, fecha_mat, descripcion, precio, propietario, dni_propietario);

                    int result = concesionario.insertarVehiculo(vehiculo);
                    switch (result) {
                        case 0:
                            System.out.println("El vehículo ha sido creado en el concesionario");
                            break;
                        case -1:
                            System.out.println("El vehículo ya existe.");
                            break;
                        default:
                            break;
                    }
                    break;
                    
                case 2:
                    
                    //Ya que estamos utilizando una coleccion LinkedHashSet se meterán por orden de introducción.
                    
                    System.out.println("Listado de Vehículos");
                    System.out.println(concesionario);

                    break;
                    
                case 3:
                    
                    System.out.println("Búsqueda de Vehículo por Matrícula");
                    System.out.println("Introduce la matrícula");
                    String matBuscar = sca.nextLine();
                    String veh = concesionario.buscaVehiculo(matBuscar);
                    if (veh == null) {
                        System.out.println("No existe vehículo con la matrícula introducia");
                    } else {
                        System.out.println(veh);
                        System.out.println("Vehículo mostrado, toque una tecla para continuar");
                        sca.nextLine();
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Modificar kilómetros de Vehículo");
                    System.out.println("Introduce la matrícula");
                    matBuscar = sca.nextLine();
                    System.out.println("Introduce los kilómetros");
                    int kms = sca.nextInt();
                    sca.nextLine();

                    if (concesionario.actualiza_kmVeh(matBuscar, kms)) {
                        System.out.println("Se han actualizado los kilómetros del vehículo con matrícula " + matBuscar);
                    } else {
                        System.out.println("No se ha podido actualizar los km en el vehículo");
                    }
                    break;
                    
                case 5:
                    
                    System.out.println("Eliminar Vehículo");
                    System.out.println("Introduce la matrícula");
                    matBuscar = sca.nextLine();
                    if (concesionario.eliminarVehiculo(matBuscar)) {
                        System.out.println("Vehículo eliminado.");
                    } else {
                        System.out.println("No se ha podido eliminar el vehículo solicitado.");
                    }
                    break;
                    
                case 6:
                    
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarDni();
                    System.out.println(listaOrdenada);
                    break;
                    
                case 7:
                    
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarKms();
                    System.out.println(listaOrdenada);
                    break;
                    
                case 8:
                    
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarPrecio();
                    System.out.println(listaOrdenada);
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
                    break;
                    
                case 9:
                    
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarNombre();
                    System.out.println(listaOrdenada);
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
                    break;
                    
                case 10:
                    
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarMarca();
                    System.out.println(listaOrdenada);
                    break;
                    
                case 11:
                    
                    System.out.println("El tamaño del concesionario es de: " + concesionario.insertaEjemplo());
                    break;
                    
                case 12:
                    
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarAntiguedad();
                    System.out.println(listaOrdenada);
                    break;
                    
                case 0: {
                    System.out.println("Eso es todo. BYE");
                    break;
                }

            }
        } while (opt != 0);
    }

}
