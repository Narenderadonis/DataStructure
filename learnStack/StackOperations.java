package learnStack;


public class StackOperations {

	public static void main(String[] args) {
		MyStack<Integer> stk=new MyStack<Integer>();
		stk.push(12);
		stk.push(13);
		stk.push(15);
		int peeked = stk.peek();
		System.out.println(peeked);
		int popped =stk.pop();
		System.out.println(popped);
		int peek=stk.peek();
		System.out.println(peek);
	}
}
