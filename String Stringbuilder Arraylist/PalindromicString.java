import java.util.Scanner;

// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

public class PalindromicString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String ch=str.substring(i,j);
                if(check(ch)){
                    System.out.println(ch);
                }
            }
        }
    }
    public static boolean check(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
