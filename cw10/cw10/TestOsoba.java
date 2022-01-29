import pl.imiajd.janukiewicz.Osoba;

import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba{

    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        LocalDate data1 = LocalDate.of(2001, 9, 10);
        LocalDate data2 = LocalDate.of(2004, 2, 8);
        LocalDate data3 = LocalDate.of(1990, 6, 30);

        grupa.add(new Osoba("Janukiewicz", data1));
        grupa.add(new Osoba("Nowak", data3));
        grupa.add(new Osoba("Janukiewicz", data2));
        grupa.add(new Osoba("Nowak", data2));
        grupa.add(new Osoba("Kowalski", data2));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
