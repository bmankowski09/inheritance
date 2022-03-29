package com.company.kurs.dziedziczenie;

public class Marketingowiec extends Osoba {

    private String numerTel;

    public Marketingowiec(String imie, String nazwisko, String adres, String mail, String numerTel) {
        super(imie, nazwisko, adres, mail);
        this.numerTel = numerTel;
    }

    @Override
    public double obliczPensje() {
        return 5000;
    }

    public String getNumerTel() {
        return numerTel;
    }

    public void setNumerTel(String numerTel) {
        this.numerTel = numerTel;
    }

    @Override
    public String toString() {
        return "Marketingowiec: " + getImie() + " " + getNazwisko() +" nr telefonu: " +getNumerTel();
    }
}
