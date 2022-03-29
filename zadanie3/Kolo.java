package com.company.kurs.dziedziczenie.zadanie3;

public class Kolo extends Figura {

    private int srednica;

    public Kolo(String nazwaFigury, int srednica) {
        super(nazwaFigury);
        this.srednica = srednica;
    }


    public int getSrednica() {
        return srednica;
    }

    public void setSrednica(int srednica) {
        this.srednica = srednica;
    }

    @Override
    public double obliczObwod() {
        double srednicaKola = 2* Math.PI * srednica;

        return srednicaKola;
    }

    @Override
    public double obliczPole() {
        double poleKola = Math.PI * (srednica / 2) * (srednica / 2);

        return poleKola;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "srednica=" + srednica +
                '}';
    }
}
