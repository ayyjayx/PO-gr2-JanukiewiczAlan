package pl.imiajd.janukiewicz;

import java.util.ArrayList;
import java.time.LocalDate;
import java.math.BigInteger;

public class Zad1 {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> ar){

        for(int i = 0; i <= ar.size()-2; i++){
            if(ar.get(i).compareTo(ar.get(i+1)) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings);
        System.out.println(isSorted(strings));

        ArrayList<BigInteger> big_ints = new ArrayList<BigInteger>();
        big_ints.add(new BigInteger("1"));
        big_ints.add(new BigInteger("2"));
        big_ints.add(new BigInteger("5"));
        System.out.println(big_ints);
        System.out.println(isSorted(big_ints));

        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
        dates.add(LocalDate.of(2000, 1, 1));
        dates.add(LocalDate.of(2000, 1, 4));
        dates.add(LocalDate.of(2000, 1, 3));
        System.out.println(dates);
        System.out.println(isSorted(dates));
    }
}