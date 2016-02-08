package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat {

    // Use private for encapsulation
    private double age;
    private String name;

    // Creating a constructor to ensure a value is set
    public Cat(double CatAge, String CatName){
        this.setAge(CatAge);
        this.setName(CatName);
    }

    // Creating a default constructor
    public Cat() {
        age = 0;
        name = null;
    }
    /**Add get and set functions for both the name and age.
     * (i.e. getName/setName and getAge/setAge)**/

    // Getter function
    public double getAge() {
        return age;
    }

    // Setter function
    public void setAge(double CatAge){
        if (CatAge > 0) {
            age = CatAge;
        } else {
            System.out.println("Bad value given, not setting the age of the cat");
        }
    }

    // Getter function
    public String getName() {
        return name;
    }

    // Setter function
    public void setName(String CatName){
        if (CatName != null) {
            name = CatName;
        } else {
            System.out.println("Bad value given, not setting the name of the cat");
        }
    }

    /**Add a getHumanAge function, that uses the calculation you worked out last week.
     Unlike your function from last week, this method should NOT require any input,
     as the Cat object is already aware of its own age.
     Use the age instance variable in the calculation, and return the equivalent human age.
     */

    public double getHumanAge() {
        double humanAge;

        if (age <= 1) {
            humanAge = 15;
        } else {
            if (age > 1 & age <= 2) {
                humanAge = 25;
            }
            else {
                // first two years, gets cat to 25 human years
                humanAge = 25;
                humanAge += 4 * (age-2);
            }
        }
        return humanAge ;

    }

    public String toString()
    {
        String lcReturn;
        lcReturn = "Cat's name is "+name+"\nCat's age is "+ age + "\nCat's human age is "+ this.getHumanAge();
        return lcReturn;
    }

}
