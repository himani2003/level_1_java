import java.util.HashMap;
import java.util.Scanner;
public class Highest_freq_char {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String exp=scn.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        int frq=1;
        // int max=Integer.MIN_VALUE;
        // for(int i=0; i<exp.length(); i++){
        //     if(hm.containsKey(exp.charAt(i))){
        //         frq++;
        //         hm.put(exp.charAt(i),frq);
        //     }else{
        //         frq=1;
        //         hm.put(exp.charAt(i),frq);
        //     }
        //     if(max<hm.get(exp.charAt(i))){
        //         max=hm.get(exp.charAt(i));
        //     }
        // }
        // //printing maximum frequency
        // System.out.println(max);

        //maximum frequency character
        for(int i=0; i<exp.length(); i++){
            if(hm.containsKey(exp.charAt(i))){
                frq++;
                hm.put(exp.charAt(i),frq);
            }else{
                frq=1;
                hm.put(exp.charAt(i),frq);
            }
        }
        int maxfreq=0;
        char mfch=' ';
        for(Character ch:hm.keySet()){
            if(maxfreq<hm.get(ch)){
                maxfreq=hm.get(ch);
                mfch=ch;
            }
        }
        System.out.println(mfch);
    }
}
