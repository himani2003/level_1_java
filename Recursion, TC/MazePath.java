import java.util.ArrayList;
// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - to get the list of all paths that can be used to move from top-left to bottom-right.
public class MazePath {
    public static void main(String[] args) throws Exception {
        ArrayList<String> res=getMazePaths(0, 0, 2, 2);
        for(String p: res){
            System.out.println(p);
        }
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
        ArrayList<String> hpath= getMazePaths(sr, sc+1, dr, dc);//H movement
        ArrayList<String> vpath= getMazePaths(sr+1, sc, dr, dc);//V movement

        ArrayList<String> mylist=new ArrayList<>();
        for(String p:hpath){
            mylist.add("h"+p);
        }
        for(String p:vpath){
            mylist.add("v"+p);
        }
        return mylist;
    }
}
