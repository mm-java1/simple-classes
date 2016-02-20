package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat {
    //Declare instance variables for name and age.
    private String catName;
    private double catAge;

    //Getter and Setter for name and age
    public String getCatName() {
        return catName;
    }

    public void setCatName(String cname) {
        catName = cname;
    }

    public double getCatAge() {
        return catAge;
    }

    public void setCatAge(double cage) {
        catAge = cage;
    }

    //Calculate cat age to human age
    public double calculateCatHumanAge(double catAge) {
        double cat2human;
        if (catAge <= 1) {
            cat2human = (catAge * 15);
        } else if (catAge > 1 && catAge < 2) {
            cat2human = 25;
        } else {
            cat2human = 25 + ((catAge - 2) * 4);
        }
        return cat2human;
    }

    public void printCat(){
        System.out.println("Type: Cat\nName: " + catName + "\nAge: " + catAge);
    }
}

