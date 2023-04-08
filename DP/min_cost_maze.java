import java.util.Scanner;

public class min_cost_maze {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] mat=new int[n][m];
        System.out.println(min_cost_tab(mat));
    }
    public static int min_cost_tab(int[][] mat){
        int nr=mat.length; int nc=mat[0].length;
        int[][] mem=new int[nr][nc];
        for(int r=nr-1; r>=0; r--){
            for(int c=nc-1; c>=0; c--){
                if(r==nc-1 && c==nr-1){
                    mem[r][c]=mat[r][c];
                }
                else if(r==nr-1){
                    mem[r][c]=mem[r][c+1]+mat[r][c];
                }else if(c==nc-1){
                    mem[r][c]=mem[r+1][c]+mat[r][c];
                }else{
                    mat[r][c]=Math.min(mem[r+1][c],mem[r][c+1])+mat[r][c];
                }
            }
        }
        return mem[0][0];
    }
}
