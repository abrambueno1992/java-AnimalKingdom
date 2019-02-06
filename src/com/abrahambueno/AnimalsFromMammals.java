package com.abrahambueno;

public class AnimalsFromMammals extends AbstractAnimals {
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
