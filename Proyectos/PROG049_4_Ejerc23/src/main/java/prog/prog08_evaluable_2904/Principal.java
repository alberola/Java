/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.prog08_evaluable_2904;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Principal {

    static Scanner sca = new Scanner(System.in);

    /*
    Muestra el menú en pantalla.
     */
    public static int mostrarMenu() {

        System.out.println("GESTIÓN DE VEHÍCULOS DE UN CONCESIONARIO");

        System.out.println("1.Nuevo Vehículo.");
        System.out.println("2.Listar Vehículos por matrícula.");
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
        System.out.println("13.Buscar Vehículo (sin iterador).");
        System.out.println("14.Introducir datos en fichero .dat.");
        System.out.println("15.Leer datos desde fichero .dat.");
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
        List<Vehiculo> listaOrdenada = null;

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
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenaVehiculo();
                    System.out.println(listaOrdenada);
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
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
                    System.out.println("Toque una tecla para continuar");
                    sca.nextLine();
                    break;
                case 6:
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarDni();
                    System.out.println(listaOrdenada);
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
                    break;
                case 7:
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarKms();
                    System.out.println(listaOrdenada);
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
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
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
                    break;
                case 11:
                    //Comentar / descomentar para el correcto uso del ejercicio.
                    System.out.println("El tamaño del concesionario es de: " + concesionario.insertaEjemplo());
                    break;
                case 12:
                    System.out.println("Listado de Vehículos");
                    listaOrdenada = concesionario.ordenarAntiguedad();
                    System.out.println(listaOrdenada);
                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
                    break;
                case 13:
                    System.out.println("Búsqueda de Vehículo por Matrícula");
                    System.out.println("Introduce la matrícula");
                    matBuscar = sca.nextLine();
                    System.out.println(concesionario.buscaExtra(matBuscar));

                    System.out.println("Vehículos mostrados, toque una tecla para continuar");
                    sca.nextLine();
                    break;
                case 14:
                    System.out.println("¿Quiere Guardar los datos del concesionario en un fichero?");
                    System.out.println("--------PULSE ENTER PARA CONTINUAR--------");
                    sca.nextLine();
                    concesionario.escribirFichero(concesionario);
                    break;
                case 15:
                    System.out.println("Procediendo a leer los datos del concesionario desde un fichero.");
                    System.out.println("--------PULSE ENTER PARA CONTINUAR--------");
                    sca.nextLine();
                    concesionario.leerFichero(concesionario);
                    break;
                case 0: {
                    System.out.println("Eso es todo. BYE");
                    break;
                }

            }
        } while (opt != 0);
    }

}
