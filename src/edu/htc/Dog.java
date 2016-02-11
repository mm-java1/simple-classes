package edu.htc;

/**
 * Created by cheey on 2/2/2016.
 */
public class Dog {
    private int dogAge;
    double dogHumanAge;
    private String dogName;

    public Dog() {
        dogAge = 0;

        dogName = null;
    }

    public Dog(String name, int age) {
        this.dogName=name;
        this.dogAge=age;
    }
//DOG AGE
    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge( int dog){
        dogAge = dog;
    }
//DOG NAME
    public String getDogName(){
        return dogName;
    }

    public void setDogName( String catName){
        dogName = dogName;
    }
//DOG HUMAN AGE
    public double getDogHumanAge() {
        double dogHumanAge = 0;

        if (dogAge <= 2) {
            dogHumanAge = 10.5;
        }

        else{
            dogHumanAge = 10.5;
            dogHumanAge = (4 * (dogAge - 2)) + dogHumanAge;
        }
        return dogHumanAge;
    }
}
