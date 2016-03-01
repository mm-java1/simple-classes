package edu.htc.pets;

/**
 * Simple Dog class.
 * <p>
 * Dogs have a name and age.
 * There is also a function to calculate their human age.
 */
public class Dog extends Pet implements Audible {

    private String trickName;
    /**Update the Dog class to have the following private instance variables:
     * name
     * age
     */

    /**
     * Add a constructor that requires a name.
     **/
    // Creating a constructor to ensure a value is set
    public Dog(String DogName) {
        super(DogName);
    }

    public String getTrickName() {
        return trickName;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }


    /**Add get and set functions for both the name and age.
     * (i.e. getName/setName and getAge/setAge)**/

    /**
     * Add a getHumanAge function, that uses the calculation you worked out last week.
     * Like the method for the Cat class, this method should NOT require any input,
     * as the Dog object is already aware of its own age.
     * Use the age instance variable in the calculation, and return the equivalent human age.
     **/

    public double getHumanAge() {
        double humanAge;

        if (getAge() <= 2) {
            humanAge = getAge() * 10.5;

        } else {
            //first two years, gets you 21 human years
            humanAge = 21;
            // every other year after is 4 human years
            humanAge += 4 * getAge();

        }
        return humanAge;

    }

    public String toString() {
        String lcReturn;
        lcReturn = "Dog's name is " + getName() + "\nDog's age is " + getAge() + "\nDog's human age is " + this.getHumanAge();
        return lcReturn;
    }

    @Override
    public void makeSound(){
        System.out.println(this.getName() + " says Woof!!");
    }
}
