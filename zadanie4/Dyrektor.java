package com.company.kurs.dziedziczenie.zadanie4;

public class Dyrektor extends Czlowiek {

    private String nazwaSzkolyPodDyrektorstwem;

    public Dyrektor(String imie, String nazwisko, int wiek, String nazwaSzkoly) {
        super(imie, nazwisko, wiek);
        this.nazwaSzkolyPodDyrektorstwem = nazwaSzkoly;
    }

    public String getNazwaSzkoly() {
        return nazwaSzkolyPodDyrektorstwem;
    }

    public void setNazwaSzkoly(String nazwaSzkoly) {
        this.nazwaSzkolyPodDyrektorstwem = nazwaSzkoly;
    }

    @Override
    public String toString() {
        return "Dyrektor{" +
                "nazwaSzkolyPodDyrektorstwem='" + nazwaSzkolyPodDyrektorstwem + '\'' +
                '}';
    }
}
