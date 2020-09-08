package linkedList;
public class Linked {
	public static void main(String[] args) {
		MyLinkedList<Integer> mll=new MyLinkedList<>();
		MyLinkedList<String> mll1=new MyLinkedList<>();
		mll1.addEnd("hello");
		mll1.addEnd("What's up?");
		mll1.addBtwn(" hi ");
		mll.addFront(2);
//		mll.addFront(1);
//	    mll.addFront(0);
//		mll.addEnd(1);
    	//mll.addEnd(2);
//		mll.addEnd(3);
//		mll.addEnd(4);
//		mll.addEnd(6);
//		mll.addBtwn(5);
		mll1.print();
}
}
