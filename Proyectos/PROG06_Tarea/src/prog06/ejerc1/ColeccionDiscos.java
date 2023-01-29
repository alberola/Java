/*
 * Clase la cual contendra un array de tipo disco, así como los constructores y los métodos encargados de de gestionar los discos.
 */
package prog06.ejerc1;
/**
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @date 11/03/2022
 */
public class ColeccionDiscos {

    private final int numMax = 50;
    private Disco disco[] = new Disco[numMax];

    ColeccionDiscos() {
        for (int i = 0; i < disco.length; i++) {
            disco[i] = null;
        }
    }

    public int buscarDisco(String codigo) {
        int posicion;
        for (int i = 0; i < disco.length; i++) {
            if (disco[i] != null && codigo.equalsIgnoreCase(disco[i].getCodigo())) {
                posicion = i;
                return posicion; //Retornará la posición del array donde se ha encontrado el disco.
            }
        }
        return -1;
    }

    public int insertarDisco(String autor, String titulo, String genero, int duracion, String codigo) {
        if (buscarDisco(codigo) != -1) {
            return -2; //Se retorna -2 si ya hay un disco con el codigo introducido. (El disco ya existe).
        }
        for (int i = 0; i < disco.length; i++) {
            if (disco[i] == null) {
                disco[i] = new Disco(autor, titulo, genero, duracion, codigo);
                return 0; //Retorna 0 si se guarda correctamente.
            }
        }
        return -1; //Quiere decir que la colección está llena.
    }

    //Método para borrar Discos según su código.
    public int borrarDisco(String codigo) {
        int posicion = buscarDisco(codigo);
        if (buscarDisco(codigo) != -1) {
            disco[posicion] = null;
            return posicion;
        }

        return -1; //Si no se ha encontrado el Disco retornará -1.
    }

    //Método para imprimir todos los datos del disco.
    public void listarDiscos() {
        for (int i = 0; i < disco.length; i++) {
            if (disco[i] != null) {
                listarDatos(i);
            }
        }
    }

    //Método para listar todos los datos (y luego reutilizar según su función).
    public void listarDatos(int posicion) {
        if (posicion != -1) {
            System.out.println("Disco " + posicion + ".");
            System.out.println("Autor: " + disco[posicion].getAutor());
            System.out.println("Titulo: " + disco[posicion].getTitulo());
            System.out.println("Género: " + disco[posicion].getGenero());
            System.out.println("Duración: " + disco[posicion].getDuracion());
            System.out.println("Código: " + disco[posicion].getCodigo());
            System.out.println();
        } else {
            System.out.println("No se ha introducido ningún Disco con este codigo.");
        }
    }

    //Método listar alumnos insertados, con el código.
    public void mostrarDisco(String codigo) {
        int posicion = buscarDisco(codigo);
        listarDatos(posicion);
    }
    
    //Método para mostrar por pantalla los datos de un disco según su autor.
    public void mostrarDiscoAutor(String autor){
        for (int i = 0; i < disco.length; i++) {
            if (disco[i] != null && autor.equalsIgnoreCase(disco[i].getAutor())) {
                listarDatos(i);           
            }
        }
    }
    
    //Método para mostrar por pantalla los datos de un disco según su género.
    public void mostrarDiscoGenero(String genero){
        for (int i = 0; i < disco.length; i++) {
            if (disco[i] != null && genero.equalsIgnoreCase(disco[i].getGenero())) {
                listarDatos(i);           
            }
        }
    }

    
    
    
}
