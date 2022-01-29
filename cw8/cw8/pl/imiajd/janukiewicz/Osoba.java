package pl.imiajd.janukiewicz;
import java.time.*;

public class Osoba {

    public String[] imiona;
    public LocalDate dataUrodzenia;
    public boolean plec;

    public Osoba(String[] imiona, LocalDate dataUrodzenia, boolean plec){
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String[] getImiona() {
        return this.imiona;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }
    public String getPlec(){
        if(this.plec = true) {
            return "M";
        }
        else{
            return "F";
        }
    }
}
