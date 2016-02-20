package edu.htc.pets;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        //Create cats in an array
        Cat[] cats = new Cat[3];

        Cat Princess = new Cat();
        Princess.setCatName("Princess");
        Princess.setCatAge(15);

        Cat Mario = new Cat();
        Mario.setCatName("Mario");
        Mario.setCatAge(4);

        Cat Luigi = new Cat();
        Luigi.setCatName("Luigi");
        Luigi.setCatAge(2);


        cats[0] = Princess;
        cats[1] = Mario;
        cats[2] = Luigi;
        System.out.println("Here is the information on the cats:");

        for (int x = 0; x < 3; x++) {
            double ca = cats[x].getCatAge();
            String cn = cats[x].getCatName();
            double ch = cats[x].calculateCatHumanAge(ca);
            System.out.println(cn + " the cat is " + ca + " years old in cat years.");
            System.out.println("This cat is " + ch + " years old in human years.");
        }

        System.out.println();

        //Create dogs in an array
        Dog[] dogs = new Dog[3];

        Dog Bowser = new Dog("Bowser");
        Bowser.setDogAge(3);

        Dog Goomba = new Dog("Goomba");
        Goomba.setDogAge(12);

        Dog Boo = new Dog("Boo");
        Boo.setDogAge(1);

        dogs[0] = Bowser;
        dogs[1] = Goomba;
        dogs[2] = Boo;

        System.out.println("Here is the information on the dogs:");
        for (Dog y :dogs){
            double da = y.getdogAge();
            String dn = y.getDogName();
            double dh = y.calculateDogHumanAge(da);
            System.out.println(dn + " the dog is " + da + " years old in dog years.");
            System.out.println("This dog is " + dh + " years old in human years.");
        }

        System.out.println();

        //Additional questions:

        //Can you create a Cat without a name? Yes

        Cat Noname = new Cat();

        //Can you create a Dog without giving it a name? No, the constructor requires a name.

        //Dog Nameless = new Dog();

        //What happens if you try to put a dog in the cat array? Does it compile? Does the code run?
        //The code does not compile as the array was compiled for type Cat.
        //Error:(77, 19) java: incompatible types: edu.htc.pets.Dog cannot be converted to edu.htc.pets.Cat
        //cats[0] = Bowser;

        //What does a Cat or Dog object look like if you print it? (Extra: Can you figure out how to make it print pretty?)
        //The memory location is printed.
        System.out.println(Princess);
        //edu.htc.pets.Cat@74a14482

        // I read several things about toString() but found it was easier just to add a method within the class to print the object

        Princess.printCat();






    }
}




