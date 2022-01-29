package pl.imiajd.janukiewicz;
import java.util.LinkedList;

public class Zad2 {

    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("A");
        nazwiska.add("B");
        nazwiska.add("C");
        nazwiska.add("D");
        nazwiska.add("E");
        System.out.println(nazwiska);
        redukuj(nazwiska, 2);
        System.out.println(nazwiska);
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(10);
        liczby.add(20);
        liczby.add(30);
        liczby.add(40);
        liczby.add(50);
        liczby.add(60);
        System.out.println(liczby);
        redukuj(liczby, 2);
        System.out.println(liczby);
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int counter = 0;
        for(int i=0; i<pracownicy.size();i++){
            counter += 1;
            if(counter == n){
                pracownicy.remove(i);
                counter = 1;
            }
        }
    }
}
