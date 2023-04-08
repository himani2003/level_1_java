public class paint_fence {
    public static void main(String[] args) {
        System.out.println(ways_dp(1,2));
    }
    public static int ways_dp(int n, int k){
        if(k<=1){
            return 0;
        }
        int[][] mem=new int[3][n+1];
        int nr=mem.length,nc=mem[0].length;
        for(int i=0; i<3; i++){
            mem[i][0]=0;
        }
        for(int c=1; c<nc; c++){
            for(int r=0; r<3; r++){
                if(c==1){
                    if(r==2){
                        mem[r][c]=k;
                    }else{
                        mem[r][c]=0;
                    }
                }else if(c==2){
                    if(r==0){
                        mem[r][c]=k;
                    }else if(r==1){
                        mem[r][c]=k*(k-1);
                    }else if(r==2){
                        mem[r][c]=mem[r-1][c]+mem[r-2][c];
                    }
                }else{
                    if(r==0){
                        mem[r][c]=mem[r+1][c-1];
                    }else if(r==1){
                        mem[r][c]=mem[r+1][c-1]*(k-1);
                    }else{
                        mem[r][c]=mem[r-1][c]+mem[r-2][c];
                    }
                }
            }
        }
        return mem[nr-1][nc-1];
    }
}
