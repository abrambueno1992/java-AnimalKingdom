package com.abrahambueno;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Mammals panda = new Mammals("Panda", 1869);
	    Mammals zebra = new Mammals("Zebra", 1778);
	    Mammals koala = new Mammals("Koala", 1816);
	    Mammals sloth = new Mammals("Sloth", 1804);
	    Mammals armadillo = new Mammals("Armadillo", 1758);
	    Mammals raccoon = new Mammals("Raccoon", 1758);
	    Mammals bigfoot = new Mammals("Bigfoot", 2021);

        ArrayList<AbstractAnimals> animalList = new ArrayList<AbstractAnimals>();
        animalList.add(new AnimalsFromMammals("Panda", 1869));
        animalList.add(new AnimalsFromMammals("Panda", 1869));
        animalList.add(new AnimalsFromMammals("Panda", 1869));
        animalList.add(new AnimalsFromMammals("Panda", 1869));
        animalList.add(new AnimalsFromMammals("Panda", 1869));
        animalList.add(new AnimalsFromMammals("Panda", 1869));
        animalList.add(new AnimalsFromMammals("Panda", 1869));
    }
}
