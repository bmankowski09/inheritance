package com.company.kurs.dziedziczenie.zadanie4;

import com.company.kurs.obektowosc.agregacja.kompozycja.teoria.Klasa;

import java.util.ArrayList;
import java.util.List;

public class Uczen extends Czlowiek {

    private int numerAlbumu;

    private static int GENERATOR = 120350;

    public static List<Uczen> uczniowieWSystemie = new ArrayList<>();

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
        this.numerAlbumu = GENERATOR;
        GENERATOR++;
        uczniowieWSystemie.add(this);
    }

    private Szkola szkola;

    public int getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(int numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    public static int getGENERATOR() {
        return GENERATOR;
    }

    public static void setGENERATOR(int GENERATOR) {
        Uczen.GENERATOR = GENERATOR;
    }

    public static List<Uczen> getUczniowieWSystemie() {
        return uczniowieWSystemie;
    }

    public Szkola getSzkola() {
        return szkola;
    }

    public void setSzkola(Szkola szkola) {
        this.szkola = szkola;
    }
}
