public class knapsack_1 {
    public static int knap_rec(int[] val, int[] wt, int idx, int ssf, int target, int ans){
        if(ssf>target){
            return 0;
        }
        if(idx==wt.length){
            if(ssf==target){
                return ans;
            }
            return 0;
        }
        int inc=knap_rec(val, wt, idx+1, ssf+wt[idx], target, ans+val[idx]);
        int exc=knap_rec(val, wt, idx+1, ssf, target, ans);
        return Math.max(inc,exc);
    }
    public static int knap_tab(int[] val, int[] wt,int target){
        int n=val.length;
        int[][] mem=new int[n+1][target+1];
        int nr=mem.length, nc=mem[0].length;
        for(int r=0; r<nr; r++){
            for(int c=0; c<nc; c++){
                if(r==0 || c==0){
                    mem[r][c]=0;
                }else{
                    int ans=mem[r-1][c];
                    if(val[r-1]<=c){
                        ans=Math.max(ans,wt[r-1]+mem[r-1][c-val[r-1]]);
                    }
                    mem[r][c]=ans;
                }
            }
        }
        return mem[nr-1][nc-1];
    }
}
