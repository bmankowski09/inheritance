package com.company.kurs.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public abstract class Osoba {

    private String imie, nazwisko, adres, mail;

    private static List<Osoba> listaOsob = new ArrayList<>();

    public Osoba(String imie, String nazwisko, String adres, String mail) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.mail = mail;

        listaOsob.add(this);
    }

    //metoda abstrakcyjna nie ma cia�a, jest tu tylko po to
    //aby wymusic jej implementacje na podklasach
    public abstract double obliczPensje();


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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static List<Osoba> getListaOsob() {
        return listaOsob;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres='" + adres + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
