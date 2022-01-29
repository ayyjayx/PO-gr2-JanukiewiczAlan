package pl.imiajd.janukiewicz;

import java.util.Arrays;

public interface IntSequence {
    boolean hasNext();
    int next();
    static void of(int[] n){
//        for (Integer i : n){
//            System.out.print(i + ", ");
//        }
//        int x = 0;
//        while (x<1000){
//            x++;
//            System.out.print("1, ");
//        }
        class Sequence{
            int[] seq;

            public Sequence(int [] seq){
                this.seq = seq;
            }

            public int[] getSeq(){
                return seq;
            }
        }
    }
}
