public class arrange_buildings {
    public static int arrange(int n){
        int[][] mem=new int[2][n+1];
        int nr=2, nc=n+1;
        for(int c=0; c<nc; c++){
            for(int r=0; r<nr; r++){
                if(c==0){
                    mem[r][c]=0;
                }else if(c==1){
                    mem[r][c]=1;
                }else{
                    if(r==0){
                        mem[r][c]=mem[1][c-1];
                    }else{
                        mem[r][c]=mem[0][c-1]+mem[1][c-1];
                    }
                }
            }
        }
        int ans=mem[0][nc-1]+mem[1][nc-1];
        return ans*ans;
    }
}
