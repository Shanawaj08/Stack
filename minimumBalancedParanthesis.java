/*Minimum expression balanced 
Given an expression with only } and { . The expression may not be balanced. Find minimum number of bracket reversals to make the expression balance*/

import java.util.*;
public class Main
{
    public int minimumBalancedParanthesis(String exp) {
        char ch;
        int count = 0;
        Stack<Character> st = new Stack<Character>();
        if(exp.length()%2 != 0) return 0;
        for(int i=0; i<exp.length(); i++) {
            ch = exp.charAt(i);
            if(ch=='}' && !st.isEmpty()) {
                if(st.peek() == '{')
                st.pop();
                else st.push(ch);
            }
            else {
                st.push(ch);
            }
            
        }
        int len = st.size();
            while(!st.isEmpty() && st.peek() == '{') {
                st.pop();
                count++;
            }
        return (len/2 + count%2);
    }
	public static void main(String[] args) {
	    Main mn = new Main();
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    System.out.println(mn.minimumBalancedParanthesis(str));
		
	}
}
