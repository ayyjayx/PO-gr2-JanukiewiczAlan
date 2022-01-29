package pl.imiajd.janukiewicz;
import java.time.*;

public class Flet extends Instrument{

    public Flet(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "flet";
    }
}
