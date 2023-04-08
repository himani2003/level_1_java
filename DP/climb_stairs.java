import java.util.Scanner;

public class climb_stairs {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
    }
    public static int climb_rec(int n){
        if(n==0){
            return 1;
        }
        int ans1=0,ans2=0,ans3=0;
        if(n>=1){
            ans1=climb_rec(n-1);
        }
        if(n>=2){
            ans2=climb_rec(n-2);
        }
        if(n>=3){
            ans3=climb_rec(n-3);
        }
        return ans1+ans2+ans3;
    }
    public static int climb_opt(int n){
        if(n==0 || n==1){
            return 1;
        }
        if(n==2) return 2;
        int f=1;
        int s=1;
        int t=2;
        for(int i=3; i<=n; i++){
            int temp=f+s+t;
            f=s;
            s=t;
            t=temp;
        }
        return t;
    }
}
