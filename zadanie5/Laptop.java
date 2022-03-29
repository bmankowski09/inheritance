package com.company.kurs.dziedziczenie.zadanie5;

public class Laptop extends Komputer {
    private String pojemnoscBaterii;
    private String przekatnaEkranu;

    public Laptop(String nazwa, String firma, String cena, String procesor, String pojemnoscBaterii, String przekatnaEkranu) {
        super(nazwa, firma, cena, procesor);
        this.pojemnoscBaterii = pojemnoscBaterii;
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public String getPojemnoscBaterii() {
        return pojemnoscBaterii;
    }

    public void setPojemnoscBaterii(String pojemnoscBaterii) {
        this.pojemnoscBaterii = pojemnoscBaterii;
    }

    public String getPrzekatnaEkranu() {
        return przekatnaEkranu;
    }

    public void setPrzekatnaEkranu(String przekatnaEkranu) {
        this.przekatnaEkranu = przekatnaEkranu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "pojemnoscBaterii='" + pojemnoscBaterii + '\'' +
                ", przekatnaEkranu='" + przekatnaEkranu + '\'' +
                '}';
    }
}
