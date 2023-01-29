/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Diego Brito Sánchez
 */
public interface Prestable {

    public boolean onLoan();

    public boolean returned();

    public boolean isOnLoan();
}
