import java.util.Scanner;

public class target_sum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int coins[]=new int[n];
        for(int i=0; i<n; i++){
            coins[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        System.out.println(targetsumsubset(coins, target));
    }
    public static boolean targetsumsubset(int[] coins, int tar){
        boolean mem[][]=new boolean[coins.length+1][tar+1];
        for(int r=0; r<mem.length; r++){
            for(int c=0; c<mem[0].length; c++){
                if(c==0){
                    mem[r][c]=true;
                }else if(r==0){
                    mem[r][c]=false;
                }else{
                    int coin=coins[r-1];
                    int target=c;
                    boolean res=mem[r-1][c]; //exc
                    if(coin<=tar){
                        res=res|| mem[r-1][target-coin]; //inc
                    }
                    mem[r][c]=res;
                }
            }
            if(mem[r][tar]==true){
                return true;
            }
        }
        return false;
    }
}
