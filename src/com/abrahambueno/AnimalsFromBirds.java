package com.abrahambueno;

public class AnimalsFromBirds extends AbstractAnimals implements Animals {
    private String name;
    private int year;

    public AnimalsFromBirds( String name, int year) {
//        super(id);
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

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "soon";
    }

    @Override
    public String toString() {
        return "AnimalsFromBirds{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                ", food='" + food + '\'' +
                '}';
    }
}
