package edu.htc.pets;

public class Main {

    public static void main(String[] args) {
        Cat[] cats=new Cat[3];

        Cat whiskers= new Cat();
        System.out.println("showing nameless cats name "+ whiskers.getCatName());
        whiskers.setCatName("whiskers");
        whiskers.setCatAge(10);
        cats[0]=whiskers;

        Cat hugh= new Cat();
        hugh.setCatName("hugh");
        hugh.setCatAge(4);
        cats[1]=hugh;

        Cat laden= new Cat();
        laden.setCatName("laden");
        laden.setCatAge(2);
        cats[2]=laden;

        System.out.println("showing cats");
        for(int i=0; i<cats.length; i++){
            Cat currentCat=cats[i];
            System.out.println("our cat is " + currentCat.getCatName() + " his age is " + currentCat.getCatAge() + " his human age is " + currentCat.calculateCatHumanAge());
        }

        Dog[] dogs=new Dog[3];

        Dog spot=new Dog("spot");
        spot.setDogAge(7);
        dogs[0]=spot;

        Dog spike=new Dog("spike");
        spike.setDogAge(3);
        dogs[1]=spike;

        Dog ruby=new Dog("ruby");
        ruby.setDogAge(1);
        dogs[2]=ruby;

        System.out.println("showing dogs");
        for (Dog currentDog:dogs){
            System.out.println("our dog is " + currentDog.getDogName() + " his age is " + currentDog.getDogAge() + " his human age is " + currentDog.calculateDogHumanAge());
        }
        System.out.println(whiskers);



    }
}
