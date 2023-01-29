/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prog07_ejercicios7;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author 1daw16
 */
public class Vehiculo implements Comparable<Vehiculo>{

    String marca;
    String matricula;
    int numKms;
    LocalDate fechaMatriculacion;
    String descripcion;
    int precio;
    String propietario;
    String dniPropietario;

    public Vehiculo(String marca, String matricula, int numKms, LocalDate fechaMat, String descripcion, int precio, String propietario, String dniPropietario) {
        this.marca = marca;
        this.matricula = matricula;
        this.numKms = numKms;
        this.fechaMatriculacion = fechaMat;
        this.descripcion = descripcion;
        this.precio = precio;
        this.propietario = propietario;
        this.dniPropietario = dniPropietario;
    }
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

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

    public int getNumKms() {
        return numKms;
    }

    public void setNumKms(int num_kms) {
        this.numKms = num_kms;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
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

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dni_propietario) {
        this.dniPropietario = dni_propietario;
    }

    public int getAnios() {
        LocalDate hoy = LocalDate.now();
        return (Period.between(this.fechaMatriculacion, hoy).getYears());
    }

    public void actualizarKms(int nuevosKms) {
        this.numKms = this.numKms + nuevosKms;
    }

    @Override
    public String toString() {
        return "\nVehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", numKms=" + numKms + ", fechaMatriculacion=" + fechaMatriculacion + ", descripcion=" + descripcion + ", precio=" + precio + ", propietario=" + propietario + ", dniPropietario=" + dniPropietario + '}';
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

    @Override
    public int compareTo(Vehiculo o) {
        return matricula.compareTo(o.matricula);
        }
    

}

