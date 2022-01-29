import pl.imiajd.janukiewicz.*;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestInstrument {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        LocalDate data1 = LocalDate.of(1989, 4, 19);
        LocalDate data2 = LocalDate.of(2004, 8, 2);
        LocalDate data3 = LocalDate.of(2013, 12, 31);

        orkiestra.add(new Flet("Prod 1", data1));
        orkiestra.add(new Fortepian("Prod 1", data1));
        orkiestra.add(new Fortepian("Prod 2", data2));
        orkiestra.add(new Skrzypce("Prod 2", data2));
        orkiestra.add(new Skrzypce("Prod 3", data3));
        orkiestra.add(new Flet("Prod 1", data1));
        orkiestra.add(new Flet("Prod 2", data2));

        System.out.println(orkiestra.get(0).dzwiek());
        System.out.println(orkiestra.get(1).dzwiek());
        System.out.println(orkiestra.get(2).dzwiek());
        System.out.println(orkiestra.get(3).dzwiek());
        System.out.println(orkiestra.get(4).dzwiek());
        System.out.println(orkiestra);
    }
}