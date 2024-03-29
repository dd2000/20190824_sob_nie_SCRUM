
// klasa main: rozłożenie podanej liczby na czynniki (iloczyn liczb pierwszych)
// (***) DOKOńCZYć !!! - badanie nieparzystej i wypisywanie liczby jako iloczynu czynników
// rozszerz zadanie o szukanie NWW dwóch liczb

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class NumberByFirstNumberApp {
    public static void main(String[] args) {

        long readNumber = 0;
        // wczytanie liczby z konsoli
        Scanner input = new Scanner(System.in);
        readNumber = parseLong(input.nextLine());

        FirstNumber xNumber = new FirstNumber(readNumber);
        xNumber.setLiczba(readNumber);
        List<Long> FirstElements = new ArrayList();
        // gdy liczba jest parzysta
        while (xNumber.getLiczba()/2 == 0) {
            // pierwszym czynnkiem będzie 2, drugim wartość [readNumber/2] którą trzeba badać
            FirstElements.add((long)2);
            xNumber.setLiczba(xNumber.getLiczba()/2);
        } // while   ->> wychodząc z while mamy: albo liczbę 1 albo inną nieparzystą
        // teraz badamy otrzymaną nieparzystą (lub 1)

        // (*) tu zmodyfikuj badanie nieparzystej
        if (xNumber.isFirst(xNumber.getLiczba())){
            FirstElements.add((long) xNumber.getLiczba());
        } else {
            while (!xNumber.isFirst(xNumber.getLiczba())){

            } // while
        } // if - else

        // drukuj iloczyn elementów listy => liczbę rozbitą na czynniki
    } // main()

} // class NumberByFirstNumberApp
