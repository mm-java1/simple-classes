package edu.htc.pets;

public class Main {

    public static void main(String[] args) {
        //creates a Cat array of 3 elements and links it to reference variable cat

        Cat catlist[] = new Cat[3];
        Cat firstCat = new Cat();
        firstCat.setName("Molly");
        firstCat.setAge(2);
        catlist[0] = firstCat;

        Cat secondCat = new Cat();
        secondCat.setName("Bailey");
        secondCat.setAge(5);
        catlist[1] = secondCat;

        Cat thirdCat = new Cat();
        thirdCat.setName("Oreo");
        thirdCat.setAge(10);
        catlist[2] = thirdCat;

        System.out.println("Diplaying cat Information");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name of the cat is " + catlist[i].getName());
            System.out.println("Age of the cat is " + catlist[i].getAge());
            System.out.println("Human Age of the cat is " + catlist[i].calculateCatHumanAge());
            System.out.println();
        }



        Dog doglist[] = new Dog[3];
        Dog firstDog = new Dog("Lucy");
        firstDog.setDogAge(4);
        doglist[0] = firstDog;

        Dog secondDog = new Dog("Max");
        secondDog.setDogAge(10);
        doglist[1] = secondDog;

        Dog thirdDog = new Dog("Buddy");
        thirdDog.setDogAge(2);
        doglist[2] = thirdDog;

        System.out.println("Diplaying Dog Information");

        for (Dog dog: doglist) {
            System.out.println("cat object is " + firstCat);
            System.out.println("dog object is " + thirdDog);
            System.out.println("Name of the dog is " + dog.getDogName());
            System.out.println("Age of the dog is " + dog.getDogAge());
            System.out.println("Human Age of the dog is " + dog.calculateDogHumanAge());
            System.out.println();
        }

    }

        
    }


    /*1.Can you create a Cat without a name?
        Yes. It would be null.

    /* 2. Can you create a Dog without giving it a name?
          No. The constructor requires a name.
              Error:(36, 24) java: constructor Dog in class edu.htc.pets.Dog cannot be applied to given types;
  required: java.lang.String
  found: no arguments
  reason: actual and formal argument lists differ in length */

    /*3.What happens if you try to put a dog in the cat array? Does it compile? Does the code run?

        Error:(22, 18) java: incompatible types: edu.htc.pets.Dog cannot be converted to edu.htc.pets.Cat
     */

    /* 4.What does a Cat or Dog object look like if you print it? (Extra: Can you figure out how to make it print pretty?)
        cat object is edu.htc.pets.Cat@74a14482
        dog object is edu.htc.pets.Dog@1540e19d
     */