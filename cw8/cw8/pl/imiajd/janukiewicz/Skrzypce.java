package pl.imiajd.janukiewicz;
import java.time.*;

public class Skrzypce extends Instrument{

    public Skrzypce (String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "skrzypce";
    }
}
