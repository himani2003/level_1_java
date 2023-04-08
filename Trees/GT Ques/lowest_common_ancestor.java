import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class lowest_common_ancestor {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
      }
    
      public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
          str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
    
        for (Node child : node.children) {
          display(child);
        }
      }
    
      public static Node construct(int[] arr) {
        Node root = null;
    
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == -1) {
            st.pop();
          } else {
            Node t = new Node();
            t.data = arr[i];
    
            if (st.size() > 0) {
              st.peek().children.add(t);
            } else {
              root = t;
            }
    
            st.push(t);
          }
        }
    
        return root;
      }
    
      public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        if (node.data == data) {
          ArrayList<Integer> path = new ArrayList<>();
          path.add(node.data);
          return path;
        }
    
        for (Node child : node.children) {
          ArrayList<Integer> ptc = nodeToRootPath(child, data);
          if (ptc.size() > 0) {
            ptc.add(node.data);
            return ptc;
          }
        }
    
        return new ArrayList<>();
      }
    
      public static int lca(Node node, int d1, int d2) {
        // write your code here
        ArrayList<Integer> path1=nodeToRootPath(node, d1);
        ArrayList<Integer> path2=nodeToRootPath(node, d2);

        //aage se piche
        // for(int i=0; i<path1.size(); i++){
        //     for(int j=0; j<path2.size(); j++){
        //         if(path1.get(i)==path2.get(j)){
        //             return path1.get(i);
        //         }
        //     }
        // }
        // return 0;

        //piche se aage
        int i=path1.size()-1;
        int j=path2.size()-1;
        while(i>=0 || j>=0){
            int v1=i>=0?path1.get(i):Integer.MAX_VALUE;
            int v2=j>=0?path2.get(j):Integer.MAX_VALUE;
            if(v1==v2){
                i--;
                j--;
            }else{break;}
        }
        return path1.get(i+1);
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
          arr[i] = Integer.parseInt(values[i]);
        }
    
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
    
        Node root = construct(arr);
        int lca = lca(root, d1, d2);
        System.out.println(lca);
        // display(root);
      }
}
