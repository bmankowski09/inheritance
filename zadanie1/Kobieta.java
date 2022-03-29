package com.company.kurs.dziedziczenie.zadanie1;

public class Kobieta extends Osoba {

    private String nazwiskoPanienskie;

    public Kobieta(String imie, String nazwisko, int wiek, String adresZamieszkania, String nazwiskoPanienskie) {
        super(imie, nazwisko, wiek, adresZamieszkania);
        this.nazwiskoPanienskie = nazwiskoPanienskie;
    }

    public String getNazwiskoPanienskie() {
        return nazwiskoPanienskie;
    }

    public void setNazwiskoPanienskie(String nazwiskoPanienskie) {
        this.nazwiskoPanienskie = nazwiskoPanienskie;
    }

    @Override
    public String toString() {
        return "Kobieta: " + getImie() + " " + getNazwisko() + " " + "zamieszkala: " + getAdresZamieszkania() + " " +
                "posiada nazwisko panienskie: " + getNazwiskoPanienskie();
    }
}

