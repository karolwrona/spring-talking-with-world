package pl.edu.wszib.springtalkingwithworld.configuration.model;

public class Restauracja {
    public static double koszt(Klient klient ) {
        double wynik = 25;
        if (klient.osobaTowarzyszaca) {
            wynik += 15;
        }
        if (klient.dziecko) {
            wynik += 25;
        }
        if (klient.zwierze) {
            wynik += 125;
        }
    return wynik;
    }
}
