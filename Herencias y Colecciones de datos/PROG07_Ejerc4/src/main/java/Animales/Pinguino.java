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
public class Pinguino extends Ave {

    //constructor
    public Pinguino(String sex, String breed, String colour, String age, String id) {
        super(sex, breed, colour, age, id);
    }

    //methods
    public void fishing() {

    }

    @Override
    public boolean fly() {
        return false;
    }
    
    public void swim(){
        
    }
}
