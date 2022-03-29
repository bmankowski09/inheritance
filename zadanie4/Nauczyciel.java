package com.company.kurs.dziedziczenie.zadanie4;

public class Nauczyciel extends Czlowiek{

    private String kolorDziennika;

    public Nauczyciel(String imie, String nazwisko, int wiek, String kolorDziennika) {
        super(imie, nazwisko, wiek);
        this.kolorDziennika = kolorDziennika;
    }

    public String getKolorDziennika() {
        return kolorDziennika;
    }

    public void setKolorDziennika(String kolorDziennika) {
        this.kolorDziennika = kolorDziennika;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "kolorDziennika='" + kolorDziennika + '\'' +
                '}';
    }
}
