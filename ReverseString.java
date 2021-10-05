/*Reverse String (100 Marks)
Given a string, revese it with the help of stack. Please do not use direct function available in the respective library*/

public class Main
{
    char[] arr;
    static int topstack;
    Main(int size) {
        this.arr = new char[size];
        this.topstack = -1;
    }
    public boolean isEmpty() {
        if(topstack == -1) return true;
        else return false;
    }
    public boolean isFull() {
        if(topstack == arr.length) return true;
        else return false;
    }
    public void push(char val) {
        if(isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            arr[topstack+1] = val;
            topstack ++;
        }
    }
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return '0';
        }
        else {
             char temp = arr[topstack];
             topstack--;
             return temp;
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
		Main mn = new Main(str.length());
		for(int i=0; i<str.length(); i++) {
		    mn.push(str.charAt(i));
		}
		while(topstack != -1) {
		    System.out.print(mn.pop());
		}
		
	}
}
