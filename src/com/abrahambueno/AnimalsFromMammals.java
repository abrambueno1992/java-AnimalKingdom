package com.abrahambueno;

public class AnimalsFromMammals extends AbstractAnimals  {
    private String name;
    private int year;

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "births";
    }

    public AnimalsFromMammals(String name, int year) {
//        super();
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getID() {
        return id;
    }

//    @Override
//    public String move() {
//        return "walk";
//    }
//
//    @Override
//    public String breath() {
//        return "lungs";
//    }
//
//    @Override
//    public String reproduce() {
//        return "soon";
//    }

    @Override
    public String toString() {
        return "AnimalsFromMammals{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                ", food='" + food + '\'' +
                '}';
    }
}
