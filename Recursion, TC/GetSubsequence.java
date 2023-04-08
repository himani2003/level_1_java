import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a string str. 
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences.
public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        String ss=str.substring(1);
        char ch=str.charAt(0);
        ArrayList<String> rres=gss(ss);

        ArrayList<String> mylist=new ArrayList<>();
        //exclude
        for(String s: rres){
            mylist.add(s);
        }
        //include
        for(String s: rres){
            mylist.add(ch+s);
        }
        return mylist;
    }
}
