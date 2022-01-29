package pl.imiajd.janukiewicz;
import java.util.*;

public class Zad2 {

    public static void main(String[] args)
    {
        Map<String, String> hm = new TreeMap<String, String>();
        hm.put("Alan", "bdb");
        hm.put("Konrad",   "dst");
        hm.put("Mateusz","dst");
        hm.put("Artur",  "bdb");
        hm.put("Damian",  "dop");

        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        String komenda ="";
        String imie ="";
        String ocena="";
        System.out.print("Dostępne komendy to: zmien, pokaz, zakoncz, dodaj, usun.\n komende: ");
        do{
            komenda = in1.nextLine();
            if (komenda.equals("Zmien")){
                System.out.print("Imie ucznia: ");
                imie=in2.nextLine();
                System.out.print("Nowa ocene ucznia: ");
                ocena=in3.nextLine();
                hm.put(imie,  ocena);
            }
            if (komenda.equals("Usun")){
                System.out.print("Imie ucznia: ");
                imie=in2.nextLine();
                hm.remove(imie);
            }
            if (komenda.equals("Dodaj")){
                System.out.print("Imie ucznia: ");
                imie=in2.nextLine();
                System.out.print("Ocene ucznia: ");
                ocena=in3.nextLine();
                hm.put(imie,  ocena);
            }
            if (komenda.equals("Pokaz")){
                for (Map.Entry<String, String> me :
                        hm.entrySet()) {

                    System.out.print(me.getKey() + ": ");
                    System.out.println(me.getValue());
                }
            }
        }while(!komenda.equals("Zakoncz"));
    }
}
