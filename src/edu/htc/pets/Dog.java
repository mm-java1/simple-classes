package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {
    //Declare instance variables for name and age
    private String dogName;
    private double dogAge;

    //Add a constructor
    Dog(String na){
        dogName = na;
    }

    //Getter and Setter for name and age
    public String getDogName(){
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public double getdogAge() {
        return dogAge;
    }
    public void setDogAge(double dogAge) {
        this.dogAge = dogAge;
    }

    //Calculate dog to human age.
    public double calculateDogHumanAge(double dogAge){
        double dog2human;

        if (dogAge <= 2) {
            dog2human = dogAge * 10.5;
        } else{
            dog2human = (2 * 10.5) + ((dogAge - 2) * 4);
        }
        return dog2human;
    }
}
