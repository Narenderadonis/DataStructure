package learnQueue;
public class MyQueue<E> {
	private NODE<E> head ,rear;
	public void Enqueue(E e) {
		NODE<E> toAdd=new NODE<>(e);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		rear.next=toAdd;
		rear=rear.next;
	}
	public E Dequeue() {
		NODE<E> temp=head;
		if(head==null) {
			return null;
		}
		head=head.next;
		if(head==null) {
			rear=null;
		}
		return temp.data;
		
	}


public static class NODE<E>{
	 E data;
	 NODE<E> next;
	public  NODE(E data) {
		this.data=data;
		next=null;
	}
}
}
