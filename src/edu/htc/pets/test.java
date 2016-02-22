package edu.htc.pets;
public class test {

    public static void main(String[] args) {
        Cat catArray[] = new Cat[3];

        Cat catOne = new Cat();
        catOne.setAge(1);
        catOne.setName("Brian");
        catArray[0] = catOne;

        Cat catTwo = new Cat();
        catTwo.setAge(2);
        catTwo.setName("Carolyn");
        catArray[1] = catTwo;

        Cat catThree = new Cat();
        catThree.setAge(8);
        catThree.setName("Tres");
        catArray[2] = catThree;

        System.out.println("Displaying Cat Information");
        int i;
        int i1;
        for (i = 0; i < 3; i = i + 1)
        {
            i1 = i + 1;
            System.out.println("Cat " + i1 + "'s name is " + catArray[i].getName());
            System.out.println("Their age is " + catArray[i].getAge());
            System.out.println("And their age in cat years is " + catArray[i].getHumanAge());
        }

        Dog dogArray[] = new Dog[3];

        Dog dogOne = new Dog("lol");
        dogOne.setAge(1);
        dogArray[0] = dogOne;

        Dog dogTwo = new Dog("why");
        dogTwo.setAge(2);
        dogArray[1] = dogTwo;

        Dog dogThree = new Dog("tho");
        dogThree.setAge(7);
        dogArray[2] = dogThree;

        System.out.println("Displaying dog information");
        for (Dog x : dogArray)
        {
            System.out.println("The dog's name is " + x.getName());
            System.out.println("Their age is " + x.getAge());
            System.out.println("And their age in dog years is " + x.getHumanAge());
        }

        Cat question1 = new Cat();
        question1.setAge(4);
        // You can create a cat and never set their name

        //Dog question2 = new Dog();
        //You can't create a dog without passing an argument to the new object when you declare that it exists due to the constructor

        //catArray[2] = dogThree;
        //The code doesn't compile as they are two different data types, as they are two different classes

        System.out.println(catOne);
        //The object prints as a class @ and then some hexadecimal number
        System.out.println(dogOne);
        //adding the code below in the Dog class overrides the built in toString() method that is used by default,
        //replacing it with one that returns the name property of the object
//        @Override
//        public String toString()
//        {
//            return getName();
//        }
    }
}
