package pl.imiajd.janukiewicz;
import java.util.*;

public class Zad1 {

    public static void main(String[] args){
        PriorityQueue<listaZadan> kolejka = new PriorityQueue<listaZadan>(10, new TaskList());
        Scanner in = new Scanner(System.in);
        String n = "";
        int priorytet=0;
        String opis="";
        System.out.print("Dostępne komendy to: nastepne, pokaz, zakoncz, dodaj (przy 'dodaj' nalezy wpisac opis i priorytet).\n");
        while (!n.equals("zakoncz"))
        {
            System.out.print("Komenda: ");
            n = in.nextLine();
            if(n.equals("pokaz")){
                if(!kolejka.isEmpty()){
                    System.out.print("Zadanie z najwiekszym priorytetem: ");
                    assert kolejka.peek() != null;
                    System.out.print((kolejka.peek()).getOpis() +"\n");
                }
            }
            if(n.equals("dodaj")){
                System.out.print("Opis: ");
                opis = in.nextLine();
                System.out.print("Priorytet: ");
                priorytet = in.nextInt();
                listaZadan zad4 = new listaZadan(opis, priorytet);
                kolejka.add(zad4);
            }
            if(n.equals("nastepne")){
                System.out.print("Z listy usunieto element o najwiekszym priorytecie.\n");
                kolejka.poll();
            }
        }
    }

}
class TaskList implements Comparator<listaZadan>{
    public int compare(listaZadan s1, listaZadan s2) {
        if (s1.priorytet > s2.priorytet)
            return 1;
        else if (s1.priorytet < s2.priorytet)
            return -1;
        return 0;
    }
}

class listaZadan {
    public String opis;
    public int priorytet;
    public listaZadan(String opis, int priorytet) {
        this.opis = opis;
        this.priorytet = priorytet;
    }
    public String getOpis() {
        return opis;
    }
}
