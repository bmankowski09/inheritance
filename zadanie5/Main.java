package com.company.kurs.dziedziczenie.zadanie5;

public class Main {
    public static void main(String[] args) {

      Komputer komputer = new Komputer("laptopik","4500,99","msi","intel i5");
        System.out.println(komputer);
        System.out.println();

        Laptop laptop = new Laptop("Maczek","Apple","9000","Intel i7", "5800amp","19,4");
        System.out.println(laptop);
        System.out.println();

        Telefon telefon = new Telefon("Telefon skladany", "4500", "Motorolla","Typ C");
        System.out.println(telefon);
        System.out.println();

        Tablet tablet = new Tablet("Tablet", "3499,99","Xiaomi",6);
        System.out.println(tablet);
        System.out.println();
    }
}
