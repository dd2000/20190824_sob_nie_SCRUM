
// klasa main: rozłożenie podanej liczby na czynniki (iloczyn liczb pierwszych)
// (***) DOKOńCZYć !!! - badanie nieparzystej i wypisywanie liczby jako iloczynu czynników

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
        List<Long> FirstElements = new ArrayList();
        // gdy liczba jest parzysta
        while (readNumber/2 == 0) {
            // pierwszym czynnkiem będzie 2, drugim wartość [readNumber/2] którą trzeba badać
            FirstElements.add((long)2);
            readNumber = (readNumber/2);
        } // while   ->> wychodząc z while mamy: albo liczbę 1 albo inną nieparzystą
        // teraz badamy otrzymaną nieparzystą (lub 1)

    } // main()
} // class NumberByFirstNumberApp
