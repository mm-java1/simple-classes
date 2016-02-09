package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {
    private String dogNames;
    private Double dogAge;

    //Creating a constructor
//    public Dog (String dogNames){
//        this.dogNames = dogNames;
//    }

    public void setName(String dogNames){
        this.dogNames = dogNames;
    }
    public String getName(){

        return dogNames;
    }

    public void setAge(double dogAge) {
        this.dogAge = dogAge;
    }

    public double getAge(){
        return dogAge;
    }




    //Calculating dog age in human years
    public double getDogHumanAge(){
        double humanAge = 0;
        if(this.getAge() <=2){
            humanAge= this.getAge() * 10.5;
        }else{
            //first two years, gets you 21 humna years
            humanAge = 21;
            //every other year after is 4 human years
            humanAge += 4 * (this.getAge() - 2);
        }
        return humanAge;

    }



}
