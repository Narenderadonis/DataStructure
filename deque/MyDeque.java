package deque;
public class MyDeque<E> {
	public static class NODE<E>{
		E data;
		NODE<E> next,prev;
		public NODE(E data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
		NODE<E> head,tail;
		public void addToHead(E e) {
		NODE<E> toAdd =new NODE<>(e);
		if(head==null) {
			head=tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
		}
		public E removeLast() {
			if(head==null) {
				return null;
			}
			NODE<E> temp = tail;
			tail=tail.next;
			if(tail==null) {
				head=null;
			}
			tail.prev=null;
			return temp.data;
		}
		
	}