import java.util.Arrays;

public class paint_house_many_colors {
    //approach-1 with tc=n^3
    public static int paint_dp(int[][] arr){
        int nr=arr.length, nc=arr[0].length;
        int[][] mem=new int[nr][nc];
        for(int r=0; r<nr; r++){
            for(int c=0; c<nc; c++){
                if(r==0){
                    mem[r][c]=arr[r][c];
                }else{
                    mem[r][c]=arr[r][c]+min_val(mem,mem[r-1][c],r-1,nc);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nc; i++){
            if(min>mem[nr-1][i]){
                min=mem[nr-1][i];
            }
        }
        return min;
    }
    public static int min_val(int[][] mat, int ele, int r, int nc){
        int[] arr=new int[nc];
        for(int i=0; i<nc; i++){
            arr[i]=mat[r][i];
        }
        Arrays.sort(arr);
        int ans=arr[0];
        if(ans==ele){
            ans=arr[1];
        }
        return ans;
    }
    //approach-2
    public static int paint_many_optdp(int[][] cost){
        int nr=cost.length, nc=cost[0].length;
        int[][] mem=new int[nr][nc];
        int min=0, smin=0;
        for(int r=0; r<nr; r++){
            for(int c=0; c<nc; c++){
                if(r==0){
                    mem[r][c]=cost[r][c];
                }else{
                    int val=c==min?mem[r][smin]:mem[r][min];
                    mem[r][c]=cost[r][c]+val;
                }
                if(mem[r][min]>=mem[r][c]){
                    smin=min;
                    min=c;
                }else if(mem[r][c]<=mem[r][smin]){
                    smin=c;
                }
            }
        }
        return mem[nr-1][min];
    }
}
