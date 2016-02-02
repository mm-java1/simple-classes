package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat {
    private String name = new String();
    private double age;

    public void setAge(double age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public double getHumanAge()
    {
        double humanAge = 0;
        if (getAge() <= 1)
        {
            humanAge = getAge() * 15;
        }
        else if (getAge() <= 2)
        {
            humanAge = getAge() * 12.5;
        }
        else
        {
            humanAge = 25 + (getAge() * 4);
        }
        return humanAge;
    }
}
