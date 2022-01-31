package pl.imiajd.janukiewicz;

public class Zad2 {
    public static void main (String[] args){

        IntSequence is = IntSequence.of(3, 1, 4, 1, 5, 9);
        IntSequence sq = IntSequence.squares(3);
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + " ");
        System.out.print(is.next() + "\n");
        System.out.print(sq.next() + " ");
        System.out.print(sq.next() + " ");
        System.out.print(sq.next() + " ");
        System.out.print(sq.next() + " ");
        System.out.print(sq.next() + " ");
        System.out.print(sq.next() + " ");
        System.out.print(sq.next() + " ");
    }
}

