import pl.imiajd.janukiewicz.*;
import java.time.*;

public class TestOsoba {
    public static void main(String[] args){
        String[] names = new String[2];
        names[0] = "Alan";
        names[1] = "Kacper";
        LocalDate narodziny = LocalDate.of(2002, 9, 6);
        LocalDate zatrudnienie = LocalDate.of(2021, 12, 7);

        Student s = new Student(names,narodziny,true,4.9);
        System.out.println(s.getImiona()[0]);
        System.out.println(s.getPlec());
        System.out.println(s.getSredniaOcen());
        s.setSredniaOcen(3.2);
        System.out.println(s.getSredniaOcen());

        Pracownik p = new Pracownik(names, narodziny, true, zatrudnienie);
        System.out.println(p.getImiona()[1]);
        System.out.println(p.getPlec());
        System.out.println(p.getDataZatrudnienia());
    }

}