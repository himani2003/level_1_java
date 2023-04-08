public class goldmine {
    public static int max_gold(int[][] mat){
        int nr=mat.length, nc=mat[0].length;
        int[][] mem=new int[nr][nc];
        for(int c=nc-1; c>=0; c--){
            for(int r=nr-1; r>=0; r--){
                if(c==nc-1){
                    mem[r][c]=mat[r][c];
                }else if(r==nr-1){
                    mem[r][c]=Math.max(mem[r][c+1],mem[r-1][c+1])+mat[r][c];
                }else if(r==0){
                    mem[r][c]=Math.max(mem[r][c+1],mem[r+1][c+1]);
                }else{
                    mem[r][c]=Math.max(mem[r][c+1],Math.max(mem[r+1][c+1],mem[r-1][c+1]));
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nr; i++){
            if(max<mem[i][0]){
                max=mem[i][0];
            }
        }
        return max;
    }
}
