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

    public String getName() {
        return dogName;
    }

    public void setName(String name) {

        this.dogName = name;
    }

    public double getAge() {

        return dogAge;
    }

    public void setAge(double age) {
        this.dogAge = age;
    }

    public Dog(String name) { //constructor
        this.dogName = name;
    }

    public double calculateDogHumanAge() {
        double humanAge = 0;


        if(dogAge <=2 ) {
            humanAge = dogAge * 10.5;
        }
        else {
            //first two years gets you 21 human ears
            humanAge = 21;

            //every other year after is 4 human years
            humanAge += 4 * (dogAge -2);
        }


        return humanAge;
    }



}
