package com.company.kurs.dziedziczenie.zadanie4;
import java.util.ArrayList;
import java.util.List;

public class Szkola {

    private String nazwaSzkoly;
    private String adres;

    public Szkola(String nazwaSzkoly, String adres) {
        this.nazwaSzkoly = nazwaSzkoly;
        this.adres = adres;

    }

    public List<Uczen> listaUczniow = new ArrayList<>();

    public void dodajUczniaDoSzkoly(Uczen uczen) throws Exception {

        if (uczen.getSzkola() != null) {
            throw new Exception("uczen chodzi juz do innej klasy!");
        } else {
            listaUczniow.add(uczen);

            uczen.setSzkola(this);
        }
    }

    public List<Uczen> getListaUczniow() {
        return listaUczniow;
    }

    public String getNazwaSzkoly() {
        return nazwaSzkoly;
    }

    public void setNazwaSzkoly(String nazwaSzkoly) {
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
