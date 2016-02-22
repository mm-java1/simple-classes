package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {

    /**Update the Dog class to have the following private instance variables:
     * name
     * age
     */

    // Use private for encapsulation
    private double age;
    private String name;

    /**Add a constructor that requires a name.**/
    // Creating a constructor to ensure a value is set
    public Dog(String DogName){
        this.name = this.setName(DogName);
    }

    /**Add get and set functions for both the name and age.
     * (i.e. getName/setName and getAge/setAge)**/

    // Getter function
    public double getAge() {
        return age;
    }

    // Setter function
    public void setAge(double DogAge){
        if (DogAge > 0) {
            age = DogAge;
        } else {
            System.out.println("Bad value given, not setting the age of the dog");
        }
    }

    // Getter function
    public String getName() {
        return name;
    }

    // Setter function
    public String setName(String DogName){
        if (DogName != null) {
            name = DogName;
        } else {
            System.out.println("Bad value given, not setting the name of the dog");
        }
        return DogName;
    }

     /**Add a getHumanAge function, that uses the calculation you worked out last week.
     Like the method for the Cat class, this method should NOT require any input,
     as the Dog object is already aware of its own age.
     Use the age instance variable in the calculation, and return the equivalent human age.**/

    public double getHumanAge() {
        double humanAge;

        if (age <= 2) {
            humanAge = age * 10.5;

        } else {
            //first two years, gets you 21 human years
            humanAge = 21;
            // every other year after is 4 human years
            humanAge += 4 * age;

        }
        return humanAge;

    }
    public String toString()
    {
        String lcReturn;
        lcReturn = "Dog's name is "+name+"\nDog's age is "+ age + "\nDog's human age is "+ this.getHumanAge();
        return lcReturn;
    }

    }
