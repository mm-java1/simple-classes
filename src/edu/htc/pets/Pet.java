package edu.htc.pets;

/**
 * Created by clifford.mauer on 2/22/2016.
 */
public abstract class Pet {


    // Use private for encapsulation
    private double age;
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        String lcReturn;
        lcReturn = "Pets's name is "+getName()+"\nPet's age is "+ age + "\nCat's human age is "+ getHumanAge();
        return lcReturn;
    }

    public abstract double getHumanAge();
}
