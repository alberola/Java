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
public class Animal {
    //attributes
    private String sex;
    private String breed;
    private String colour;
    private String age;
    private String id;
    
    //constructor
    
    public Animal(String sex, String breed, String colour, String age, String id) {
        this.sex = sex;
        this.breed = breed;
        this.colour = colour;
        this.age = age;
        this.id = id;
    }
    
    //getters & setters

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //mehods
    public boolean eating(){
        return true;
    }
    
    public boolean sleep(){
        return true;
    }
    
    public boolean drink(){
        return true;
    }

}
