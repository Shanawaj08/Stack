/*Reverse Number 
Given a number, reverse it with the help of stack. Please do not use direct function available in the respective library.*/

import java.util.*;
public class Main
{
    public void reverseNumbers(long num) {
        Stack<Character> st = new Stack<Character>();
        String str = Long.toString(num);
        for(int i=0; i<str.length(); i++) {
            st.push(str.charAt(i));
            
        }
        while(!st.isEmpty()) System.out.print(Character.getNumericValue(st.pop()));
    }
	public static void main(String[] args) {
	    Main mn = new Main();
	    Scanner sc = new Scanner(System.in);
	    long num = sc.nextLong();
	    mn.reverseNumbers(num);
		
	}
}

