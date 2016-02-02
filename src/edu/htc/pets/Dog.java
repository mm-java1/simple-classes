package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {
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
        if (getAge() <= 2)
        {
            humanAge = getAge() * 10.5;
        }
        else
        {
            humanAge = 21 + (getAge() * 4);
        }
        return humanAge;
    }
}
