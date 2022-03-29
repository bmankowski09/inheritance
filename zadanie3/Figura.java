package com.company.kurs.dziedziczenie.zadanie3;

public abstract class Figura {

    private String nazwaFigury;

    public Figura(String nazwaFigury) {
        this.nazwaFigury = nazwaFigury;
    }

    public String getNazwaFigury() {
        return nazwaFigury;
    }

    public void setNazwaFigury(String nazwaFigury) {
        this.nazwaFigury = nazwaFigury;
    }

    public abstract double obliczObwod();

    public abstract double obliczPole();

}
