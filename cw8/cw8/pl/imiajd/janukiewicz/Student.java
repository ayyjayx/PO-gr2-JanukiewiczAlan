package pl.imiajd.janukiewicz;
import java.time.*;

public class Student extends Osoba{

    public double sredniaOcen;

    public Student(String[] imiona, LocalDate dataUrodzenia, boolean plec, double sredniaOcen){
        super(imiona, dataUrodzenia, plec);
        this.sredniaOcen = sredniaOcen;
    }
    public void setSredniaOcen(double nowaSrednia){
        this.sredniaOcen = nowaSrednia;
    }
    public double getSredniaOcen(){
        return this.sredniaOcen;
    }
}
