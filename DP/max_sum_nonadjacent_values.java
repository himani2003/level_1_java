public class max_sum_nonadjacent_values {
    public static int max_dp(int[] arr){
        int[][] mem=new int[2][arr.length];
        int nr=2, nc=mem[0].length;
        for(int c=0; c<nc; c++){
            int ele=arr[c];
            for(int r=0; r<nr; r++){
                if(r==0 && c==0){
                    mem[r][c]=0;
                }else if(c==0 && r==1){
                    mem[r][c]=ele;
                }
                else{
                    if(r==0){
                        mem[r][c]=Math.max(mem[0][c-1],mem[1][c-1]);
                    }else{
                        mem[r][c]=mem[0][c-1]+ele;
                    }
                }
            }
        }
        return Math.max(mem[0][nc-1],mem[1][nc-1]);
    }
}
