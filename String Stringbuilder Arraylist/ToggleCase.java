// 1. There is an agreement document for JSCOP optica but by mistake, the case of every character in the string of document is a toggle so you need to correct it.
// 2. You are given a string of the document that contains only lowercase and uppercase alphabets. 
// 3. You have to toggle the case of every character of the given string.
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                int v1=((ch-'a')+'A');
                char ch1=(char)v1;
                sb.append(ch1);
            }
            else{
                int v2=(ch-'A')+'a';
                char ch2=(char)v2;
                sb.append(ch2);
            }
        }
        System.out.println(sb.toString());
    }
}
