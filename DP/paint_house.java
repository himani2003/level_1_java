public class paint_house {
    public static int paint_dp(int[][] arr){
        int nr=arr.length, nc=arr[0].length;
        int[][] mem=new int[nr][nc];
        int min=Integer.MAX_VALUE;
        for(int r=0; r<nr; r++){
            for(int c=0; c<nc; c++){
                if(r==0){
                    mem[r][c]=arr[r][c];
                }else{
                    if(c==0){
                        mem[r][c]=arr[r][c]+Math.min(mem[r-1][1],mem[r-1][2]);
                    }else if(c==1){
                        mem[r][c]=arr[r][c]+Math.min(mem[r-1][0],mem[r-1][2]);
                    }else{
                        mem[r][c]=arr[r][c]+Math.min(mem[r-1][1],mem[r-1][0]);
                    }
                }
            }
        }
        for(int i=0; i<nc; i++){
            if(min>mem[nr-1][i]){
                min=mem[nr-1][i];
            }
        }
        return min;
    }
}
