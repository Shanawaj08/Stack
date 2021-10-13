/*Maximum Element 
You have an empty sequence, and you will be given queries. Each query is one of these three types:
1 x - Push the element x into the stack.
2 - Delete the element present at the top of the stack.
3 - Print the maximum element in the stack.

Input Format
The first line of input contains an integer, . The next lines each contain an above mentioned query. (It is guaranteed that each query is valid.)*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int n = sc.nextInt();
		int max = 0;
        for(int i=0; i<n; i++) {
           int op = sc.nextInt();
           if(op == 1) {
               int val = sc.nextInt();
               st.push(val);
           }
           else if(op == 2) {
               if(!st.isEmpty()) st.pop();
               else continue;
                
           }
           else if(op == 3) {
               while(!st.isEmpty()) {
                  int temp = st.peek();
                  //System.out.println(temp);
                  if(temp>max) {
                      max = temp;
                      st.pop();
                  }
                  else st.pop();
                  
               }
               System.out.println(max);
               
           }
           else System.out.println("invalid operation");
       }
		
	}
}
