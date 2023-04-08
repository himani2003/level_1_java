import java.util.Scanner;

public class Basic_DP {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fib_rec(n));
        System.out.println(fib_mem(n,new int[n+1]));
        System.out.println(fib_tab(n));
        System.out.println(fib_opt_tab(n));
    }
    public static int fib_rec(int n){
        if(n==0 || n==1) return n;
        return fib_rec(n-1)+fib_rec(n-2);
    }
    public static int fib_mem(int n, int[] mem){
        if(n==0 || n==1){
            return mem[n]=n;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        int ans=fib_mem(n-1,mem)+fib_mem(n-2,mem);
        return mem[n]=ans;
    }
    public static int fib_tab(int n){
        int[] mem=new int[n+1];
        for(int i=0; i<mem.length; i++){
            if(i==0 || i==1){
                mem[i]=i;
            }else{
                mem[i]=mem[i-1]+mem[i-2];
            }
        }
        return mem[n];
    }
    public static int fib_opt_tab(int n){
        if(n==0 || n==1){
            return n;
        }
        int first=0;
        int second=1;
        for(int i=2; i<=n; i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;
    }
}
