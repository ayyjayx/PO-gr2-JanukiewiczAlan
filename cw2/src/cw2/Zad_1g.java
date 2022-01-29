package cw2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zad_1g {
    public static void main(String[] args) {
        double wynik = 0;
        int silnia = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb w ciagu: ");
        int n = in.nextInt();
        System.out.println("Podaj liczby: ");
        double[] liczby = new double[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = in.nextDouble();
            wynik += (pow(-1, n + 1) * liczby[i]);
        }
        for(int i = 0; i<=liczby.length-1; i++) {
            silnia*=i + 1;
            wynik+=(pow(-1, i) * liczby[i]) / silnia;
        }
        System.out.println(wynik);
    }
}