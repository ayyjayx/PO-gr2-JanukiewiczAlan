package pl.imiajd.janukiewicz;
import java.util.Stack;

public class Zad6 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        int num = 1234567;
        while(num>0){
            stack.add(num%10);
            num = num/10;
        }
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
