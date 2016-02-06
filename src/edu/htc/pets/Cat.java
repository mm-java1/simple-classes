package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat {
    private String catName;

    private double catAge;

    public String getName() {
        return catName;
    }

    public void setName(String name) {
        this.catName = name;
    }

    public double getAge() {
        return catAge;
    }

    public void setAge(Double age) {
        this.catAge = age;
    }

    public double calculateCatHumanAge() {
        double humanAge = 0;
        //1 year old cat = 15
        if(catAge == 1) {
            humanAge = 15; }
        //2 year old cat is 25
        else if(catAge == 2) {
            humanAge = 25;
        }
        //every other year after 2 is + 4 years
        else {
            humanAge = 25 + 4 *(catAge-2);
        }
        return humanAge;
    }



}
