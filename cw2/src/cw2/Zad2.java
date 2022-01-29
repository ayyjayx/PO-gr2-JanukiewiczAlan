package cw2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zad2 {
    public static void main(String[] args) {
        int licznik = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb w ciagu: ");
        int n = in.nextInt();
        System.out.println("Podaj liczby: ");
        double[] liczby = new double[n];
        //a
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(liczby[i] % 2 == 1)
//                licznik++;
//        }
//        System.out.println(licznik);
        //b
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(liczby[i] % 3 == 0 && liczby[i]%5 != 0)
//                licznik++;
//        }
//        System.out.println(licznik);
        //c
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(sqrt(liczby[i]) % 2 == 0)
//                licznik++;
//        }
//        System.out.println(licznik);
        //d
//        for(int i = 0; i<n; i++) {
//            liczby[i] = in.nextDouble();
//        }
//        for(int i = 1; i<n-1; i++){
//            if(liczby[i] < (liczby[i-1] + liczby[i+1]) / 2)
//                licznik++;
//        }
//        System.out.println(licznik);
        //e
//        int silnia = 1;
//        for (int i = 0; i<n; i++) {
//            liczby[i] = in.nextDouble();
//        }
//        for (int i = 1; i<n; i++) {
//            silnia *= i;
//            if (pow(2, i) <= liczby[i] && liczby[i] <= silnia)
//                licznik++;
//        }
//        System.out.println(licznik);
        //f
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(i+1 % 2 == 1 && liczby[i]%2 == 0)
//                licznik++;
//        }
//        System.out.println(licznik);
        //g
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(liczby[i] % 2 == 1 && liczby[i]>=0)
//                licznik++;
//        }
//        System.out.println(licznik);
        //h
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(abs(liczby[i]) < pow(i, 2))
//                licznik++;
//        }
//        System.out.println(licznik);

        //2.2
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//            if(liczby[i] > 0)
//                licznik+=2*liczby[i];
//        }
//        System.out.println(licznik);
        //2.3
//        int zera = 0, dodatnie = 0, ujemne = 0;
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = in.nextDouble();
//            if(liczby[i] == 0)
//                zera++;
//            if(liczby[i] < 0)
//                ujemne++;
//            if(liczby[i] > 0)
//                dodatnie++;
//        }
//        System.out.println("Zer jest:" + zera + "\nDodatnich jest:" + dodatnie + "\nUjemnych jest:" + ujemne);
        //2.4
//        for(int i = 0; i<n; i++){
//            liczby[i] = in.nextDouble();
//        }
//        double min = liczby[0], max = liczby[0];
//        for(int i = 0; i<n;i++)
//            if(i > 0) {
//                if (liczby[i] > max)
//                    max = liczby[i];
//                if(liczby[i] < min)
//                    min = liczby[i];
//            }
//
//        System.out.println("Najmniejsza liczba to: " + min + ", a najwieksza to: " + max);
        //2.5
        for(int i = 0; i<n; i++){
            liczby[i] = in.nextDouble();

        }
        for(int i = 0; i<n-1;i++){
            if(liczby[i] > 0 && liczby[i+1] > 0)
                licznik++;
        }
        System.out.println(licznik);

    }
}
