package com.company.kurs.dziedziczenie.zadanie5;

public class Komputer {
    private String nazwa;
    private String firma;
    private String cena;
    private String procesor;

    public Komputer(String nazwa, String firma, String cena, String procesor) {
        this.nazwa = nazwa;
        this.firma = firma;
        this.cena = cena;
        this.procesor = procesor;
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

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "cena='" + cena + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", firma='" + firma + '\'' +
                ", procesor='" + procesor + '\'' +
                '}';
    }
}
