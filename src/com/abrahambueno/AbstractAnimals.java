package com.abrahambueno;

public abstract class AbstractAnimals implements Animals{
    static int maxID = 0;
    int id;
    String food = "FOOD";
    public abstract String getName();
    public abstract int getYear();
    public abstract int getID();
    public String getFood() {
        return food;
    }

    public AbstractAnimals() {
        id = maxID++;
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
}
