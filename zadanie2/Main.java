package com.company.kurs.dziedziczenie.zadanie2;

public class Main {
    public static void main(String[] args) {

        Pies p1 = new Pies("Rambo", "Michal", "Nowak", 5, "owczarek niemiecki", "czarny");
        System.out.println(p1);
        p1.wydajOdglos();

        Lew l1 = new Lew("Kira", "Tomek", "Nowicki", 7, "100kg", "Afrykanski");
        System.out.println(l1);
        l1.wydajOdglos();

        System.out.println();

    }
}
