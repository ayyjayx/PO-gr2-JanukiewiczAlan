package pl.imiajd.janukiewicz;
import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;


    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String toString(){
        return this.getClass().getName()+" ["+this.nazwisko+" "+this.dataUrodzenia+"]";
    }
    public boolean equals(Osoba osoba){
        return Objects.equals(this.nazwisko, osoba.nazwisko) && this.dataUrodzenia == osoba.dataUrodzenia;
    }

    public int compareTo(Osoba osoba){
        int result = this.nazwisko.compareTo(osoba.nazwisko);
        if(result != 0){
            return result;
        }
        result = this.dataUrodzenia.compareTo(osoba.dataUrodzenia);
        return result;
    }

}
