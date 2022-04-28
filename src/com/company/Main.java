package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pet Doug = new Pet("dog", "Doug", 5, 10, 2020, false);
            System.out.println("Doug is a " + Doug.getBreed() + " and he is " + Doug.getAge() + " years old.");
            System.out.println("Needs restraint? " + Doug.needsRestraint());
        Pet Penny = new Pet("Cat", "Penny", 7, 10, 2016, false);
        

        Pet Max = new Pet(Pet.typeOfAnimal.DOG);
    }
}
