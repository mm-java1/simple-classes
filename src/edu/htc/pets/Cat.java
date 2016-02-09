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

    public String getName(){
        return catName;
    }

    public void setName(String catName){
        this.catName = catName;
    }

    public double getAge(){
        return catAge;
    }

    public void setAge(Double catAge){
        this.catAge = catAge;
    }

    //Calculating cat age in human years
    public double getCatHumanAge(){
        double humanAge =0;

        if (this.getAge() ==1){
            humanAge = 15;
        }
        else if (this.getAge() == 2){
            humanAge = 25;
        }
        else{
            //first two years, cat will be 25 human year
            humanAge = 25;
            //every other year after is 4 human year
            humanAge +=4 *(this.getAge() -2);
        }
        return humanAge;
    }


}
