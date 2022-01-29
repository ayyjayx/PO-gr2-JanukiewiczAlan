package pl.imiajd.janukiewicz;
import java.time.*;

public class Fortepian extends Instrument{

    public Fortepian(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "fortepian";
    }
}
