package linkedList;

import java.util.Scanner;
public class MyLinkedList<E> {
	
	
	NODE<E> head;
	public void addFront(E data) {
		NODE<E> toAdd = new NODE<E>(data);
		toAdd.next=head;
		head = toAdd;
	}
	void addBtwn(E data) {
		NODE<E> toAdd = new NODE<E>(data);
		NODE<E> temp=head;
		int count =1;
		System.out.println("Enter the position at which you want to insert the node");
		Scanner sc= new Scanner(System.in);
		int position=sc.nextInt();
		while(count<=position-1) {
			temp=temp.next;
			count++;
		}
		NODE<E> current=temp.next;
		temp.next=toAdd;
		toAdd.next=current;
		
	}
	public void addEnd(E data) {
		NODE<E> toAdd = new NODE<E>(data);
		if(head==null) {
			head=toAdd;
			return;
		}
		NODE<E> temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	public E removeLast() {
		NODE <E> temp = head;
		if(temp.next==null) {
			NODE<E> toRemove = head;
			head = null;
			return toRemove.data;
			
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		NODE<E> toRemove= temp.next;
		temp.next=null;
		return toRemove.data;
	}
	public E getLast() {
		NODE<E> temp = head;
		if(head==null) {
			System.out.println("Empty Stack");
		}
		if(head.next==null) {
			return head.data;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
	}
	void print() {
		NODE<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static class NODE<E>{
		public E data;
		public NODE<E> next;
		public  NODE(E data) {
			this.data=data;
			next=null;
		}
	}
	

}
