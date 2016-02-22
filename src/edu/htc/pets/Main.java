package edu.htc.pets;

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

        Cat[] cat = new Cat[3];

        //Create a cat, setting it's name and age, then adding it to the cat array
        cat[0] = new Cat();
        cat[0].setName("Spooky");
        cat[0].setAge(1);

        //Create two more cats, also setting their names and ages, then add each of them to the array.
        cat[1] = new Cat();
        cat[1].setName("Jake");
        cat[1].setAge(1.5);

        cat[2] = new Cat();
        cat[2].setName("Bean");
        cat[2].setAge(12);

        //Print a message to say you are displaying
        System.out.println("Cat Information:");
        System.out.println("------------------------------------------------");
        // Set up a regular for loop with a counter to go through the cat array
        // and print the cat's name, age, and then human age.
        for (int i = 0; i < 3; i++) {
            if ( cat[i].getAge() == 1) {
                System.out.println(cat[i].getName() + " is " + cat[i].getAge() + " year old in real years.");
             }
            else {
                System.out.println(cat[i].getName() + " is " + cat[i].getAge() + " years old in real years.");
           }
            System.out.println(cat[i].getName() + " is " + cat[i].getHumanAge() + " years old in cat years.");
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

        Dog[] dog = new Dog[3];

        //Create a dog, setting it's name and age, then adding it to the dog array
        dog[0] = new Dog("Sadie");
        dog[0].setAge(1);

        // Create two more dogs, also setting their names and ages, then add each of them to the array.
        // Take note here, the dog name is set by supplying the parameter.
        dog[1] = new Dog("Roscoe");
        dog[1].setAge(1.5);

        dog[2] = new Dog("Daisy");
        dog[2].setAge(12);

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        //Print a message to say you are displaying
        System.out.println();
        System.out.println("Dog Information:");
        System.out.println("------------------------------------------------");

        // Set up a for-each or an enhanced for loop to go through the dog array
        // and print the dog’s name, age, and then human age.
        for (Dog x : dog) {
            if (x.getAge() <= 2){
                System.out.println(x.getName() + " is " + x.getAge() + " year old in real years.");
            }
            else{
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
        System.out.println("Printing the Dog object..");
        System.out.println("-----------------------------------");

        System.out.print(dog[0]);
        System.out.println();
        System.out.println();
        System.out.println("Printing the Cat object..");
        System.out.println("-----------------------------------");
        System.out.print(cat[0]);

    }
}
