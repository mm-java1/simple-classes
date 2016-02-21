package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {

    private String dogName;
    private int dogAge;

    public Dog(String dogName){
        this.dogName=dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String S){
        dogName = S;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int x) {
        dogAge = x;
    }


    public double calculateDogHumanAge() {
        double humanAge = 0;

        if (dogAge <= 2) {
            humanAge = dogAge * 10.5;
        } else {
            humanAge = 21;

            humanAge += 4 * dogAge;
        }

        return humanAge;
    }
}
