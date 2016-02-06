package edu.htc.pets;

public class Main {

    public static void main(String[] args) {
        //cat array and info
        Cat[] Catarray = new Cat[3];
        Cat garfield = new Cat();
        garfield.setAge(10.00);
        garfield.setName("garfield");
        Catarray[0] = garfield;

        Cat joe = new Cat();
        joe.setAge(20.00);
        joe.setName("joe");
        Catarray[1] = joe;

        Cat bill = new Cat();
        bill.setAge(30.00);
        bill.setName("bill");
        Catarray[2] = bill;

        System.out.println("Cat information: ");
        for (int i = 0; i < Catarray.length; i++) {
            Cat cat = Catarray[i];
            System.out.print(cat.getName() + " is " + cat.getAge() + " and is " + cat.calculateCatHumanAge() + " human years old. ");
            System.out.println();
        }
        System.out.print("\n");

        //dog array and info
        Dog[] Dogarray = new Dog[3];
        Dog zoey = new Dog("zoey");
        zoey.setAge(8.00);
        Dogarray[0] = zoey;

        Dog spiderdog = new Dog("spiderdog");
        spiderdog.setAge(15.00);
        Dogarray[1] = spiderdog;

        Dog tanya = new Dog("tanya");
        tanya.setAge(11.00);
        Dogarray[2] = tanya;

        //Catarray[3] = zoey; //incompatible type error, said looking for cat object and found dog

        //Cat myCat = new Cat(); //yes you can create a cat without a name
        //Dog myDog = new Dog();//no you cannot create a dog without a name

        System.out.println("Dog information: ");
        for (int i = 0; i < Dogarray.length; i++) {
            Dog dog = Dogarray[i];
            System.out.print(dog.getName() + " is " + dog.getAge() + " and is " + dog.calculateDogHumanAge() + " human years old. ");
            System.out.println();


        }
        //what happens when you print an object
        //System.out.println(spiderdog); //edu.htc.pets.Dog@a14482 prints when you print an object
    }
}
