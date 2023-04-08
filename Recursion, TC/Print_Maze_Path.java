import java.util.Scanner;

public class Print_Maze_Path {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //valid
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        //invalid
        if(sr>dr || sc>dc){
            return;
        }
        printMazePaths(sr, sc+1, dr, dc, psf+"h"); //h
        printMazePaths(sr+1, sc, dr, dc, psf+"v"); //v     
    }
}
