import java.util.ArrayList;
import java.util.Scanner;

public class Get_kpc {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> words=getKPC(str);
        System.out.println(words);
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==1){
            ArrayList<String> base=new ArrayList<>();
            String code=codes[Integer.parseInt(str)];
            for(int i=0; i<code.length(); i++){
                String ch=code.substring(i,i+1);
                base.add(ch);
            }
            return base;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String> rres=getKPC(roq);
        ArrayList<String> ans=new ArrayList<>();
        int n=ch-'0';
        String s=codes[n];
        for(int i=0; i<s.length(); i++){
            char mych=s.charAt(i);
            for(String p: rres){
                ans.add(mych+p);
            }
        }
        return ans;
    }
}
