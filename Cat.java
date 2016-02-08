 /** 
Simple Cat Class. 
Cats have a name and age. 
There is also a function to calculate thier Human Age
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


    public double getHumanAge () {
		
			double humanAge;
			
			if (age <= 1) 
			{
			humanAge = 15;
			}
			else if (age <= 2) 
			{
			humanAge = 25;
			}
			else 
			{
			humanAge =+ 4 * (age -2) + 25;
			} 
			return humanAge;
	}
 }
