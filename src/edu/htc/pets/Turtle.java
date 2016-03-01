package edu.htc.pets;

/**
 * Created by clifford.mauer on 2/29/2016.
 */
public class Turtle extends Pet implements Audible {

    public Turtle(String name) {
        super(name);
    }

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


}
