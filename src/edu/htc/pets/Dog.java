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
    public static double getHumanAge()
    {
        double humanAge = 0;
        if (age <= 2)
        {
            humanAge = age * 10.5;
        }
        else
        {
            humanAge = 21 + (age * 4);
        }
        return humanAge;
    }
}
