package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat {
    private String name;
    private double age;


    // getter function

    public String getName() {
        return name;
    }

    // setter function

    public void setName(String name) {
        this.name = name;
    }

    // getter function

    public double getAge() {
        return age;
    }

    // setter function

    public void setAge(double age) {
        this.age = age;
    }

    // cat human age calculator method

    public double calculateCatHumanAge() {
        double humanAge = 0;
        if (age == 1) {
            humanAge = 15;
        }
        else if (age == 2) {
            humanAge = 25;
        }
        else {
            humanAge = 25 + 4 * (age-2);
        }
        return humanAge;
    }
}
