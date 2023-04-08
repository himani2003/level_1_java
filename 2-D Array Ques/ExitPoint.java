// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

import java.util.Scanner;
public class ExitPoint {
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
        int r=0, c=0, dir=0;
        while(r>=0 && r<nr && c>=0 && c<nc){
            dir=(dir+mat[r][c])%4;
            if(dir==0){
                c=c+1;
            }
            else if(dir==1){
                r=r+1;
            }
            else if(dir==2){
                c=c-1;
            }
            else if(dir==3){
                r=r-1;
            }
        }
        if(dir==0){
            c=c-1;
        }
        else if(dir==1){
            r=r-1;
        }
        else if(dir==2){
            c=c+1;
        }
        else if(dir==3){
            r=r+1;
        }
        System.out.println(r);
        System.out.println(c);
    }
}
