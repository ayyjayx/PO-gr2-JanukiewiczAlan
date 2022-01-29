package cw5;
import java.util.ArrayList;
import java.util.Collections;

public class cw5 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(9);
        lista.add(16);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(9);
        lista2.add(7);
        lista2.add(4);
        lista2.add(9);
        lista2.add(11);


        //Zad1
//        ArrayList<Integer> lista3 = append(lista, lista2);
//        System.out.println(lista3);


        //Zad2
//        ArrayList<Integer> lista4 = merge(lista, lista2);
//
//        for(int i = 0; i < lista4.size(); i++){
//           System.out.println(lista4.get(i));
//        }

        //Zad3
//        ArrayList<Integer> lista5 = mergeSorted(lista, lista2);
//        for(int i = 0; i <=lista5.size()-1; i++) {
//            System.out.println(lista5.get(i));
//        }

        //Zad4
//        ArrayList<Integer> lista6 = reversed(mergeSorted(lista, lista2));
//        for(int i = 0; i <=lista6.size()-1; i++) {
//            System.out.println(lista6.get(i));
//        }

        //Zad5
//        ArrayList<Integer> lista7 = mergeSorted(lista, lista2);
//
//        for(int i = 0; i <=lista7.size()-1; i++) {
//            System.out.println(lista7.get(i));
//        }
//        reverse(lista7);
//        for(int i = 0; i <=lista7.size()-1; i++) {
//            System.out.println(lista7.get(i));
//        }
    }

    //zad1
//    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
//        ArrayList<Integer> lista3 = a;
//        lista3.addAll(b);
//        return lista3;
//    }


    //zad2
//    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
//        ArrayList<Integer> lista = new ArrayList<Integer>();
//        ArrayList<Integer> ktora = new ArrayList<Integer>();
//        int size1 = a.size();
//        int size2 = b.size();
//        int iterator = 0;
//        if(size1 >= size2) {
//            iterator = size2;
//            ktora = a;
//        }
//        if(size2 >= size1) {
//            iterator = size1;
//            ktora = b;
//        }
//
//        for(int i = 0; i<=iterator-1; i++ ){
//            lista.add(a.get(i));
//            lista.add(b.get(i));
//        }
//        for(int i = iterator; i <=ktora.size()-1; i++){
//            lista.add(ktora.get(i));
//        }
//        return lista;
//    }

    //Zad3
//    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
//        ArrayList<Integer> lista = new ArrayList<Integer>();
//        lista = merge(a, b);
//        Collections.sort(lista);
//        return lista;
//    }

    //Zad4
//    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
//        ArrayList<Integer> lista = new ArrayList<Integer>();
//        int[] arr = new int[a.size()];
//        for(int i = 0; i <=a.size()-1; i++){
//            arr[arr.length-i-1] = a.get(i);
//        }
//        for(int i = 0; i <=a.size()-1; i++){
//            lista.add(arr[i]);
//        }
//        return lista;
//    }

    //zad5
//    public static void reverse(ArrayList<Integer> a){
//
//        int[] arr = new int[a.size()];
//        for(int i = 0; i <=a.size()-1; i++){
//            arr[arr.length-i-1] = a.get(i);
//        }
//        for(int i = 0; i <=a.size()-1; i++){
//            a.set(i, arr[i]);
//        }
//    }
}