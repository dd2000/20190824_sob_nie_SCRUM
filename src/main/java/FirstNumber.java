
// obiekt klasy przechowuje liczbę i pozwala sprawdzić, czy jest to liczba pierwsza

import static java.lang.Math.sqrt;

public class FirstNumber {
    private long liczba;

    //kostruktor
    public FirstNumber(long liczba) {
        this.liczba = liczba;
    } // konstruktor FirstNumber


    // metoda (funkcja) sprawdza, czy liczba jest pierwsza
    public boolean isFirst(long liczba) {
        boolean isFirst = true;
        for (long i = 2; i <= sqrt(liczba); i++) {
            if (liczba % i == 0) {
                isFirst = false;
                break;
            } // if
        } // for
        return isFirst;
    } //isFirst(long liczba)

}// class FirstNumber
