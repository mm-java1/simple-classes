package edu.htc.pets;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Cat[] cats = new Cat[3];
        String[] catNames = {"Bex", "Lily", "Jolly"};
        double [] catAge = { 3, 7, 15};

        cats[0] = new Cat();
        cats[0].setName(catNames[0]);
        cats[0].setAge(catAge[0]);

        int i;
        for (i = 1; i < cats.length; i++){
            cats[i] = new Cat();
            cats[i].setName(catNames[i]);
            cats[i].setAge(catAge[i]);
        }


        System.out.println();
        System.out.println("Information about the Cats.");
        for (i = 0; i < cats.length; i++){
            double humanAge = cats[i].getCatHumanAge();
            System.out.println(cats[i].getName() + " is " + cats[i].getAge() +
                    " cat years old and " + humanAge + " human years old." );
        }
        System.out.println();


        Dog[] dogs = new Dog[3];
        String[] dogNames = {"Loki", "Molly", "Spot"};
        int[] dogAge = { 5, 15, 3};

        dogs[0] = new Dog();
        dogs[0].setName(dogNames[0]);
        dogs[0].setAge(dogAge[0]);

        for(i = 1; i < dogs.length; i++){
            dogs[i] = new Dog();
            dogs[i].setName(dogNames[i]);
            dogs[i].setAge(dogAge[i]);
        }

        System.out.println("Information about the Dogs.");
        for(i = 0; i < dogs.length; i++){
            double humanAge = dogs[i].getDogHumanAge();
            System.out.println(dogs[i].getName() + " is " + dogs[i].getAge() +
                    " dog years old and " + humanAge + " human years old.");
        }


    }
}
