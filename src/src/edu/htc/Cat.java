package edu.htc;

/**
 * Created by cheey on 2/2/2016.
 */
public class Cat {

    private int catAge;
    double catHumanAge;
    private String catName;

    //CONSTRUCTOR
    public Cat() {
        catAge = 0;

        catName = null;
    }

    public Cat(String name, int age) {
        this.catName=name;
        this.catAge=age;
}
//CAT AGE
    public int getCatAge() {
        return catAge;
    }

    public void setCatAge( int cat){
        catAge = cat;
    }
//CAT NAME
    public String getCatName(){
        return catName;
    }

    public void setCatName( String catName){
        catName = catName;
    }

    //CAT HUMAN AGE
    public double getCatHumanAge() {
        double catHumanAge = 0;

        if (catAge == 1) {
            catHumanAge = 15;
        }
        else if (catAge == 2) {
            catHumanAge = 25;
        }
        else{
            catHumanAge = 25;
            catHumanAge = (4 * (catAge - 2)) + catHumanAge;
        }

        return catHumanAge;
    }

}
