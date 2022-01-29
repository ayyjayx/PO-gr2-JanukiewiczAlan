package pl.imiajd.janukiewicz;

import java.util.*;
import java.io.*;

public class Zad4 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, HashSet<String>> mapa = new HashMap<>();
        Scanner reader = new Scanner(new File("E:\\ab.txt"));
        reader.useDelimiter(" +");
        while (reader.hasNext()) {
            String slowo = reader.next();
            int kodhash = slowo.hashCode();
            if (!mapa.containsKey(kodhash))
            {
                HashSet<String> newSet = new HashSet<>();
                newSet.add(slowo);
                mapa.put((kodhash), newSet);
            }
            else
            {
                mapa.get(kodhash).add(slowo);
            }
        }
        for (Map.Entry<Integer, HashSet<String>> me : mapa.entrySet()) {
            if (me.getValue().size() > 1) {
                System.out.println(me.getKey() + " : " + (me.getValue()).toString());
            }
        }
    }

}
