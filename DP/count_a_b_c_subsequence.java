import java.util.Scanner;

public class count_a_b_c_subsequence {
    public static int count_dp(String str){
        int[][] mem=new int[3][str.length()];
        int nr=3, nc=mem[0].length;
        for(int c=0; c<nc; c++){
            char ch=str.charAt(c);
            for(int r=0; r<nr; r++){
                if(c==0){
                    if(ch=='a'){
                        mem[0][0]=1;
                        mem[r][c]=0;
                    }else{
                        mem[r][c]=0;
                    }
                }else{
                    if(r==0){
                        if(ch=='a'){
                            mem[r][c]=2*mem[r][c-1]+1;
                        }else{
                            mem[r][c]=mem[r][c-1];
                        }
                    }
                    else if(r==1){
                        if(ch=='b'){
                            mem[r][c]=2*mem[r][c-1]+mem[r-1][c-1];
                        }else{
                            mem[r][c]=mem[r][c-1];
                        }
                    }
                    else{
                        if(ch=='c'){
                            mem[r][c]=2*mem[r][c-1]+mem[r-1][c-1];
                        }else{
                            mem[r][c]=mem[r][c-1];
                        }
                    }
                }
            }
        }
        return mem[2][nc-1];
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int acount=0;
        int abcount=0;
        int abccount=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a'){
                acount=2*acount+1;
            }else if(ch=='b'){
                abcount=2*abcount+acount;
            }else if(ch=='c'){
                abccount=2*abccount+abcount;
            }
        }
        System.out.println(abccount);
    }
}
