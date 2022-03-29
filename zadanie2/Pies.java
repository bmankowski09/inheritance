package com.company.kurs.dziedziczenie.zadanie2;

public class Pies extends Zwierze{

    private String rasa;
    private String kolorSiersci;

    public Pies(String imie, String imieWlasciciela, String nazwiskoWlasciciela, int wiek, String rasa, String kolorSiersci) {
        super(imie, imieWlasciciela, nazwiskoWlasciciela, wiek);
        this.rasa = rasa;
        this.kolorSiersci = kolorSiersci;
    }

    @Override
    public void wydajOdglos() {
        System.out.println("Haaauuu!");
    }

}
