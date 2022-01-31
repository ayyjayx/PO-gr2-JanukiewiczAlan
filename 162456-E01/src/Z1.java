import java.time.LocalTime;
import java.util.ArrayList;

public class Z1 {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> ar){

        for (int i=0; i<=ar.size()-2; i++){
            if (ar.get(i).compareTo(ar.get(i+1)) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(2);
        ints.add(5);
        System.out.println(ints);
        System.out.println(isSorted(ints));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");
        System.out.println(strings);
        System.out.println(isSorted(strings));

        ArrayList<LocalTime> times = new ArrayList<>();
        times.add(LocalTime.of(15, 30, 23));
        times.add(LocalTime.of(15, 40, 13));
        times.add(LocalTime.of(16, 30, 4));
        times.add(LocalTime.of(17, 55, 33));
        System.out.println(times);
        System.out.println(isSorted(times));
    }
}
