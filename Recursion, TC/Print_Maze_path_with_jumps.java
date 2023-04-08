public class Print_Maze_path_with_jumps {
    public static void main(String[] args) throws Exception {

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        if(sc+1<=dc) printMazePaths(sr, sc+1, dr, dc, psf+"h"); //h
        if(sr+1<=dr && sc+1<=dc) printMazePaths(sr+1, sc+1, dr, dc, psf+"d"); //d
        if(sr+1<=dr) printMazePaths(sr+1, sc, dr, dc, psf+"v"); //v
    }
}
