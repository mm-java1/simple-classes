package edu.htc;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pet Age Calculator \n");

        System.out.println("Cat Info: \n");

        Cat CatThor = new Cat();
        CatThor.setCatAge(1);

        Cat CatHulk = new Cat();
        CatHulk.setCatAge(2);

        Cat CatHawkEye = new Cat();
        CatHawkEye.setCatAge(3);

        Cat CatIronMan = new Cat();
        CatIronMan.setCatAge(4);

        String CatName[] = {"Thor", "Hulk", "HawkEye", "IronMan"};

//            CatName[0] = "Thor";
//            CatName[1] = "Hulk";
//            CatName[2] = "HawkEye";
//            CatName[3] = "IronMan";

        int CatAge[] = new int[4];
            CatAge[0] = 1;
            CatAge[1] = 2;
            CatAge[2] = 3;
            CatAge[3] = 4;



//        for (int i : CatAge)
//        {
//
//            System.out.println(CatAge[0]);
//
//        }
            System.out.println(CatThor.getCatHumanAge());
            System.out.println(CatName[0] + ", at " + CatAge[0] + " years is " + CatThor.getCatHumanAge() + " in human years.");
            System.out.println(CatName[1] + ", at " + CatAge[1] + " years is " + CatHulk.getCatHumanAge() + " in human years.");
            System.out.println(CatName[2] + ", at " + CatAge[2] + " years is " + CatHawkEye.getCatHumanAge() + " in human years.");
            System.out.println(CatName[3] + ", at " + CatAge[3] + " years is " + CatIronMan.getCatHumanAge() + " in human years. \n");


        System.out.println("Dog Info: \n");

        String DogName[] = {"Capt", "Widow", "Loki", "WarMachine"};

        Dog DogCapt = new Dog();
        DogCapt.setDogAge(1);

        Dog DogWidow = new Dog();
        DogWidow.setDogAge(2);

        Dog DogLoki = new Dog();
        DogLoki.setDogAge(3);

        Dog DogWarMachine = new Dog();
        DogWarMachine.setDogAge(4);

        int DogAge[] = new int[4];
        DogAge[0] = 1;
        DogAge[1] = 2;
        DogAge[2] = 3;
        DogAge[3] = 4;

        System.out.println( DogName[0] + ", at " + DogAge[0] + " years is " + DogCapt.getDogHumanAge() + " in human years.");
        System.out.println( DogName[1] + ", at " + DogAge[1] + " years is " + DogWidow.getDogHumanAge() + " in human years.");
        System.out.println( DogName[2] + ", at " + DogAge[2] + " years is " + DogLoki.getDogHumanAge() + " in human years.");
        System.out.println( DogName[3] + ", at " + DogAge[3] + " years is " + DogWarMachine.getDogHumanAge() + " in human years.");


    }
}