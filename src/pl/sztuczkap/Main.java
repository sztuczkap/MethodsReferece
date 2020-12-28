package pl.sztuczkap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Adam");
        names.add("Mateusz");
        names.add("Ola");

        //names.forEach(name -> System.out.println(name)); // to jest to samo co poniżej:
        names.forEach(System.out::println);

        //sortujemy nasza kolekcje
        // names.sort((n1, n2) -> n1.compareTo(n2)); // to jest to samo co poniżej:
        names.sort(String::compareTo);  // jeżeli Lista byłaby przez List.of to byłaby to niemutowalna kolekcja, więc byłby błąd kompilatora

        //names.forEach(name -> new User(name)); // to jest to samo co poniżej:
        names.forEach(User::new);

        //  BUDOWA:
        //  Klasa::nazwaMetody
        //  Klasa::metodaInstancji
        //  Klasa::metodaStatyczna
        //  Obiekt::metodaInstancji




    }
}
