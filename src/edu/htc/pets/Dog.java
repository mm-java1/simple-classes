package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {
    private int age;
    private String name;

    //this override handles code question #4 to print the object "pretty"
    @Override
    public String toString(){
        return "Name is: " + this.name + ", Age is: " + this.age;
    }

    public Dog(String name){

        this.name = name; //constructor that requires nama
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHumanAge(){
        double humanAge = 0;

        if (this.getAge() <= 2){
            humanAge = this.getAge() * 10.5;
        }else {
            //fist 2 years = 21 human years
            humanAge = 21;
            humanAge += 4 * (this.getAge() - 2);
        }
        return humanAge;
    }
}
