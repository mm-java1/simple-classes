package edu.htc.pets;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        /**In your Main class’s main method, you will create 3 cats and 3 dogs,
         *  put them into an array and use a loop to display information about each animal.
         *  Note that I want you to use a different loop for the cats and the dogs
         */

        /**   Cat code
         Let’s start with the cats.
         1. Create an empty array to hold the Cat objects you will create.
         2. Create a cat, setting it’s name and age, then add it to the array.
         3. Create two more cats, also setting their names and ages, then add each of them to the array.
         4. Print a message to say you are displaying the cat information.
         Set up a regular for loop with a counter to go through the cat array and
         print the cat’s name, age, and then human age.
         Use nice messages so we can tell what you are printing.**/

        Cat[] myCats = new Cat[3];

        //Create a cat, setting it's name and age, then adding it to the cat array
        Cat cat = new Cat("Spooky");
        cat.setAge(1);
        myCats[0] = cat;

        //Create two more cats, also setting their names and ages, then add each of them to the array.
        cat = new Cat("Jake");
        cat.setAge(1.5);
        myCats[1] = cat;

        cat = new Cat("Bean");
        cat.setAge(12);
        myCats[2] = cat;

        //Print a message to say you are displaying
        System.out.println("Cat Information:");
        System.out.println("------------------------------------------------");
        // Set up a regular for loop with a counter to go through the cat array
        // and print the cat's name, age, and then human age.
        for (int i = 0; i < 3; i++) {
            if (myCats[i].getAge() == 1) {
                System.out.println(myCats[i].getName() + " is " + myCats[i].getAge() + " year old in real years.");
            } else {
                System.out.println(myCats[i].getName() + " is " + myCats[i].getAge() + " years old in real years.");
            }
            System.out.println(myCats[i].getName() + " is " + myCats[i].getHumanAge() + " years old in cat years.");
            System.out.println("***");
        }

        /**Dog code
         Now it’s time for the dogs.
         1. Create an empty array to hold the Dog objects you will create.
         2. Create a dog, setting it’s name and age, then add it to the array.
         3. Create two more dogs, also setting their names and ages, then add each of them to the array.
         4. Print a message to say you are displaying the dog information.
         Set up a for-each or an enhanced for loop to go through the dog array
         and print the dog’s name, age, and then human age.
         Use nice messages so we can tell what you are printing.**/

        Dog[] myDogs = new Dog[3];

        //Create a dog, setting it's name and age, then adding it to the dog array
        Dog dog = new Dog("Sadie");
        dog.setAge(12);
        myDogs[0] = dog;

        // Create two more dogs, also setting their names and ages, then add each of them to the array.
        // Take note here, the dog name is set by supplying the parameter.
        dog = new Dog("Roscoe");
        dog.setAge(14);
        myDogs[1] = dog;

        dog = new Dog("Daisy");
        dog.setAge(3);
        myDogs[2] = dog;

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        //Print a message to say you are displaying
        System.out.println();
        System.out.println("Dog Information:");
        System.out.println("------------------------------------------------");

        // Set up a for-each or an enhanced for loop to go through the dog array
        // and print the dog’s name, age, and then human age.
        for (Dog x : myDogs) {
            if (x.getAge() <= 2) {
                System.out.println(x.getName() + " is " + x.getAge() + " year old in real years.");
            } else {
                System.out.println(x.getName() + " is " + x.getAge() + " years old in real years.");
            }
            System.out.println(x.getName() + " is " + x.getHumanAge() + " years old in dog years.");
            System.out.println("***");
        }
        /**CODE QUESTIONS
         Answer the following questions using comments in your code.
         Write code to show that you tried to do these things (comment it out if it doesn’t compile).
         Use comments to explain what you found.

         --------- Question 1
         Can you create a Cat without a name?
         --------- Answer 1 -- yes
         cat[0] = new Cat();
         ---------------------------------------------------------

         --------- Question 2
         Can you create a Dog without giving it a name?
         --------- Answer 2 -- no, the program will not compile
         dog[0] = new Dog();
         Error:(62, 18) java: constructor Dog in class edu.htc.pets.Dog cannot be applied to given types;
         required: double,java.lang.String
         found: no arguments
         reason: actual and formal argument lists differ in length
         ---------------------------------------------------------

         --------- Question 3
         What happens if you try to put a dog in the cat array? Does it compile? Does the code run?
         --------- Answer 3 -- Program will not compile.
         cat[0] = new Dog();
         Error:(25, 18) java: incompatible types: edu.htc.pets.Dog cannot be converted to edu.htc.pets.Cat
         ---------------------------------------------------------

         ---------- Question 4
         What does a Cat or Dog object look like if you print it?
         ---------- Answer 4 -- This the output is a weird string
         edu.htc.pets.Cat@74a14482
         ---------------------------------------------------------
         **/

        System.out.println("Just printing an object prints this weird string.");
        System.out.println("edu.htc.pets.Cat@74a14482");
        System.out.println();

        /**(Extra: Can you figure out how to make it print pretty?)**/
        System.out.println("Adding a custom toString method give this result.");
        System.out.println("Printing the Dogs..");
        System.out.println("-----------------------------------");

        System.out.print(myDogs[0]);
        System.out.println();
        System.out.println();
        System.out.println("Printing the Cats..");
        System.out.println("-----------------------------------");
        System.out.print(myCats[0]);

        //New  stuff
        Pet[] myPets = new Pet[6];
        myPets[0] = myCats[0];
        myPets[1] = myCats[1];
        myPets[2] = myCats[2];
        myPets[3] = myDogs[0];
        myPets[4] = myDogs[1];
        myPets[5] = myDogs[2];

        for (Pet current : myPets) {
            System.out.println("\n\nPet " + current.getName() + " is " + current.getAge()
                    + " which is " + current.getHumanAge() + " human years.");
            //If I'm a dog, print my trick
            if (current instanceof Dog) {
                Dog curDog = (Dog) current;
                curDog.getTrickName();
            }

            //This causes an error when we hit our first Dog object - always check using instanceof before casting
            //Cat curCat = (Cat)current;
        }

        Pet somePet = myPets[3];
        // Can't do this.  Only Dog objects have getTrickName method
        //somePet.getTrickName();

        //Make a generic Pet
        System.out.println();
        // Can't do this now that the Pet class is abstract
        //System.out.println("Printing the generic Pet: ");
        //Pet something = new Pet("Mystery Pet");
        //System.out.println(something);
        System.out.println();

        //Put the Pets into an ArrayList of Pets
        ArrayList<Pet> petList = new ArrayList<Pet>();

        for (Pet myPet : myPets) {
            petList.add(myPet);
        }

        //Now what happens when we take things out?
        Pet anotherPet = petList.get(0);

        // Java wont let me do this, the object might not be a pet
        //Pet yetAnotherPet = petList.get(0);

        //But if I am sure that it is really a Pet I can cast it to a Pet object
        Pet yetAnotherPet = (Pet) petList.get(0);


    }
}

