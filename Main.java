

public class Main {
 
     public static void main(String[] args) {
		 
		// cat code
		
		// cat array
		
		Cat[] cat = new Cat[3];
	    String[] catName = {"Wiskers", "Fluffy", "Stubby"};
		int[] catAge = {3, 6, 9};
		
		cat[0] = new Cat();
		cat[0].setName(catName[0]);
		cat[0].setAge(catAge[0]);
		
		cat[1] = new Cat();
		cat[1].setName(catName[1]);
		cat[1].setAge(catAge[1]);
		
		cat[2] = new Cat();
		cat[2].setName(catName[2]);
		cat[2].setAge(catAge[2]);
		
		//Cat Print 
		System.out.println("Cat Information");
		for (int i = 0; i < 3; i++) {
             
        System.out.println(cat[i].getName() + " is " + cat[i].getAge() + " years old in cat years and " + cat[i].getHumanAge() + " years old in Human years.");
                          
        }
	 
		//dog array
		Dog[] dog = new Dog[3];
	    String[] dogName = {"Maggie", "Spike", "Herman"};
		int[] dogAge = {10, 15, 20};
		
		dog[0] = new Dog();
		dog[0].setName(dogName[0]);
		dog[0].setAge(dogAge[0]);
		
		dog[1] = new Dog();
		dog[1].setName(dogName[1]);
		dog[1].setAge(dogAge[1]);
		
		dog[2] = new Dog();
		dog[2].setName(dogName[2]);
		dog[2].setAge(dogAge[2]);
		
		//Dog Print 
		
		System.out.println("Cat Information");
		for (int i = 0; i < 3; i++); {
        System.out.println(dog[i].getName() + " is " + dog[i].getAge() + " years old in dog years and " + dog[i].getHumanAge() + " years old in human years.");
       	}
	 
	 }
}