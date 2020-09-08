package learnStack;

import linkedList.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ll=new MyLinkedList();
	void push(E e) {
			
			ll.addEnd(e);
		}
	
	E pop() {
		return ll.removeLast();
	}
	E peek() {
		return ll.getLast();
	}

	}

