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
    // then add getter setter functions if needed
    private int catAge;
    private String catName;

    // Creating a constructor to ensure a value is set
    public Cat (int catAge){
        this.catAge = catAge;
    }

    // Creating a default constructor
    public Cat() {
        catAge = 0;
        catName = null;
    }


    // Getter function
    public int getcatAge() {
        return catAge;
    }

    // Setter function
    public void setcatAge(int cAge){
        if (cAge > 0) {
             catAge = cAge;
        } else {
            System.out.println("Bad value given, not setting age");
        }
    }


    public static double getHumanAge(int catAge){
        double humanAge = 0;

        if (catAge <=1) {
            humanAge = catAge + 15;
        } else if (catAge > 1 & catAge <2)
            humanAge = catAge + 25;
        else {
            humanAge += 4 * catAge;

        }


        return humanAge;
    }


}
