package com.abrahambueno;

public abstract class AbstractAnimals {
    int id;
    public abstract String getName();
    public abstract int getYear();

    public AbstractAnimals(int id) {
        this.id = id;
    }
}
