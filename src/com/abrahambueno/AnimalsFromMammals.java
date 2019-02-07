package com.abrahambueno;

public class AnimalsFromMammals extends AbstractAnimals implements Animals {
    private String name;
    private int year;

    @Override
    public String getName() {
        return name;
    }

    public AnimalsFromMammals(String name, int year) {
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
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "AnimalsFromMammals{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }


}
