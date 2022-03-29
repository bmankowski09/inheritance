package com.company.kurs.dziedziczenie.zadanie2;

public abstract class Zwierze {

    private String imie, imieWlasciciela, nazwiskoWlasciciela;
    private int wiek;

    public Zwierze(String imie, String imieWlasciciela, String nazwiskoWlasciciela, int wiek) {
        this.imie = imie;
        this.imieWlasciciela = imieWlasciciela;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
        this.wiek = wiek;
    }
    public abstract void wydajOdglos();


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImieWlasciciela() {
        return imieWlasciciela;
    }

    public void setImieWlasciciela(String imieWlasciciela) {
        this.imieWlasciciela = imieWlasciciela;
    }

    public String getNazwiskoWlasciciela() {
        return nazwiskoWlasciciela;
    }

    public void setNazwiskoWlasciciela(String nazwiskoWlasciciela) {
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Zwierze: " +
                "imie: " + imie + '\'' +
                ", imie wlasciciela: " + imieWlasciciela + '\'' +
                ", nazwiskoWlasciciela: " + nazwiskoWlasciciela + '\'' +
                ", wiek zwierzecia " + wiek + " lat";
    }

}
