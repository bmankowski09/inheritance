package com.company.kurs.dziedziczenie.zadanie5;

public class Tablet {
    private String nazwa;
    private String cena;
    private String firma;
    private int liczbaPrzyciskow;

    public Tablet(String nazwa, String cena, String firma, int liczbaPrzyciskow) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.firma = firma;
        this.liczbaPrzyciskow = liczbaPrzyciskow;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public int getLiczbaPrzyciskow() {
        return liczbaPrzyciskow;
    }

    public void setLiczbaPrzyciskow(int liczbaPrzyciskow) {
        this.liczbaPrzyciskow = liczbaPrzyciskow;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "cena='" + cena + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", firma='" + firma + '\'' +
                ", liczbaPrzyciskow=" + liczbaPrzyciskow +
                '}';
    }
}
