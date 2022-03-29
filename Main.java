package com.company.kurs.dziedziczenie;

public class Main {
    public static void main(String[] args) {

        //  Kierowca(imie, nazwisko, adres, email, kategoriaPrawaJazdy)
        //	Kierownik( imie,  nazwisko,  adres,  email,  adresBiura)
        //  Marketingowiec( imie,  nazwisko,  adres,  email,  numerTel)

        Kierowca k1 = new Kierowca("Karol", "Nowak", "Warszawa", "k.nowak@wp.pl", "B2");

        System.out.println(k1);

        Marketingowiec m1 = new Marketingowiec("Dariusz","Nowak","Poznan 7", "d.nowak@gmail.com","112445778");

        System.out.println(m1);

        Kierownik kier1 = new Kierownik("Michal", "Nowicki", "Opole 4", "m.nowicki@o2.pl", "Szyperska 11");

        System.out.println(kier1);

        for (Osoba o : Osoba.getListaOsob()){
            System.out.println(o.getImie() + " " + o.getNazwisko() + " zarabia " + o.obliczPensje());
        }



        //        Czasami w zadanich nie jest bezpośrednio napisane, żeby stworzyć nadklasę, np Osoba. Trzeba się
//        samemu tego domyślić.

//        1) Stwórz klasy mężczyzna i kobieta. Mężczyzna posiada imię, nazwisko, wiek, adres zamieszkania
//        oraz rok odbycia służby wojskowej. Kobieta ma imię, nazwisko, wiek, adres zamieszkania oraz
//        nazwisko panieńskie. Wykorzystaj dziedziczenie.

//        2) Stwórz klasy kilku zwierząt. Wymyśl pewne atrybuty, które się powtarzają oraz kilka unikalnych. W
//        nad klasie stwórz metodę wydajOdgłos, która w podklasach ma wyświetlać głos danego zwierzęcia
//                (każde zwierze ma inny głos).

//        3) Stwórz klasę Figura, po tej klasie dziedziczy koło prostokąt, trójkąt i kwadrat. Stwórz metody do
//            wyliczenia obwodów i pól figur. analogicznie kwadrat trojkat itp

//        4) Stwórz system zarządzania uczniami i nauczycielami w szkole. Stwórz klasy szkoła, uczeń,
//                nauczyciel, dyrektor. wymysl atrybuty i metody dla każdej z klas. Wyświetl w klasie main obiekty tych
//        klas. Wykorzystaj dziedziczenie. na bazie poprzedniego zadanie z agregacji. czlowiek, dziedziczenia pozniej tych ludzi
//              Klasa szkola bd miala ich przypisane.

//        5) Stwórz klasy telefon, komputer i tablet. Każda z tych klas ma atrybuty cena, nazwa, firma. Wymyśl
//        unikalne dla tych klas. Stwórz dodatkową klasę laptop, która dziedziczy po komputerze, ale ma swoje
//        unikalne atrybuty jak pojemność baterii oraz przekątna ekranu + dodac urzadzenie abstra + komp absra --> dziedziczenie

    }
}
