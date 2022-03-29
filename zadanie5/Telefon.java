package com.company.kurs.dziedziczenie.zadanie5;

public class Telefon {
    private String nazwa;
    private String cena;
    private String firma;
    private String typLadowarki;

    public Telefon(String nazwa, String cena, String firma, String typLadowarki) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.firma = firma;
        this.typLadowarki = typLadowarki;
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

    public String getTypLadowarki() {
        return typLadowarki;
    }

    public void setTypLadowarki(String typLadowarki) {
        this.typLadowarki = typLadowarki;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "cena='" + cena + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", firma='" + firma + '\'' +
                ", typLadowarki='" + typLadowarki + '\'' +
                '}';
    }
}
