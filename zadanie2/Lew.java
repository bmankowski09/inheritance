package com.company.kurs.dziedziczenie.zadanie2;

public class Lew extends Zwierze{

    private String waga;
    private String gatunek;

    public Lew(String imie, String imieWlasciciela, String nazwiskoWlasciciela, int wiek, String waga, String gatunek) {
        super(imie, imieWlasciciela, nazwiskoWlasciciela, wiek);
        this.waga = waga;
        this.gatunek = gatunek;
    }

    @Override
    public void wydajOdglos() {
        System.out.println("Raaauuu!");

    }

}
