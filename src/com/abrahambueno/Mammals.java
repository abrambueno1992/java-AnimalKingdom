package com.abrahambueno;

public class Mammals extends Animals {
    String name;
    int year;

    public Mammals(String name, int year) {
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
}
