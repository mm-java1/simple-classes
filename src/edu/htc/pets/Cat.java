package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */

public class Cat {
    private int age;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double getHumanAge(){
            double humanAge = 0;

            switch (this.getAge()){
                case 1: humanAge = 15;
                    break;
                case 2: humanAge = 25;
                    break;
                default: humanAge = 25 + ((this.getAge() - 2)  * 4);
                    break;
            }
            return humanAge;
        }
}
