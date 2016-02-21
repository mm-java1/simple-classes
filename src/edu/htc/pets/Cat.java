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
    private int catAge;


    public String getCatName() {
        return catName;
    }

    public void setCatName(String S){
        catName = S;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int x) {
        catAge = x;
    }

    public double calculateCatHumanAge() {
        double humanAge = 0;

        if (catAge <= 1) {
            humanAge = 15;
        } else if (catAge == 2) {
            humanAge = 25;
        } else {
            humanAge = 25;

            humanAge += 4 * (catAge - 2);
        }

        return humanAge;
    }
}
