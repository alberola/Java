/*
 *
 */
package Biblioteca;

/**
 *
 * @author Diego Brito Sánchez
 * @date 25 mar. 2022
 * @version 1.0
 */
public class Libro extends Publicacion implements Prestable {

    private boolean loan;

    //constructor
    public Libro(String ISBN, String title, int year, String type) {
        super(ISBN, title, year, type);
        this.loan = false;
    }

    //getters & setters
    public boolean getLoan() {
        return loan;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }

    //methods
    @Override
    public boolean onLoan() {
        if (this.loan) {
            return false;
        }
        this.loan = true;
        return true;
    }

    @Override
    public boolean returned() {
        if (!this.loan) {
            return false;
        }
        this.loan = false;
        return true;

    }

    @Override
    public boolean isOnLoan() {
        return this.loan;
    }

    @Override
    public String toString() {
        String loaned = isOnLoan() ? "Prestado" : "No prestado";
        return "\n--------------------------\nLibro:\nISBN: " + ISBN + "\nTítulo: " + title
                + "\nAño de publicación: " + year + "\nPrestado: " + loaned;
    }

}
