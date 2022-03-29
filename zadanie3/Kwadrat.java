package com.company.kurs.dziedziczenie.zadanie3;

public class Kwadrat extends Figura {

    private int bokA;
    private int bokB;

    public Kwadrat(String nazwaFigury, int bokA, int bokB) {
        super(nazwaFigury);
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    @Override
    public double obliczObwod() {
        double obwodKwadratu = 2 * (bokA + bokB);

        return obwodKwadratu;
    }

    @Override
    public double obliczPole() {
        double poleKwadratu = bokA * bokB;

        return poleKwadratu;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                '}';
    }
}
