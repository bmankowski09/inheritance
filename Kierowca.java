package com.company.kurs.dziedziczenie;

public class Kierowca extends Osoba {

    private String kategoriaPrawaJazdy;

    public Kierowca(String imie, String nazwisko, String adres, String mail, String kategoriaPrawaJazdy) {
        super(imie, nazwisko, adres, mail);
        this.kategoriaPrawaJazdy = kategoriaPrawaJazdy;
    }

    @Override
    public double obliczPensje() {
        return 4500;
    }

    public String getKategoriaPrawaJazdy() {
        return kategoriaPrawaJazdy;
    }

    public void setKategoriaPrawaJazdy(String kategoriaPrawaJazdy) {
        this.kategoriaPrawaJazdy = kategoriaPrawaJazdy;
    }

    public String toString() {
        return "Kierowca : " + getImie() + " " + getNazwisko() + " posiada prawo jazdy kategorii " + kategoriaPrawaJazdy;
    }
}
