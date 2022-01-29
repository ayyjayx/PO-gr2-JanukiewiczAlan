package pl.imiajd.janukiewicz;
import java.util.LinkedList;

public class Zad3 {

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
    }

    public static void odwroc(LinkedList<String> lista){
        for(int i=0, j = lista.size()-1; i<j; i++){
            lista.add(i, lista.remove(j));
        }
    }
}
