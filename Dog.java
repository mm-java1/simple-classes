/** 
Simple Dog Class. 
Dogs have a name and age. 
There is also a function to calculate thier Human Age
*/
public class Dog {

	private String name;
	private int age;
		
		
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
			
			if (age <= 2) 
			{
			humanAge = age * 10.5;
			}
			else 
			{
			humanAge =+ 4 * (age -2);
			} 
			return humanAge;
		}
}