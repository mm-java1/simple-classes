package edu.htc.pets;

import com.sun.deploy.util.ReflectionUtil;
import javafx.scene.effect.ReflectionBuilder;
import sun.reflect.ReflectionFactory;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3]; //create empty array #1
        String[] catNames = {"Missy", "Freddy", "Simon"};
        int[] catAge = {2, 9, 20};

        Dog[] dogs = new Dog[3]; //create empty array #1
        String[] dogNames = {"Loki", "Molly", "Herman"};
        int[] dogAge = {10, 17, 1};

        int x;

        //create one cat and set vars #2
        cats[0] = new Cat();
        cats[0].setName(catNames[0]);
        cats[0].setAge(catAge[0]);

        //create 2 more cats #3
        for (x = 1; x < cats.length; x++) {
            cats[x] = new Cat();
            cats[x].setName(catNames[x]);
            cats[x].setAge(catAge[x]);
        }

        System.out.println("Cat age calculation"); // message displaying cat #4
        System.out.println("-------------------");
        for (x = 0; x < cats.length; x++) {
            double humanAge = cats[x].getHumanAge(); //calc human age
            System.out.println(cats[x].getName() + " is " + cats[x].getAge() + " cat years old and " +
                    humanAge + " human years old."); // print cat details #5
        }
        System.out.println();

        //create one dog #2
        dogs[0] = new Dog(dogNames[0]); //create dog with name
        dogs[0].setAge(dogAge[0]);

        //create 2 additional dogs #3
        for (x = 1; x < dogs.length; x++) {
            dogs[x] = new Dog(dogNames[x]);
            dogs[x].setAge(dogAge[x]);
        }

        System.out.println("Dog age calculation"); //display dog info #4
        System.out.println("-------------------");
        for (x = 0; x < dogs.length; x++) {
            double humanAge = dogs[x].getHumanAge(); //calc human age
            System.out.println(dogs[x].getName() + " is " + dogs[x].getAge() + " dog years old and " +
                    humanAge + " human years old."); //print dog details #5
        }
        //### Code Questions
//        Answer the following questions using comments in your code.  Write code to show that you tried to do these
//        things (comment it out if it doesn't compile). Use comments to explain what you found.
//
//        1. Can you create a Cat without a name?
        //  ****YES**** as it will default to null
        Cat cat1 = new Cat();
        System.out.println("\ncat1 has a name that is " + cat1.getName());

//        2. Can you create a Dog without giving it a name?
        // ****NO**** as the constructor is expecting a name
//            Dog dog2 = new Dog();

////      3. What happens if you try to put a dog in the cat array?  Does it compile?  Does the code run?
        // ****NO**** object types differ so you can't put dog in cat array; no compile no run
//            Dog dog3 = new Dog("Spot");
//            Cat[] cat3 = new Cat[3];
//            cat3[0] = new Dog("Friskey");


//        4. What does a Cat or Dog object look like if you print it?  (Extra: Can you figure out how to make it print pretty?)


        Dog dog4 = new Dog("Friskey");
        dog4.setAge(15);
        //without override the object prints as: edu.htc.pets.Dog@74a14482
        //the following prints object pretty as the Dog class overrides toString() method
        System.out.println(dog4);
    }
}
