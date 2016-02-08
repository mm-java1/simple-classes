package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {
    // Use private for encapsulation
    // then add getter setter functions if needed
    private int dogAge;
    private String dogName;

    // Creating a constructor to ensure a value is set
    public Dog (int dogAge){
        this.dogAge = dogAge;
    }

    // Creating a default constructor
    public Dog(int dName) {
        dogAge = 0;
        if (dName > 0) {
            dogName = dName;
        } else {
            System.out.println("Dog name is required")
        }

        //dogName = null;
    }


    // Getter function
    public int getdogAge() {
        return dogAge;
    }

    // Setter function
    public void setdogAge(int dAge){
        if (dAge > 0) {
            dogAge = dAge;
        } else {
            System.out.println("Bad value given, not setting age");
        }
    }


    public static double getHumanAge(int dogAge) {
        double humanAge = 0;

        if (dogAge <=2) {
            humanAge = dogAge * 10.5;
        } else {
            // first two years, gets you 21 human years
            humanAge = 21;

            // every other year after is 4 human years
            humanAge += 4 * dogAge;
        }

        return humanAge;

    }


}
