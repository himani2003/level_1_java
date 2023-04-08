import java.util.ArrayList;

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.
public class GetStairPath {
    public static void main(String[] args) throws Exception {
        ArrayList<String> res=getStairPaths(3);
        for(String p: res){
            System.out.println(p);
        }
    }
    //Proactive code
    public static ArrayList<String> getStairPaths1(int n) {
        if(n==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myList= new ArrayList<>();
        if(n>=1){//1 len
            ArrayList<String> path=getStairPaths(n-1);
            for(String p:path){
                myList.add(1+p);
            }
        }
        if(n>=2){//2 len
            ArrayList<String> path=getStairPaths(n-2);
            for(String p:path){
                myList.add(2+p);
            }
        }
        if(n>=3){//3 len
            ArrayList<String> path=getStairPaths(n-3);
            for(String p:path){
                myList.add(3+p);
            }
        }
        return myList;
    }

    //Reactive code
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }
        ArrayList<String> myList= new ArrayList<>();
        ArrayList<String> path1=getStairPaths(n-1);
        ArrayList<String> path2=getStairPaths(n-2);
        ArrayList<String> path3=getStairPaths(n-3);
        for(String p:path1){
            myList.add(1+p);
        }
        for(String p:path2){
            myList.add(2+p);
        }
        for(String p:path3){
            myList.add(3+p);
        }
        return myList;
    }
}
