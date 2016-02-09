package edu.htc;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pet Age Calculator \n");

        System.out.println("Cats Info:");

        //Object "Cat" ARRAY
        Cat[] Cat = new Cat[3];
        Cat [0] = new Cat("Thor", 1);
        Cat [1] = new Cat("Hulk", 2);
        Cat [2] = new Cat("HawkEye", 3);

        int i; //COUNTER
        for (i =0; i < 3 ; i++)

        {
            System.out.println(Cat[i].getCatName() + " is " + Cat[i].getCatAge() + " in cat years, which is " + Cat[i].getCatHumanAge() );
        }

        System.out.println("dogArray Info: \n");

        Dog[] dogArray = new Dog[3];
        dogArray[0] = new Dog("Capt", 1);
        dogArray[1] = new Dog("IronMan", 2);
        dogArray[2] = new Dog("Widow", 3);

            //Dog = type; dog = variable name in loop; dogArray = array
            for (Dog dog : dogArray) { //for-enhanced loop
                System.out.println(dog.getDogName() +  " is " + dog.getDogAge() + " in dog years, which is " + dog.getDogHumanAge() );
            }



    }
}