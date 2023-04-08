import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Basic_BT {
    public static class Node{
        int data;
        Node left, right;
        Node(int val){
            data=val;
            left=right=null;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node){
            this.node=node;
            this.state=0;
        }
    }
    public static Node construct(Integer[] arr){
        Node root=new Node(arr[0]);
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root));
        int i=1;
        while(st.size()>0){
            // Node node=new Node(arr[i]);
            // if(st.peek().state==0){
            //     //work for left
            //     st.peek().node.left=node;
            //     st.peek().state++;
            //     i++;
            //     st.push(new Pair(node));
            // }else if(st.peek().state==1){
            //     //work for right
            //     st.peek().node.right=node;
            //     st.peek().state++;
            //     i++;
            //     st.push(new Pair(node));
            // }else{
            //     //pop
            //     st.pop();
            // }

            Pair top=st.peek();
            if(top.state==0){
                Integer val=arr[i];
                if(val!=null){
                    Node child=new Node(val);
                    top.node.left=child;
                    st.push(new Pair(child));
                }
                top.state++;
                i++;
            }else if(top.state==1){
                Integer val=arr[i];
                if(val!=null){
                    Node child=new Node(val);
                    top.node.right=child;
                    st.push(new Pair(child));
                }
                top.state++;
                i++;
            }else if(top.state==2){
                st.pop();
            }
        }
        return root;
    }

    public static void display(Node node){
        if(node==null)return;
        System.out.println(node.left==null?".":node.left.data);
        System.out.println(" <- "+node.data+" -> ");
        System.out.println(node.right==null?".":node.right.data);

        display(node.left);
        display(node.right);
    }

    public static int size(Node node) {
        // write your code here
        if(node==null){
            return 0;
        }
        int res=0;
        int lsize=size(node.left);
        int rsize=size(node.right);
        res=lsize+rsize+1;
        return res;
      }
    
      public static int sum(Node node) {
        // write your code here
        if(node==null){
            return 0;
        }
        int res=node.data;
        int lsum=sum(node.left);
        int rsum=sum(node.right);
        res=res+lsum+rsum;
        return res;
      }
    
      public static int max(Node node) {
        // write your code here
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int ml=max(node.left);
        int mr=max(node.right);
        return Math.max(node.data,Math.max(ml,mr));
      }
    
      public static int height(Node node) {
        // write your code here
        if(node==null){
            return -1;
        }
        int lheight=height(node.left);
        int rheight=height(node.right);
        return Math.max(lheight,rheight)+1;
      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
          if (values[i].equals("n") == false) {
            arr[i] = Integer.parseInt(values[i]);
          } else {
            arr[i] = null;
          }
        }
    
        Node root = construct(arr);
    
        int size = size(root);
        int sum = sum(root);
        int max = max(root);
        int ht = height(root);
        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(ht);
      }
}
