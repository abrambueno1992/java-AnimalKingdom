package com.abrahambueno;

public class AnimalsFromBirds extends AbstractAnimals implements Animals {
    private String name;
    private int year;

    public AnimalsFromBirds( String name, int year, int id) {
        super(id);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String breath() {
        return null;
    }

    @Override
    public String reproduce() {
        return null;
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
    public String toString() {
        return "AnimalsFromBirds{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }
}
