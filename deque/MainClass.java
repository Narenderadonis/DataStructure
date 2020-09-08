package deque;

public class MainClass {

	public static void main(String[] args) {
		MyDeque<Integer> md=new MyDeque<>();
		md.addToHead(12);
		md.addToHead(23);
		md.addToHead(45);
		System.out.println(md.removeLast());
	}

}
