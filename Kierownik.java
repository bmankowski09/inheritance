package com.company.kurs.dziedziczenie;

public class Kierownik extends Osoba {
    private String adresBiura;

    public Kierownik(String imie, String nazwisko, String adres, String mail, String adresBiura) {
        super(imie, nazwisko, adres, mail);
        this.adresBiura = adresBiura;
    }

    @Override
    public double obliczPensje() {
        return 10000;
    }

    public String getAdresBiura() {
        return adresBiura;
    }

    public void setAdresBiura(String adresBiura) {
        this.adresBiura = adresBiura;
    }

    public String toString() {
        return "Kierownik: " + getImie() + " " + getNazwisko() + " adres biura: " + getAdresBiura();
    }
}
