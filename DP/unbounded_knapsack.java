import java.util.Arrays;

public class unbounded_knapsack {
    public static void main(String[] args) {
        int n=5;
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int cap=7;
        System.out.println(unbounded_knap_tab(val, wt, n, cap));
    }
    public static int unbounded_knap_rec(int n, int[] val, int[] wt, int cap, int idx, int ssf, int ans){
        if(ssf>cap){
            return 0;
        }
        if(idx==n){
            if(ssf==cap){
                return ans;
            }
            return 0;
        }
        int a1=unbounded_knap_rec(n, val, wt, cap, idx+1, ssf, ans);
        int a2=unbounded_knap_rec(n, val, wt, cap, idx, ssf+wt[idx], ans+val[idx]);
        return Math.max(a1,a2);
    }
    public static int unbounded_knap_tab(int[] val, int[] wt, int n, int cap){
        int[] mem=new int[cap+1];
        Arrays.fill(mem,0);
        for(int i=0; i<n; i++){
            int v=val[i];
            int w=wt[i];
            for(int j=0; j<mem.length; j++){
                if(j>=w){
                    int inc=v+mem[j-w];
                    mem[j]=Math.max(inc,mem[j]);
                }
            }
        }
        return mem[mem.length-1];
    }
}
