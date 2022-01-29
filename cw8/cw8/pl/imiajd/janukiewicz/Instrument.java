package pl.imiajd.janukiewicz;
import java.time.*;

public abstract class Instrument {

    public String producent;
    public LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent(){
        return this.producent;
    }

    public LocalDate getRokProdukcji(){
        return this.rokProdukcji;
    }

    public abstract String dzwiek();

    public boolean equals(Instrument n){
        return this == n;
    }

    public String toString(){
        return this.producent + " " + this.rokProdukcji + "\n";
    }
}
