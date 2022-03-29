package com.company.kurs.dziedziczenie.zadanie1;

public class Mezczyzna extends Osoba {

    private int rokOdbyciaSluzbyWojskowej;

    public Mezczyzna(String imie, String nazwisko, int wiek, String adresZamieszkania, int rokOdbyciaSluzbyWojskowej) {
        super(imie, nazwisko, wiek, adresZamieszkania);
        this.rokOdbyciaSluzbyWojskowej = rokOdbyciaSluzbyWojskowej;
    }

    public int getRokOdbyciaSluzbyWojskowej() {
        return rokOdbyciaSluzbyWojskowej;
    }

    public void setRokOdbyciaSluzbyWojskowej(int rokOdbyciaSluzbyWojskowej) {
        this.rokOdbyciaSluzbyWojskowej = rokOdbyciaSluzbyWojskowej;
    }

    @Override
    public String toString() {
        return "Mezczyzna: " + getImie()+ " " + getNazwisko() + " " + "zamieszkaly: " + getAdresZamieszkania() + " "+
                "odbyl sluzbe wojskowa w roku: " + getRokOdbyciaSluzbyWojskowej();
    }
}
