/*
 * Clase vehiculo la cual tendra sus propios atributos, Sett/Gett
 */
package prog.prog08_evaluable;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 14/05/2022
 */
public class Vehiculo implements Comparable<Vehiculo>, Serializable {
    
    //Atributos
    
    String marca;
    String matricula;
    int num_kms;
    LocalDate fecha_mat;
    String descripcion;
    int precio;
    String propietario;
    String dni_propietario;

    //Constructores
    
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    public Vehiculo(String marca, String matricula, int num_kms, LocalDate fecha_mat, String descripcion, int precio, String propietario, String dni_propietario) {
        this.marca = marca;
        this.matricula = matricula;
        this.num_kms = num_kms;
        this.fecha_mat = fecha_mat;
        this.descripcion = descripcion;
        this.precio = precio;
        this.propietario = propietario;
        this.dni_propietario = dni_propietario;
    }
    
    //Constructor para meter solo algunos datos Split
    public Vehiculo (String marca, String matricula, int precio, String dniPropietario){
        this.marca = marca;
        this.matricula = matricula;
        this.precio = precio;
        this.dni_propietario = dniPropietario;
    }
    
    //Setters/Getters
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNum_kms() {
        return num_kms;
    }

    public void setNum_kms(int num_kms) {
        this.num_kms = num_kms;
    }

    public LocalDate getFecha_mat() {
        return fecha_mat;
    }

    public void setFecha_mat(LocalDate fecha_mat) {
        this.fecha_mat = fecha_mat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDni_propietario() {
        return dni_propietario;
    }

    public void setDni_propietario(String dni_propietario) {
        this.dni_propietario = dni_propietario;
    }

    public int get_Anios() {
        LocalDate hoy = LocalDate.now();
        return  (Period.between(this.fecha_mat, hoy).getYears());
    }
    
    public void act_kms (int nuevos_kms){
        this.num_kms=this.num_kms+nuevos_kms;
    }
    
    //Overrides de métodos de su clase principal (Concesionario)
    
    @Override
    public String toString() {
        return "-----Vehiculo-----" + "\nMarca: " + marca + "\nMatricula: " + matricula + "\nNúmero de Kms: " + num_kms +
                "\nFecha matriculación: " + fecha_mat + "\nDescripcion: " + descripcion + "\nPrecio: " + precio +
                "\nPropietario: " + propietario + "\nDNI Propietario: " + dni_propietario + "\n";
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.matricula.compareTo(o.getMatricula());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    
}
