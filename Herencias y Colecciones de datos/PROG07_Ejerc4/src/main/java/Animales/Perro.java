/*
 *
 */
package Animales;

/**
 *
 * @author Diego Brito Sánchez
 * @version 1.0
 * @date 31 mar. 2022
 */
public class Perro extends Mamifero {

    //constructor
    public Perro(String sex, String breed, String colour, String age, String id, int limbs, boolean fur) {
        super(sex, breed, colour, age, id, limbs, fur);
    }

    //methods
    public void bark() {
    }

    public int playBall() {
        int ball = ((int) (Math.random() * 10 + 1));

        if (ball > 5) {
            return 1;
        }

        return 0;
    }

    public void dig() {
    }
}
