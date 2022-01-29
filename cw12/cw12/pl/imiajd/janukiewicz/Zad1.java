package pl.imiajd.janukiewicz;
import java.util.LinkedList;

public class Zad1 {

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
    }

    public static void redukuj(LinkedList<String> pracownicy, int n){
        int cnt = 0;
        for(int i=0; i<pracownicy.size();i++){
            cnt += 1;
            if(cnt == n){
                pracownicy.remove(i);
                cnt = 1;
            }
        }
    }
}
