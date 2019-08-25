import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;
// sprawdzanie, czy podana liczba jest pierwsza

public class Liczby_pierwsze {
    public static void main(String[] args) {
        Scanner czytaj = new Scanner(System.in);
        int sprawdzana = 0;
        sprawdzana = parseInt(czytaj.nextLine());
        boolean czy_pierwsza = true;

        for (int i=2; i<=sqrt(sprawdzana);i++){
            if (sprawdzana%i == 0) {
                czy_pierwsza = false;
                break;
            } else{
                System.out.println(sprawdzana);
            }
        }
        System.out.println("Czy podana liczbajest pierwsza? - wynik:"+czy_pierwsza );

//        int pisz_pierwsza(){
//            System.out.println("  ");
//        }

    }// main()
}
