import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

// package Stacks and Queues Ques;

public class Basicsq {
    public static void stackIntro(){
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        System.out.println(st.size()+" : "+st);
        st.push(20);
        System.out.println(st.size()+" : "+st);
        st.push(30);
        System.out.println(st.size()+" : "+st);
        st.push(40);
        System.out.println(st.size()+" : "+st);
        st.push(50);
        System.out.println(st.size()+" : "+st);
        for(int ele: st){
            System.out.print(ele+"->");
        }
        System.out.println();
        System.out.println(st.pop()+" - "+st);
        System.out.println(st.peek()+" - "+st);
    }
    public static void queueIntro(){
        Queue<Integer> queue=new ArrayDeque<>();
        System.out.println(queue+" : "+queue.size());
        queue.add(10);
        System.out.println(queue+" : "+queue.size());
        queue.add(20);
        System.out.println(queue+" : "+queue.size());
        queue.add(30);
        System.out.println(queue+" : "+queue.size());
        queue.add(40);
        System.out.println(queue+" : "+queue.size());
        System.out.println(queue.remove()+"<->"+queue+" : "+queue.size());
        System.out.println(queue.peek()+"<->"+queue+" : "+queue.size());
        for(int ele:queue){
            System.out.print(ele+"->");
        }
    }
    public static void main(String[] args) {
        stackIntro();
        queueIntro();
    }
}
