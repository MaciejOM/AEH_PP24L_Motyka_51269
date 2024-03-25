package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zadanie 2.1
        /*
        while(true) {
            System.out.println("Wypisz dolną granicę: ");
            int dolna = scanner.nextInt();
            System.out.println("Wypisz górną granicę: ");
            int gorna = scanner.nextInt();

            int suma = 0;
            int dolnap = dolna;

            if (dolna >= gorna) {
                System.out.println("Koniec");
                break;
            }

            while(dolna <= gorna) {
                suma = suma + (dolna*dolna);

                dolna++;

            }

            System.out.println("Suma kwadratów od " + dolnap + " do " + gorna + " wynosi: " + suma);

        }
    */

        //Zadanie 2.2
        while(true) {
            System.out.println("Wybierz opcje:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            var wynik = 0;
            int x;
            int y;
            int opcja = scanner.nextInt();
            switch (opcja) {
                case 1:
                    System.out.println("Podaj dwie liczby: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    wynik = x + y;
                    break;
                case 2:
                    System.out.println("Podaj dwie liczby: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    wynik = x - y;
                    break;
                case 3:
                    System.out.println("Podaj dwie liczby: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    wynik = x * y;
                    break;
                case 4:
                    System.out.println("Podaj dwie liczby: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    wynik = x / y;
                    break;
                default:
                    System.out.println("Podaj poprawny numer: ");
                    continue;
            }
            System.out.println("Wynik: " + wynik);
            break;
        }
    }
}
