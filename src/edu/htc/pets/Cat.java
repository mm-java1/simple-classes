package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat extends Pet implements Audible {

    // Creating a constructor to ensure a value is set
    public Cat(String CatName){
        super(CatName);
    }

    /**Add get and set functions for both the name and age.
     * (i.e. getName/setName and getAge/setAge)**/

    /**Add a getHumanAge function, that uses the calculation you worked out last week.
     Unlike your function from last week, this method should NOT require any input,
     as the Cat object is already aware of its own age.
     Use the age instance variable in the calculation, and return the equivalent human age.
     */

    public double getHumanAge() {
        double humanAge;

        if (getAge() <= 1) {
            humanAge = 15;
        } else {
            if (getAge() > 1 & getAge() <= 2) {
                humanAge = 25;
            }
            else {
                // first two years, gets cat to 25 human years
                humanAge = 25;
                humanAge += 4 * (getAge()-2);
            }
        }
        return humanAge ;

    }

    @Override
    public void makeSound(){
        System.out.println(this.getName() + " says Meow!!");
    }

}
