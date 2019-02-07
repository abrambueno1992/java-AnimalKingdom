package com.abrahambueno;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractAnimals> animalList = new ArrayList<>();

        AnimalsFromMammals panda = new AnimalsFromMammals("Panda", 1869);
	    AnimalsFromMammals zebra = new AnimalsFromMammals("Zebra", 1778);
	    AnimalsFromMammals koala = new AnimalsFromMammals("Koala", 1816);
	    AnimalsFromMammals sloth = new AnimalsFromMammals("Sloth", 1804);
	    AnimalsFromMammals armadillo = new AnimalsFromMammals("Armadillo", 1758);
	    AnimalsFromMammals raccoon = new AnimalsFromMammals("Raccoon", 1758);
	    AnimalsFromMammals bigfoot = new AnimalsFromMammals("Bigfoot", 2021);
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        AnimalsFromBirds pigeon = new AnimalsFromBirds("Pigeon", 1837);
        AnimalsFromBirds peacock = new AnimalsFromBirds("Peacock", 1821);
        AnimalsFromBirds toucan = new AnimalsFromBirds("Toucan", 1758);
        AnimalsFromBirds parrot = new AnimalsFromBirds("Parrot", 1824);
        AnimalsFromBirds swan = new AnimalsFromBirds("Swan", 1758);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        AnimalsFromFish salmon = new AnimalsFromFish("Salmon", 1758);
        AnimalsFromFish catfish = new AnimalsFromFish("Catfish", 1817);
        AnimalsFromFish perch = new AnimalsFromFish("Perch", 1758);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);


//        animalList.forEach((v) -> System.out.println(v.getID()));
//        animalList.forEach((v) -> System.out.println(v.getName() + " " + v.getYear()));
//        animalList.forEach((v) -> System.out.println(v.getFood()));
//        animalList.forEach((v) -> System.out.println(v.move()));
//        animalList.sort((v1, v2) -> v2.getYear() -v1.getYear());
        System.out.println("*****Descending Order by year*****");
        animalList.forEach((v) -> System.out.println(v.getName() + " " + v.getYear()));
        System.out.println("*****Alphabetical Order*****");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalList.forEach((v) -> System.out.println(v.getName() + " " + v.getYear()));
        System.out.println("*****Order by how they move*****");
        animalList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        animalList.forEach((v) -> System.out.println(v.getName() + " " + v.getYear()));
        System.out.println("*****Only animals that breath with lungs");
        animalList.forEach((v1) -> {
            if (v1.breath() == "lungs") {
                System.out.println(v1.getName() + " " + v1.getYear());
            }
        });
        System.out.println("*****Only animals that breath with lungs and were named in 1758");
        animalList.forEach((v1) -> {
            if (v1.breath() == "lungs" && v1.getYear() == 1758) {
                System.out.println(v1.getName() + " " + v1.getYear());
            }
        });
        System.out.println("*****Animals that lay eggs and breath with lungs*****");
        animalList.forEach(v1 -> {
            if (v1.reproduce() == "eggs" && v1.breath() == "lungs") {
                System.out.println(v1.getName() + " " + v1.getYear());
            }
        });

        System.out.println("*****Alphabetical Order and named in the year 1758*****");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalList.forEach(v1 -> {
            if (v1.getYear() == 1758) {
                System.out.println(v1.getName() + " " + v1.getYear());
            }
        });

//        animalList.forEach((v) -> System.out.println(v));
    }
}
