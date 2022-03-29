package com.company.kurs.dziedziczenie.zadanie3;

public class Prostokat extends Figura {

    private int bokA;
    private int bokB;

    public Prostokat(String nazwaFigury, int bokA, int bokB) {
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
        double obwodProstokatu = 2 * (bokA + bokB);

        return obwodProstokatu;
    }

    @Override
    public double obliczPole() {
        double poleProstokatu = bokA * bokB;

        return poleProstokatu;
    }

}
