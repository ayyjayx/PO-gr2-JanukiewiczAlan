package pl.imiajd.janukiewicz;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Zad5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        Stack<String> stack = new Stack<>();
        String s = scanner.nextLine();
        StringBuffer end = new StringBuffer();
        String[] superSplit = s.split("[.]");
        for(int j=0;j<superSplit.length;j++) {
            StringBuffer sb = new StringBuffer();
            String[] split = superSplit[j].split(" ");
            stack.addAll(Arrays.asList(split));
            for (int i = 0; i < split.length; i++) {
                sb.append(stack.pop());
                if (i == 0) {
                    String temp = sb.substring(0, 1).toUpperCase();
                    sb.replace(0, 1, temp);
                }
                if (i == split.length - 1) {
                    String temp = sb.substring(1, sb.length()).toLowerCase();
                    sb.replace(1, sb.length(), temp);
                    if(j == 0) {
                        sb.append(".");
                    }
                    else{
                        sb.replace(sb.length()-1, sb.length(), ".");
                    }
                }
                sb.append(" ");
            }
            end.append(sb);
        }
        System.out.println(end);
    }
}
