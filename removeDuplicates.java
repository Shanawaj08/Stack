/*Vedant Hates Consecutive (100 Marks)
Vedant is one of the few people who hates strange things. Vedant hates to see the duplicate consecutive strings. 
His enemies know this very well and are planning to tease him. You are his best friend and donâ€™t want to see him irritated. 
The plan is to provide him with a set of strings(lowercase) including the hateful strings and he has to tell the number of strings after the removal of hateful strings. 
The set of strings will be provided to you to hand over to Vedant. You are his friend and want to help him. 
You have a plan to remove all the hateful strings and present the final set to Vedant and he has to only tell the number of strings.*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
		    int n1 = sc.nextInt();
		    sc.nextLine();
		    for(int j=0; j<n1; j++) {
		        String val = sc.next();
		        if(! myStack.isEmpty() && val.equals(myStack.peek())) {
		            myStack.pop();
		            count--;
		        }
		        else {
		        myStack.push(val);
		        count++;
		        }
		    }
		    //while(! myStack.isEmpty()) System.out.println(myStack.pop());
		    System.out.println(count);
		    while(! myStack.isEmpty()) myStack.pop();
		    count = 0;
		    
		}
		
	}
}
