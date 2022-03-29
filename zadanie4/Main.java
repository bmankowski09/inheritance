package com.company.kurs.dziedziczenie.zadanie4;

public class Main {
    public static void main(String[] args) throws Exception {

        Uczen uczen1 = new Uczen("Darek", "Pieczarek", 20);
        Uczen uczen2 = new Uczen("Michal", "Michalowicz", 30);
        Nauczyciel nauczyciel = new Nauczyciel("Natalia", "Nowak",37,"Czerwony");
        Dyrektor dyrektor = new Dyrektor("Tomasz", "Nowicki", 45,"Batorego 4");

//        Uczen.getUczniowieWSystemie().forEach(System.out::println);

        Szkola szkola1 = new Szkola("szkola1", "Batorego 4");
        Szkola szkola2 = new Szkola("szkola2", "Nowaka 4");

        System.out.println();
        System.out.println();

        szkola1.dodajUczniaDoSzkoly(uczen1);
        szkola2.dodajUczniaDoSzkoly(uczen2);

        szkola1.getListaUczniow().forEach(System.out::println);

    }
}
