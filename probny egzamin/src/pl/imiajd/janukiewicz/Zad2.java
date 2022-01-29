package pl.imiajd.janukiewicz;

import javax.sound.midi.Sequence;

public class Zad2 {
    public static void main (String[] args){
//        int[] n = {1, 2, 3, 4, 5, 6, 7, 8};
//        IntSequence.of(n);
        IntSequence sq = squares(2);
        System.out.print(sq.next() + ", ");
    }
    public static IntSequence squares (int n){
        IntSequence sq = new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return n*n;
            }
        };
        return sq;
    }
}
