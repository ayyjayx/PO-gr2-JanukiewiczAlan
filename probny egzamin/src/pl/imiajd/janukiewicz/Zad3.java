package pl.imiajd.janukiewicz;

import java.io.*;
import java.util.ArrayList;

public class Zad3 {
    public static String[] directoryList(String path, String extension){
        ArrayList<String> arrayList = new ArrayList<>();

        File f = new File(path);
        return f.list((dir, name) -> !name.endsWith(extension.toUpperCase()));
    }

    public static void main (String[] args){
        System.out.println(directoryList("C:\\Users\\Alan\\IdeaProjects\\probny egzamin\\src\\pl\\imiajd\\janukiewicz", "java"));
    }
}
