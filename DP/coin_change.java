import java.util.Arrays;

public class coin_change {
    public static int coins_rec(int[] coins, int idx, int ssf, int tar){
        if(ssf>tar){
            return 0;
        }
        if(idx==coins.length){
            if(ssf==tar){
                return 1;
            }
            return 0;
        }
        return coins_rec(coins, idx+1, ssf, tar)+coins_rec(coins,idx,ssf+coins[idx],tar);
    }
    public static int coins_tab(int[] coins, int target){
        int[] mem=new int[target+1];
        Arrays.fill(mem,0);
        mem[0]=1;
        for(int i=0; i<coins.length; i++){
            int coin=coins[i];
            for(int j=1; j<mem.length; j++){
                if(coin<=j){
                    mem[j]+=mem[j-coin];
                }
            }
        }
        return mem[target];
    }
}
