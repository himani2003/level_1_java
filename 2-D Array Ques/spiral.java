import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int nr=scn.nextInt();
        int nc=scn.nextInt();
        int[][] mat=new int[nr][nc];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                mat[i][j]=scn.nextInt();
            }
        }
        move(mat);
    }

    public static void move(int[][] mat){
        int nr=mat.length, nc=mat[0].length;
        int rmin=0, cmin=0, rmax=nr-1, cmax=nc-1, count=0;
        while(count<nr*nc){
            //left wall
            for(int r=rmin; r<=rmax && count<nr*nc; r++){
                System.out.println(mat[r][cmin]);
                count++;
            }
            //bottom wall
            for(int c=cmin+1; c<=cmax && count<nr*nc; c++){
                System.out.println(mat[rmax][c]);
                count++;
            }
            //right wall
            for(int r=rmax-1; r>=rmin && count<nr*nc; r--){
                System.out.println(mat[r][cmax]);
                count++;
            }
            //top wall
            for(int c=cmax-1; c>=cmin+1 && count<nr*nc; c--){
                System.out.println(mat[rmin][c]);
                count++;
            }
            rmax--;
            rmin++;
            cmax--;
            cmin++;
        }
    }
}
