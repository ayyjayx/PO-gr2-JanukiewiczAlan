package pl.imiajd.janukiewicz;
import java.util.LinkedList;

public class Zad4 {

    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("A");
        nazwiska.add("B");
        nazwiska.add("C");
        nazwiska.add("D");
        nazwiska.add("E");
        System.out.println(nazwiska);
        odwroc(nazwiska);
        System.out.println(nazwiska);
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(10);
        liczby.add(20);
        liczby.add(30);
        liczby.add(40);
        liczby.add(50);
        liczby.add(60);
        System.out.println(liczby);
        odwroc(liczby);
        System.out.println(liczby);
    }

    public static <T> void odwroc(LinkedList<T> lista){
        for(int i=0, j = lista.size()-1; i<j; i++){
            lista.add(i, lista.remove(j));
        }
    }
}
