package cw2;

import java.util.Scanner;

public class Zad1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb w ciagu: ");
        int n = in.nextInt();
        System.out.println("Podaj liczby: ");
        int[] liczby = new int[n];
        int[] liczby2 = new int[n];

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = in.nextInt();
        }

        int pierwsza = liczby[0];
        for(int i = 0; i<=liczby.length-2; i++) {
            liczby2[i] = liczby[i+1];
        }
        liczby2[liczby2.length-1] = pierwsza;
        for(int i = 0; i <=liczby2.length-1; i++){
            System.out.println(liczby2[i]);
        }
    }
}
