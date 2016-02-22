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
    private double dogAge;

    //Constructor for dog name

    // Constructor
    public Dog(String dogName){
        this.dogName = dogName;
    }

    // getter function

    public String getDogName() {
        return dogName;
    }

    // setter function

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    // getter function

    public double getDogAge() {
        return dogAge;
    }

    // setter function

    public void setDogAge(double dogAge) {
        this.dogAge = dogAge;
    }

    // Dog human age calculator method

    public double calculateDogHumanAge(){
        double humanAge = 0;
        if (dogAge <= 2) {
            humanAge = dogAge * 10.5;
        }
        else {
            // first two years, gets you 21 human years
            humanAge = 21;

            // every other year after is 4 human years
            humanAge += 4 * (dogAge-2);
        }
        return humanAge;
    }


}
