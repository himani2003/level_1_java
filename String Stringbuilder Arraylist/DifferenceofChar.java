// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1
import java.util.Scanner;
public class DifferenceofChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str.substring(0,1));
        for(int i=1; i<str.length(); i++){
            int diff=str.charAt(i)-str.charAt(i-1);
            sb.append(diff);
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
