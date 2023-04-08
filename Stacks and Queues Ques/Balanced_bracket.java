import java.util.Scanner;
import java.util.Stack;

// 1. You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false
public class Balanced_bracket {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String exp=scn.nextLine();
        boolean flag=balanced(exp);
        System.out.println(flag);
    }
    static boolean balanced(String exp){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch=exp.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='{'){
                    st.pop();
                }
            }
            else if(ch==']'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='['){
                    st.pop();
                }
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
    }
}
