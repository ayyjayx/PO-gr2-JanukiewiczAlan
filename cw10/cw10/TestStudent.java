import pl.imiajd.janukiewicz.Osoba;
import pl.imiajd.janukiewicz.Student;

import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent{

    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        LocalDate data1 = LocalDate.of(2001, 9, 10);
        LocalDate data2 = LocalDate.of(2004, 2, 8);
        LocalDate data3 = LocalDate.of(1990, 6, 30);

        grupa.add(new Student("Janukiewicz", data1, 5.3));
        grupa.add(new Student("Nowak", data3, 2.6));
        grupa.add(new Student("Janukiewicz", data2, 3.9));
        grupa.add(new Student("Nowak", data2, 4.6));
        grupa.add(new Student("Kowalski", data2, 4.0));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
