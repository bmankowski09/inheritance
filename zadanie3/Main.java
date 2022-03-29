package com.company.kurs.dziedziczenie.zadanie3;

public class Main {
    public static void main(String[] args) {

        Kolo kolo = new Kolo("Kolo", 10);

        System.out.println(kolo.getNazwaFigury() +" posiada srednice: " + kolo.getSrednica()+"cm" +" Posiada obwod: " + kolo.obliczObwod()+"cm" +" Posiada pole: " + kolo.obliczPole()+"cm2");

        Kwadrat kwadrat = new Kwadrat("Kwadrat", 4,4);

        System.out.println(kwadrat.getNazwaFigury()+" posiada obwod: " + kwadrat.obliczObwod()+"cm" +" Posiada pole: " + kwadrat.obliczPole()+"cm2");

        Prostokat prostokat = new Prostokat("Prostokat",3,7);

        System.out.println(prostokat.getNazwaFigury()+" posiada obwod: " + prostokat.obliczObwod()+"cm" +" Posiada pole: " + prostokat.obliczPole()+"cm2");

        Trojkat trojkat = new Trojkat("Trojkat",15, 10,5);

        System.out.println(trojkat.getNazwaFigury()+" posiada obwod: " + trojkat.obliczObwod()+"cm" +" Posiada pole: " + trojkat.obliczPole()+"cm2");

        double szerokosc = 10;
        double bokA = 5;
        double bokB = 5;

        double s = (szerokosc + bokA + bokB) / 2;
        System.out.println(s);
        double poleTrojkata = Math.sqrt(s * (s - szerokosc) * (s - bokA) * (s - bokB));

        System.out.println(poleTrojkata);

    }
}
