package com.company.kurs.dziedziczenie.zadanie3;

public class Trojkat extends Figura {

    private int szerokosc;
    private int bokA;
    private int bokB;

    public Trojkat(String nazwaFigury, int szerokosc, int bokA, int bokB) {
        super(nazwaFigury);
        this.szerokosc = szerokosc;
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
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
        double obwodTrojkata = szerokosc + bokA + bokB;

        return obwodTrojkata;
    }

    @Override
    public double obliczPole() {
        double s = (szerokosc + bokA + bokB) / 2;
        double poleTrojkata = Math.sqrt(s * (s - szerokosc) * (s - bokA) * (s - bokB));

        return poleTrojkata;
    }
}
