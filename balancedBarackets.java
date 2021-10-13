/*Balanced Brackets (100 Marks)
A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. 
There are three types of matched pairs of brackets: [], {}, and ().
A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
For example, {[(])}is not balanced because the contents in between { and } are not balanced. 
The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, printYES on a new line; otherwise, print NO on a new line.*/

import java.util.*;
public class Main
{
    public String balancedBrackets(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            }
            else {
                if(stack.isEmpty()) return "NO";
                else if(stack.peek() == '[' && str.charAt(i) == ']' || stack.peek() == '(' && str.charAt(i) == ')' || stack.peek() == '{' && str.charAt(i) == '}') {
                    stack.pop();
                }
                else return "NO";
            }
        }
        return "YES";
    }
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
		    String str = sc.next();
		    System.out.println(mn.balancedBrackets(str));
		}
	}
}
