package com.company.kurs.dziedziczenie.zadanie1;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String adresZamieszkania;

    public Osoba(String imie, String nazwisko, int wiek, String adresZamieszkania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adresZamieszkania = adresZamieszkania;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", adresZamieszkania='" + adresZamieszkania + '\'' +
                '}';
    }
}
