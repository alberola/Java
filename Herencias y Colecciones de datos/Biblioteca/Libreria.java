/*
 *
 */
package Biblioteca;

/**
 *
 * @author Diego Brito Sánchez
 * @date 1 abr. 2022
 * @version 1.0
 */
public class Libreria {

    //attributes
    private String type;
    Publicacion libreria[] = null;

    //constructor
    public Libreria() {
        this.libreria = new Publicacion[50];
    }

    //methods
    public int addPublicacion(String ISBN, String title, int year, String type, int number) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] == null) {
                if (findPublic(ISBN) == null) {
                    if (type.equalsIgnoreCase("libro")) {
                        libreria[i] = new Libro(ISBN, title, year, type);
                        return 1;
                    } else {
                        libreria[i] = new Revista(ISBN, title, year, number, type);
                        return 1;
                    }
                } else {
                    return 2;
                }
            }
        }
        return 3;
    }

    public String findPublic(String isbn) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && libreria[i].getISBN().equals(isbn)) {
                return libreria[i].toString();
            }
        }
        return null;
    }

    //Método para listar toda la librería
    public String listLibreria() {
        String list = "\nListado de publicaciones\n";
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null) {
                list += libreria[i].toString();
            }
        }
        return list;
    }

    //Metodo para saber que tipo de publicacion es cada posicion de la lista
    public int whatIs(int position) {
        if (libreria[position].getType().equalsIgnoreCase("libro")) {
            return 1;
        }
        return 0;
    }

    //Método para listar las publicaciones no prestadas
    public String listNotLoan() {
        String list = "\n Listado de publicaciones disponibles\n";
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && whatIs(i) == 1) { //Si se trata de un libro casteamos la posicion para que sea un libro y poder trabajar
                Libro auxLib = (Libro) libreria[i]; //con sus métodos
                if (!auxLib.isOnLoan()) { //Si el libro no está prestado lo enseñamos.
                    list += libreria[i].toString();
                }
            } else if (libreria[i] != null && whatIs(i) == 0) { //Controlamos la otra posibilidad, si es una revista la enseñamos.
                list += libreria[i].toString();
            }
        }
        return list;
    }

    //Devolver un libro
    public String returnBook(String isbn) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && libreria[i].getISBN().equals(isbn) && whatIs(i) == 1) {
                Libro auxBook = (Libro) libreria[i];
                if (auxBook.isOnLoan()) {
                    auxBook.returned();
                    return "Libro devuelto.";
                } else {
                    return "El libro que intentaba devolver no estaba en préstamo.";
                }
            }
        }
        return "No se ha podido devolver su libro.";
    }

    //Tomar prestado un libro
    public String loanBook(String isbn) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && libreria[i].getISBN().equals(isbn) && whatIs(i) == 1) {
                Libro auxBook = (Libro) libreria[i];
                if (!auxBook.isOnLoan()) {
                    auxBook.onLoan();
                    return "Libro prestado.";
                } else {
                    return "El libro que intentaba devolver ya estaba en préstamo.";
                }
            }
        }
        return "No se ha podido prestar su libro.";
    }

    //Listar segun el tipo
    public String listType(String type) {
        String list = "\nListado de libros\n";
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && libreria[i].getType().equalsIgnoreCase(type)) {
                list += libreria[i].toString();
            }
        }
        return list;
    }

    //Listar no prestados
    public String listLoans() {
        String list = "\n Listado de publicaciones no disponibles\n";
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && whatIs(i) == 1) { //Si se trata de un libro casteamos la posicion para que sea un libro y poder trabajar
                Libro auxLib = (Libro) libreria[i]; //con sus métodos
                if (auxLib.isOnLoan()) { //Si el libro no está prestado lo enseñamos.
                    list += libreria[i].toString();
                }
            }
        }
        return list;
    }
}
