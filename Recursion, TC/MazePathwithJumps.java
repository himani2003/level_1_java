import java.util.ArrayList;

// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
public class MazePathwithJumps {
    public static void main(String[] args) throws Exception {
        ArrayList<String> res=getMazePaths(0, 0, 1, 1);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc>dc || sr>dr){
            ArrayList<String> base=new ArrayList<>(); 
            return base;
        }
        if(sc==dc && sr==dr){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> mylist=new ArrayList<>();
        //H jumps
        for(int i=1; sc+i<=dc; i++){
            ArrayList<String> hpath= getMazePaths(sr, sc+i, dr, dc);
            for(String p:hpath){
                mylist.add("h"+i+p);
            }
        }
        for(int i=1; sr+i<=dr; i++){
            ArrayList<String> vpath= getMazePaths(sr+i, sc, dr, dc);
            for(String p:vpath){
                mylist.add("v"+i+p);
            }
        }
        for(int i=1; sr+i<=dr && sc+i<=dc; i++){
            ArrayList<String> dpath= getMazePaths(sr+i, sc+i, dr, dc);
            for(String p:dpath){
                mylist.add("d"+i+p);
            }
        }

        return mylist;
    }
}
