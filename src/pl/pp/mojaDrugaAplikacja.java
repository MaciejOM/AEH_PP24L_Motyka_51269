package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

//Zadanie 2.1

double x = 10;

Scanner scanner = new Scanner(System.in);

//wypisanie x
var result = x;
System.out.println("x = " + result);

//wypisanie dwukrotności x
result = x * 2;
System.out.println("x * 2 = " + result);

//wypisanie x^2
result = x*x;
System.out.println("x^2 = " + result);

//Zadanie 2.2

System.out.println("Wpisz swój wiek w latach:");
double wiek = scanner.nextDouble(); //wpisanie wieku
double sekundy = 31556926; //rok w sekundach

//Przeliczenie wieku na sekundy
System.out.println("Twój wiek w sekundach wynosi:" + (wiek * sekundy) + "s");
    }
}
