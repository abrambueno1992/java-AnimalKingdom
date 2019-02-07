package com.abrahambueno;

public class AnimalsFromFish extends AbstractAnimals implements Animals {
    private String name;
    private int year;

    public AnimalsFromFish(String name, int year) {
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
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "AnimalsFromFish{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                ", food='" + food + '\'' +
                '}';
    }
}
