/*Balanced Parentheses
Given an expression as string, check whether the parenthesis are balanced or not. If balanced, return true else return false.*/

import java.util.*;
public class Main
{
    public int balancedParanthesis(String exp) {
        char ch;
        Stack<Character> st = new Stack<Character>();
        if(exp.length()==1) return 0;
        for(int i=0; i<exp.length(); i++) {
            ch = exp.charAt(i);
            if(ch=='{' || ch=='(' || ch=='[') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return 0;
                else if(st.peek() == '{' && ch == '}' || st.peek() == '(' && ch == ')' || st.peek() == '[' && ch == ']')
                st.pop();
                else return 0;
            }
            
        }
        return 1;
    }
	public static void main(String[] args) {
	    Main mn = new Main();
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    System.out.println(mn.balancedParanthesis(str));
		
	}
}
